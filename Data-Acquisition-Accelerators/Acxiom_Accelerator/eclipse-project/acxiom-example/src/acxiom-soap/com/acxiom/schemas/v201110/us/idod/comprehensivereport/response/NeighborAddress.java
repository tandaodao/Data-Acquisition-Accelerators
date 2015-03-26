//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-07/05/2013 05:22 AM(foreman)-)
//


package com.acxiom.schemas.v201110.us.idod.comprehensivereport.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.acxiom.schemas.v201110.us.idod.common.RestrictedUseType;


/**
 * <p>Java class for NeighborAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighborAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LengthOfResidence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnOrRent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateReported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastVerified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateEnded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OccRank" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OccStatusRank" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OccOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RestrictedUseInfo" type="{http://schemas.acxiom.com/v201110/us/idod/common}RestrictedUseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighborAddress", propOrder = {
    "primaryNumber",
    "preDirection",
    "street",
    "streetSuffix",
    "postDirection",
    "unitDesignator",
    "secondaryNumber",
    "city",
    "state",
    "zip",
    "zip4",
    "countyCode",
    "countyName",
    "lengthOfResidence",
    "ownOrRent",
    "dateReported",
    "dateLastVerified",
    "dateEnded",
    "occRank",
    "occStatusRank",
    "occOrder",
    "restrictedUseInfo"
})
public class NeighborAddress {

    @XmlElement(name = "PrimaryNumber")
    protected String primaryNumber;
    @XmlElement(name = "PreDirection")
    protected String preDirection;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "StreetSuffix")
    protected String streetSuffix;
    @XmlElement(name = "PostDirection")
    protected String postDirection;
    @XmlElement(name = "UnitDesignator")
    protected String unitDesignator;
    @XmlElement(name = "SecondaryNumber")
    protected String secondaryNumber;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "Zip4")
    protected String zip4;
    @XmlElement(name = "CountyCode")
    protected String countyCode;
    @XmlElement(name = "CountyName")
    protected String countyName;
    @XmlElement(name = "LengthOfResidence")
    protected Long lengthOfResidence;
    @XmlElement(name = "OwnOrRent")
    protected String ownOrRent;
    @XmlElement(name = "DateReported")
    protected String dateReported;
    @XmlElement(name = "DateLastVerified")
    protected String dateLastVerified;
    @XmlElement(name = "DateEnded")
    protected String dateEnded;
    @XmlElement(name = "OccRank")
    protected Long occRank;
    @XmlElement(name = "OccStatusRank")
    protected Long occStatusRank;
    @XmlElement(name = "OccOrder")
    protected Long occOrder;
    @XmlElement(name = "RestrictedUseInfo")
    protected RestrictedUseType restrictedUseInfo;

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
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the zip4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip4() {
        return zip4;
    }

    /**
     * Sets the value of the zip4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip4(String value) {
        this.zip4 = value;
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
     * Gets the value of the restrictedUseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedUseType }
     *     
     */
    public RestrictedUseType getRestrictedUseInfo() {
        return restrictedUseInfo;
    }

    /**
     * Sets the value of the restrictedUseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedUseType }
     *     
     */
    public void setRestrictedUseInfo(RestrictedUseType value) {
        this.restrictedUseInfo = value;
    }

}
