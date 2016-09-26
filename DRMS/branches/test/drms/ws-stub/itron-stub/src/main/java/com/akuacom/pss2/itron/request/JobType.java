//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.20 at 11:04:58 AM CST 
//


package com.akuacom.pss2.itron.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for JobType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="Message" type="{}MessageType"/>
 *             &lt;element name="Contact" type="{}ContactType"/>
 *             &lt;element name="Block" type="{}BlockType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobType", propOrder = {
    "userReference",
    "command",
    "messageAndContactAndBlock"
})
@XmlRootElement(name = "Job")
public class JobType {

    @XmlElement(name = "UserReference", required = true)
    protected String userReference;
    @XmlElement(name = "Command", required = true)
    protected String command;
    @XmlElements({
        @XmlElement(name = "Contact", type = ContactType.class),
        @XmlElement(name = "Block", type = BlockType.class),
        @XmlElement(name = "Message", type = MessageType.class)
    })
    protected List<Object> messageAndContactAndBlock;

    /**
     * Gets the value of the userReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserReference() {
        return userReference;
    }

    /**
     * Sets the value of the userReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserReference(String value) {
        this.userReference = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the messageAndContactAndBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageAndContactAndBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageAndContactAndBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * {@link BlockType }
     * {@link MessageType }
     * 
     * 
     */
    public List<Object> getMessageAndContactAndBlock() {
        if (messageAndContactAndBlock == null) {
            messageAndContactAndBlock = new ArrayList<Object>();
        }
        return this.messageAndContactAndBlock;
    }

}