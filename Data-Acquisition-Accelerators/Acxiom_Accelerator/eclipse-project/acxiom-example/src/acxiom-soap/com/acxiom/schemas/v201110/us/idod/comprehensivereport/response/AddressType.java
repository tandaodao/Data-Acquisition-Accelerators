//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-07/05/2013 05:22 AM(foreman)-)
//


package com.acxiom.schemas.v201110.us.idod.comprehensivereport.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.acxiom.schemas.v201110.us.idod.common.ResponseAddressType;
import com.acxiom.schemas.v201110.us.idod.common.RestrictedUseType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.acxiom.com/v201110/us/idod/common}ResponseAddressType">
 *       &lt;sequence>
 *         &lt;element name="AddressStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateEnded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastVerified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateReported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSFAccuracyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSFDeliverabilityInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSFDropCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DSFDropInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DwellingUnitSizeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FraudMsgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LengthOfResidence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OccOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OccRank" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OccStatusRank" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnOrRent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialAddressTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndividualConflictInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndividualType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResctictedUseInfo" type="{http://schemas.acxiom.com/v201110/us/idod/common}RestrictedUseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressStatus",
    "countyCode",
    "countyName",
    "dateEnded",
    "dateLastVerified",
    "dateReported",
    "dsfAccuracyInd",
    "dsfDeliverabilityInd",
    "dsfDropCount",
    "dsfDropInd",
    "dwellingUnitSizeFlag",
    "fraudMsgCode",
    "lengthOfResidence",
    "occOrder",
    "occRank",
    "occStatusRank",
    "ownOrRent",
    "postDirection",
    "preDirection",
    "primaryNumber",
    "secondaryNumber",
    "specialAddressTypeFlag",
    "street",
    "streetSuffix",
    "unitDesignator",
    "individualConflictInd",
    "individualType",
    "resctictedUseInfo"
})
public class AddressType
    extends ResponseAddressType
{

    @XmlElement(name = "AddressStatus")
    protected String addressStatus;
    @XmlElement(name = "CountyCode")
    protected String countyCode;
    @XmlElement(name = "CountyName")
    protected String countyName;
    @XmlElement(name = "DateEnded")
    protected String dateEnded;
    @XmlElement(name = "DateLastVerified")
    protected String dateLastVerified;
    @XmlElement(name = "DateReported")
    protected String dateReported;
    @XmlElement(name = "DSFAccuracyInd")
    protected String dsfAccuracyInd;
    @XmlElement(name = "DSFDeliverabilityInd")
    protected String dsfDeliverabilityInd;
    @XmlElement(name = "DSFDropCount")
    protected Long dsfDropCount;
    @XmlElement(name = "DSFDropInd")
    protected String dsfDropInd;
    @XmlElement(name = "DwellingUnitSizeFlag")
    protected String dwellingUnitSizeFlag;
    @XmlElement(name = "FraudMsgCode")
    protected String fraudMsgCode;
    @XmlElement(name = "LengthOfResidence")
    protected Long lengthOfResidence;
    @XmlElement(name = "OccOrder")
    protected Long occOrder;
    @XmlElement(name = "OccRank")
    protected Long occRank;
    @XmlElement(name = "OccStatusRank")
    protected Long occStatusRank;
    @XmlElement(name = "OwnOrRent")
    protected String ownOrRent;
    @XmlElement(name = "PostDirection")
    protected String postDirection;
    @XmlElement(name = "PreDirection")
    protected String preDirection;
    @XmlElement(name = "PrimaryNumber")
    protected String primaryNumber;
    @XmlElement(name = "SecondaryNumber")
    protected String secondaryNumber;
    @XmlElement(name = "SpecialAddressTypeFlag")
    protected String specialAddressTypeFlag;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "StreetSuffix")
    protected String streetSuffix;
    @XmlElement(name = "UnitDesignator")
    protected String unitDesignator;
    @XmlElement(name = "IndividualConflictInd")
    protected String individualConflictInd;
    @XmlElement(name = "IndividualType")
    protected String individualType;
    @XmlElement(name = "ResctictedUseInfo")
    protected RestrictedUseType resctictedUseInfo;

    /**
     * Gets the value of the addressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStatus() {
        return addressStatus;
    }

    /**
     * Sets the value of the addressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStatus(String value) {
        this.addressStatus = value;
    }

    /**
     * Gets the value of the countyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the value of the countyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyCode(String value) {
        this.countyCode = value;
    }

    /**
     * Gets the value of the countyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    /**
     * Gets the value of the dateEnded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEnded() {
        return dateEnded;
    }

    /**
     * Sets the value of the dateEnded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEnded(String value) {
        this.dateEnded = value;
    }

    /**
     * Gets the value of the dateLastVerified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLastVerified() {
        return dateLastVerified;
    }

    /**
     * Sets the value of the dateLastVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLastVerified(String value) {
        this.dateLastVerified = value;
    }

    /**
     * Gets the value of the dateReported property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateReported() {
        return dateReported;
    }

    /**
     * Sets the value of the dateReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReported(String value) {
        this.dateReported = value;
    }

    /**
     * Gets the value of the dsfAccuracyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSFAccuracyInd() {
        return dsfAccuracyInd;
    }

    /**
     * Sets the value of the dsfAccuracyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSFAccuracyInd(String value) {
        this.dsfAccuracyInd = value;
    }

    /**
     * Gets the value of the dsfDeliverabilityInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSFDeliverabilityInd() {
        return dsfDeliverabilityInd;
    }

    /**
     * Sets the value of the dsfDeliverabilityInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSFDeliverabilityInd(String value) {
        this.dsfDeliverabilityInd = value;
    }

    /**
     * Gets the value of the dsfDropCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDSFDropCount() {
        return dsfDropCount;
    }

    /**
     * Sets the value of the dsfDropCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDSFDropCount(Long value) {
        this.dsfDropCount = value;
    }

    /**
     * Gets the value of the dsfDropInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSFDropInd() {
        return dsfDropInd;
    }

    /**
     * Sets the value of the dsfDropInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSFDropInd(String value) {
        this.dsfDropInd = value;
    }

    /**
     * Gets the value of the dwellingUnitSizeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDwellingUnitSizeFlag() {
        return dwellingUnitSizeFlag;
    }

    /**
     * Sets the value of the dwellingUnitSizeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwellingUnitSizeFlag(String value) {
        this.dwellingUnitSizeFlag = value;
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
     * Gets the value of the lengthOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLengthOfResidence() {
        return lengthOfResidence;
    }

    /**
     * Sets the value of the lengthOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLengthOfResidence(Long value) {
        this.lengthOfResidence = value;
    }

    /**
     * Gets the value of the occOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOccOrder() {
        return occOrder;
    }

    /**
     * Sets the value of the occOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOccOrder(Long value) {
        this.occOrder = value;
    }

    /**
     * Gets the value of the occRank property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOccRank() {
        return occRank;
    }

    /**
     * Sets the value of the occRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOccRank(Long value) {
        this.occRank = value;
    }

    /**
     * Gets the value of the occStatusRank property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOccStatusRank() {
        return occStatusRank;
    }

    /**
     * Sets the value of the occStatusRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOccStatusRank(Long value) {
        this.occStatusRank = value;
    }

    /**
     * Gets the value of the ownOrRent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnOrRent() {
        return ownOrRent;
    }

    /**
     * Sets the value of the ownOrRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnOrRent(String value) {
        this.ownOrRent = value;
    }

    /**
     * Gets the value of the postDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostDirection() {
        return postDirection;
    }

    /**
     * Sets the value of the postDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostDirection(String value) {
        this.postDirection = value;
    }

    /**
     * Gets the value of the preDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreDirection() {
        return preDirection;
    }

    /**
     * Sets the value of the preDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreDirection(String value) {
        this.preDirection = value;
    }

    /**
     * Gets the value of the primaryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryNumber() {
        return primaryNumber;
    }

    /**
     * Sets the value of the primaryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryNumber(String value) {
        this.primaryNumber = value;
    }

    /**
     * Gets the value of the secondaryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryNumber() {
        return secondaryNumber;
    }

    /**
     * Sets the value of the secondaryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryNumber(String value) {
        this.secondaryNumber = value;
    }

    /**
     * Gets the value of the specialAddressTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialAddressTypeFlag() {
        return specialAddressTypeFlag;
    }

    /**
     * Sets the value of the specialAddressTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialAddressTypeFlag(String value) {
        this.specialAddressTypeFlag = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffix(String value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the unitDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitDesignator() {
        return unitDesignator;
    }

    /**
     * Sets the value of the unitDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitDesignator(String value) {
        this.unitDesignator = value;
    }

    /**
     * Gets the value of the individualConflictInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualConflictInd() {
        return individualConflictInd;
    }

    /**
     * Sets the value of the individualConflictInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualConflictInd(String value) {
        this.individualConflictInd = value;
    }

    /**
     * Gets the value of the individualType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualType() {
        return individualType;
    }

    /**
     * Sets the value of the individualType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualType(String value) {
        this.individualType = value;
    }

    /**
     * Gets the value of the resctictedUseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedUseType }
     *     
     */
    public RestrictedUseType getResctictedUseInfo() {
        return resctictedUseInfo;
    }

    /**
     * Sets the value of the resctictedUseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedUseType }
     *     
     */
    public void setResctictedUseInfo(RestrictedUseType value) {
        this.resctictedUseInfo = value;
    }

}
