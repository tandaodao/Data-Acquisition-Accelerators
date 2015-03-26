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
 * <p>Java class for AssociateRelativeAliasData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociateRelativeAliasData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndividualId" type="{http://schemas.acxiom.com/v201110/us/idod/common}IndividualIDType" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestrictedUseInfo" type="{http://schemas.acxiom.com/v201110/us/idod/common}RestrictedUseType" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameRank" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociateRelativeAliasData", propOrder = {
    "individualId",
    "firstName",
    "restrictedUseInfo",
    "lastName",
    "middleName",
    "nameRank",
    "suffix"
})
public class AssociateRelativeAliasData {

    @XmlElement(name = "IndividualId")
    protected String individualId;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "RestrictedUseInfo")
    protected RestrictedUseType restrictedUseInfo;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "NameRank")
    protected Long nameRank;
    @XmlElement(name = "Suffix")
    protected String suffix;

    /**
     * Gets the value of the individualId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualId() {
        return individualId;
    }

    /**
     * Sets the value of the individualId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualId(String value) {
        this.individualId = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
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

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the nameRank property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNameRank() {
        return nameRank;
    }

    /**
     * Sets the value of the nameRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNameRank(Long value) {
        this.nameRank = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

}
