//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-07/05/2013 05:22 AM(foreman)-)
//


package com.acxiom.schemas.v201110.us.idod.comprehensivereport.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociateRelative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociateRelative">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AliasData" type="{http://schemas.acxiom.com/v201110/us/idod/comprehensivereport/response}AssociateRelativeAliasData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConfidenceScore" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DateOfLastCohabitation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MostRecentOccAl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameAddressData" type="{http://schemas.acxiom.com/v201110/us/idod/comprehensivereport/response}AssociateRelativeNameAddressData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhoneData" type="{http://schemas.acxiom.com/v201110/us/idod/comprehensivereport/response}AssociateRelativePhoneData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PossibleRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeceasedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ssn" type="{http://schemas.acxiom.com/v201110/us/idod/comprehensivereport/response}AssociateRelativeSsnData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndividualId" type="{http://schemas.acxiom.com/v201110/us/idod/common}IndividualIDType" minOccurs="0"/>
 *         &lt;element name="IndividualId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociateRelative", propOrder = {
    "aliasData",
    "confidenceScore",
    "dateOfLastCohabitation",
    "mostRecentOccAl",
    "nameAddressData",
    "phoneData",
    "possibleRelationship",
    "deceasedFlag",
    "ssn",
    "individualId",
    "individualId2"
})
public class AssociateRelative {

    @XmlElement(name = "AliasData")
    protected List<AssociateRelativeAliasData> aliasData;
    @XmlElement(name = "ConfidenceScore")
    protected long confidenceScore;
    @XmlElement(name = "DateOfLastCohabitation")
    protected String dateOfLastCohabitation;
    @XmlElement(name = "MostRecentOccAl")
    protected String mostRecentOccAl;
    @XmlElement(name = "NameAddressData")
    protected List<AssociateRelativeNameAddressData> nameAddressData;
    @XmlElement(name = "PhoneData")
    protected List<AssociateRelativePhoneData> phoneData;
    @XmlElement(name = "PossibleRelationship")
    protected String possibleRelationship;
    @XmlElement(name = "DeceasedFlag")
    protected String deceasedFlag;
    @XmlElement(name = "Ssn")
    protected List<AssociateRelativeSsnData> ssn;
    @XmlElement(name = "IndividualId")
    protected String individualId;
    @XmlElement(name = "IndividualId2")
    protected String individualId2;

    /**
     * Gets the value of the aliasData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliasData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliasData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociateRelativeAliasData }
     * 
     * 
     */
    public List<AssociateRelativeAliasData> getAliasData() {
        if (aliasData == null) {
            aliasData = new ArrayList<AssociateRelativeAliasData>();
        }
        return this.aliasData;
    }

    /**
     * Gets the value of the confidenceScore property.
     * 
     */
    public long getConfidenceScore() {
        return confidenceScore;
    }

    /**
     * Sets the value of the confidenceScore property.
     * 
     */
    public void setConfidenceScore(long value) {
        this.confidenceScore = value;
    }

    /**
     * Gets the value of the dateOfLastCohabitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfLastCohabitation() {
        return dateOfLastCohabitation;
    }

    /**
     * Sets the value of the dateOfLastCohabitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfLastCohabitation(String value) {
        this.dateOfLastCohabitation = value;
    }

    /**
     * Gets the value of the mostRecentOccAl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMostRecentOccAl() {
        return mostRecentOccAl;
    }

    /**
     * Sets the value of the mostRecentOccAl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMostRecentOccAl(String value) {
        this.mostRecentOccAl = value;
    }

    /**
     * Gets the value of the nameAddressData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameAddressData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameAddressData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociateRelativeNameAddressData }
     * 
     * 
     */
    public List<AssociateRelativeNameAddressData> getNameAddressData() {
        if (nameAddressData == null) {
            nameAddressData = new ArrayList<AssociateRelativeNameAddressData>();
        }
        return this.nameAddressData;
    }

    /**
     * Gets the value of the phoneData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociateRelativePhoneData }
     * 
     * 
     */
    public List<AssociateRelativePhoneData> getPhoneData() {
        if (phoneData == null) {
            phoneData = new ArrayList<AssociateRelativePhoneData>();
        }
        return this.phoneData;
    }

    /**
     * Gets the value of the possibleRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPossibleRelationship() {
        return possibleRelationship;
    }

    /**
     * Sets the value of the possibleRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPossibleRelationship(String value) {
        this.possibleRelationship = value;
    }

    /**
     * Gets the value of the deceasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceasedFlag() {
        return deceasedFlag;
    }

    /**
     * Sets the value of the deceasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceasedFlag(String value) {
        this.deceasedFlag = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociateRelativeSsnData }
     * 
     * 
     */
    public List<AssociateRelativeSsnData> getSsn() {
        if (ssn == null) {
            ssn = new ArrayList<AssociateRelativeSsnData>();
        }
        return this.ssn;
    }

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
     * Gets the value of the individualId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualId2() {
        return individualId2;
    }

    /**
     * Sets the value of the individualId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualId2(String value) {
        this.individualId2 = value;
    }

}
