package com.akuacom.pss2.richsite.event;

import java.util.Date;
import org.apache.log4j.Logger;
import com.akuacom.pss2.core.ErrorUtil;
import com.akuacom.pss2.event.Event;
import com.akuacom.pss2.richsite.FDUtils;
import com.akuacom.pss2.util.EventUtil;

public class EventTestScheduleDispatcher extends AbstractEventScheduleDispatcher {
	private static final long serialVersionUID = -3331438914928201582L;

	private static final Logger log = Logger.getLogger(EventTestScheduleDispatcher.class.getName());

	/**
	 * Function for get JSF presentation layer request and handler
	 * 
	 * Validation Logic: Event participant list can not be empty Participant
	 * which contain empty client can not be involved If the validation pass,
	 * create the event and return to the event display page If the validation
	 * not pass, return the original page and display the validation message
	 * 
	 * @param eventDataModel
	 * @param manager
	 * @return
	 */
	public String dispatchEvent(EventDataModel eventDataModel,EventDataModelManager manager) {
		String programName ="";
		try {
			startTimeValidation(eventDataModel);
			endTimeValidation(eventDataModel);
			eventDataModel.setEventName(EventUtil.getEventName());
			eventDataModel.confirmEventParticipantList();
			participantsEmptyValidation(eventDataModel, manager);
			eventDataModel.setReceivedTime(new Date());
			eventDataModel.setIssuedTime(new Date());
			eventDataModel.setManual(true);
			Event event = manager.transferEventDataModelToEvent(eventDataModel);
			programName = event.getProgramName();
			manager.getEventManager().createEvent(eventDataModel.getProgramName(), event);
			addEventLog(true, programName, getWelcomeName(), null);
			eventDataModel.setRenewFlag(true);
			manager.setFlag_GoToParent(true);
			return manager.goToEventDisplayListPage();
		} catch (Exception e) {
			final String s = ErrorUtil.getErrorMessage(e);
			manager.addMsgError(s);
//			log.error("pss2.event.create.creationError: " + s);
			addEventLog(false, programName, getWelcomeName(), e);
			eventDataModel.setRenewFlag(false);
			return "validateNotPass_TestSchedulePage";
		}
	}
}