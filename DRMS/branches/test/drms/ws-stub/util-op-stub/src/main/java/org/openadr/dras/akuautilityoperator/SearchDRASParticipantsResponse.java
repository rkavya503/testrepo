/*
 * www.akuacom.com - Automating Demand Response
 * 
 * org.openadr.dras.akuautilityoperator.SearchDRASParticipantsResponse.java - Copyright(c)1994 to 2010 by Akuacom . All rights reserved. 
 * Redistribution and use in source and binary forms, with or without modification, is prohibited.
 *
 */

package org.openadr.dras.akuautilityoperator;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openadr.dras.akuadrasclientdata.AkuaDRASSearchHandler;
import org.openadr.dras.participantaccount.ListOfParticipantAccounts;


/**
 * <p>Java class for SearchDRASParticipantsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchDRASParticipantsResponse">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="searchHandler" type="{http://www.openadr.org/DRAS/AkuaDRASClientData}AkuaDRASSearchHandler" minOccurs="0"/>
 * &lt;element name="participantAccounts" type="{http://www.openadr.org/DRAS/ParticipantAccount}ListOfParticipantAccounts" minOccurs="0"/>
 * &lt;element name="returnValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDRASParticipantsResponse", propOrder = {
    "searchHandler",
    "participantAccounts",
    "returnValue"
})
public class SearchDRASParticipantsResponse
    implements Serializable
{

    /** The search handler. */
    @XmlElement(nillable = true)
    protected AkuaDRASSearchHandler searchHandler;
    
    /** The participant accounts. */
    @XmlElement(nillable = true)
    protected ListOfParticipantAccounts participantAccounts;
    
    /** The return value. */
    @XmlElement(required = true)
    protected String returnValue;

    /**
     * Gets the value of the searchHandler property.
     * 
     * @return the search handler
     * 
     * possible object is
     * {@link AkuaDRASSearchHandler }
     */
    public AkuaDRASSearchHandler getSearchHandler() {
        return searchHandler;
    }

    /**
     * Sets the value of the searchHandler property.
     * 
     * @param value allowed object is
     * {@link AkuaDRASSearchHandler }
     */
    public void setSearchHandler(AkuaDRASSearchHandler value) {
        this.searchHandler = value;
    }

    /**
     * Gets the value of the participantAccounts property.
     * 
     * @return the participant accounts
     * 
     * possible object is
     * {@link ListOfParticipantAccounts }
     */
    public ListOfParticipantAccounts getParticipantAccounts() {
        return participantAccounts;
    }

    /**
     * Sets the value of the participantAccounts property.
     * 
     * @param value allowed object is
     * {@link ListOfParticipantAccounts }
     */
    public void setParticipantAccounts(ListOfParticipantAccounts value) {
        this.participantAccounts = value;
    }

    /**
     * Gets the value of the returnValue property.
     * 
     * @return the return value
     * 
     * possible object is
     * {@link String }
     */
    public String getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setReturnValue(String value) {
        this.returnValue = value;
    }

}