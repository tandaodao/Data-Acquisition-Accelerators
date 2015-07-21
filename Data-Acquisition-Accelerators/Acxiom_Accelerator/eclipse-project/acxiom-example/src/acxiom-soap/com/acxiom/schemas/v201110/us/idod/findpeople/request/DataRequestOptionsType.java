//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-07/05/2013 05:22 AM(foreman)-)
//


package com.acxiom.schemas.v201110.us.idod.findpeople.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	Note that PerformWatchListCheck has to be set for the IncludeWatchListDetails flag to have meaning.
 *       
 * 
 * <p>Java class for DataRequestOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataRequestOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AliasOptions" type="{http://schemas.acxiom.com/v201110/us/idod/findpeople/request}AliasOptionsType" minOccurs="0"/>
 *         &lt;element name="DeterminePreferredIndividual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeVerificationFlags" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableCBSA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeExpandedDeceasedInformation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NameAddressOptions" type="{http://schemas.acxiom.com/v201110/us/idod/findpeople/request}NameAddressOptionsType" minOccurs="0"/>
 *         &lt;element name="PerformWatchListCheck" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PerformWatchListCheckOnInput" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeWatchListDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PhoneOptions" type="{http://schemas.acxiom.com/v201110/us/idod/findpeople/request}PhoneOptionsType" minOccurs="0"/>
 *         &lt;element name="ReturnBestSsnOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataRequestOptionsType", propOrder = {
    "aliasOptions",
    "determinePreferredIndividual",
    "includeVerificationFlags",
    "enableCBSA",
    "includeExpandedDeceasedInformation",
    "nameAddressOptions",
    "performWatchListCheck",
    "performWatchListCheckOnInput",
    "includeWatchListDetails",
    "phoneOptions",
    "returnBestSsnOnly"
})
public class DataRequestOptionsType {

    @XmlElement(name = "AliasOptions")
    protected AliasOptionsType aliasOptions;
    @XmlElement(name = "DeterminePreferredIndividual", defaultValue = "false")
    protected boolean determinePreferredIndividual;
    @XmlElement(name = "IncludeVerificationFlags", defaultValue = "false")
    protected Boolean includeVerificationFlags;
    @XmlElement(name = "EnableCBSA", defaultValue = "false")
    protected boolean enableCBSA;
    @XmlElement(name = "IncludeExpandedDeceasedInformation", defaultValue = "false")
    protected boolean includeExpandedDeceasedInformation;
    @XmlElement(name = "NameAddressOptions")
    protected NameAddressOptionsType nameAddressOptions;
    @XmlElement(name = "PerformWatchListCheck", defaultValue = "false")
    protected boolean performWatchListCheck;
    @XmlElement(name = "PerformWatchListCheckOnInput", defaultValue = "false")
    protected Boolean performWatchListCheckOnInput;
    @XmlElement(name = "IncludeWatchListDetails", defaultValue = "false")
    protected Boolean includeWatchListDetails;
    @XmlElement(name = "PhoneOptions")
    protected PhoneOptionsType phoneOptions;
    @XmlElement(name = "ReturnBestSsnOnly", defaultValue = "false")
    protected boolean returnBestSsnOnly;

    /**
     * Gets the value of the aliasOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AliasOptionsType }
     *     
     */
    public AliasOptionsType getAliasOptions() {
        return aliasOptions;
    }

    /**
     * Sets the value of the aliasOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasOptionsType }
     *     
     */
    public void setAliasOptions(AliasOptionsType value) {
        this.aliasOptions = value;
    }

    /**
     * Gets the value of the determinePreferredIndividual property.
     * 
     */
    public boolean isDeterminePreferredIndividual() {
        return determinePreferredIndividual;
    }

    /**
     * Sets the value of the determinePreferredIndividual property.
     * 
     */
    public void setDeterminePreferredIndividual(boolean value) {
        this.determinePreferredIndividual = value;
    }

    /**
     * Gets the value of the includeVerificationFlags property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeVerificationFlags() {
        return includeVerificationFlags;
    }

    /**
     * Sets the value of the includeVerificationFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeVerificationFlags(Boolean value) {
        this.includeVerificationFlags = value;
    }

    /**
     * Gets the value of the enableCBSA property.
     * 
     */
    public boolean isEnableCBSA() {
        return enableCBSA;
    }

    /**
     * Sets the value of the enableCBSA property.
     * 
     */
    public void setEnableCBSA(boolean value) {
        this.enableCBSA = value;
    }

    /**
     * Gets the value of the includeExpandedDeceasedInformation property.
     * 
     */
    public boolean isIncludeExpandedDeceasedInformation() {
        return includeExpandedDeceasedInformation;
    }

    /**
     * Sets the value of the includeExpandedDeceasedInformation property.
     * 
     */
    public void setIncludeExpandedDeceasedInformation(boolean value) {
        this.includeExpandedDeceasedInformation = value;
    }

    /**
     * Gets the value of the nameAddressOptions property.
     * 
     * @return
     *     possible object is
     *     {@link NameAddressOptionsType }
     *     
     */
    public NameAddressOptionsType getNameAddressOptions() {
        return nameAddressOptions;
    }

    /**
     * Sets the value of the nameAddressOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAddressOptionsType }
     *     
     */
    public void setNameAddressOptions(NameAddressOptionsType value) {
        this.nameAddressOptions = value;
    }

    /**
     * Gets the value of the performWatchListCheck property.
     * 
     */
    public boolean isPerformWatchListCheck() {
        return performWatchListCheck;
    }

    /**
     * Sets the value of the performWatchListCheck property.
     * 
     */
    public void setPerformWatchListCheck(boolean value) {
        this.performWatchListCheck = value;
    }

    /**
     * Gets the value of the performWatchListCheckOnInput property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformWatchListCheckOnInput() {
        return performWatchListCheckOnInput;
    }

    /**
     * Sets the value of the performWatchListCheckOnInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformWatchListCheckOnInput(Boolean value) {
        this.performWatchListCheckOnInput = value;
    }

    /**
     * Gets the value of the includeWatchListDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeWatchListDetails() {
        return includeWatchListDetails;
    }

    /**
     * Sets the value of the includeWatchListDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeWatchListDetails(Boolean value) {
        this.includeWatchListDetails = value;
    }

    /**
     * Gets the value of the phoneOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneOptionsType }
     *     
     */
    public PhoneOptionsType getPhoneOptions() {
        return phoneOptions;
    }

    /**
     * Sets the value of the phoneOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneOptionsType }
     *     
     */
    public void setPhoneOptions(PhoneOptionsType value) {
        this.phoneOptions = value;
    }

    /**
     * Gets the value of the returnBestSsnOnly property.
     * 
     */
    public boolean isReturnBestSsnOnly() {
        return returnBestSsnOnly;
    }

    /**
     * Sets the value of the returnBestSsnOnly property.
     * 
     */
    public void setReturnBestSsnOnly(boolean value) {
        this.returnBestSsnOnly = value;
    }

}