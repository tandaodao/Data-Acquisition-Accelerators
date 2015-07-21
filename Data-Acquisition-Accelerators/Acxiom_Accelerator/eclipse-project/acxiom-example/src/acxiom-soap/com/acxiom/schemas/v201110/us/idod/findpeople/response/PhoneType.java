//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-07/05/2013 05:22 AM(foreman)-)
//


package com.acxiom.schemas.v201110.us.idod.findpeople.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NXXType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FraudMsgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestrictedUseCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneType", propOrder = {
    "areaCode",
    "phoneNumber",
    "nxxType",
    "fraudMsgCode",
    "restrictedUseCode",
    "sourceCode"
})
@XmlSeeAlso({
    IndividualAddressPhoneType.class,
    IndividualPhoneType.class
})
public class PhoneType {

    @XmlElement(name = "AreaCode")
    protected String areaCode;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "NXXType")
    protected String nxxType;
    @XmlElement(name = "FraudMsgCode")
    protected String fraudMsgCode;
    @XmlElement(name = "RestrictedUseCode")
    protected Long restrictedUseCode;
    @XmlElement(name = "SourceCode")
    protected Long sourceCode;

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the nxxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNXXType() {
        return nxxType;
    }

    /**
     * Sets the value of the nxxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNXXType(String value) {
        this.nxxType = value;
    }

    /**
     * Gets the value of the fraudMsgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudMsgCode() {
        return fraudMsgCode;
    }

    /**
     * Sets the value of the fraudMsgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudMsgCode(String value) {
        this.fraudMsgCode = value;
    }

    /**
     * Gets the value of the restrictedUseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRestrictedUseCode() {
        return restrictedUseCode;
    }

    /**
     * Sets the value of the restrictedUseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRestrictedUseCode(Long value) {
        this.restrictedUseCode = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceCode(Long value) {
        this.sourceCode = value;
    }

}