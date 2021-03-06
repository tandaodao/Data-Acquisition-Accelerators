//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-07/05/2013 05:22 AM(foreman)-)
//


package com.acxiom.schemas.v201110.us.idod.comprehensivereport.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActiveInactive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CongressionalDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastVote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxDateVote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinDateVote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoliticalParty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Precinct1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Precinct2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Precinct3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialDist1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialDist2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateSenate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoteNumTimes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VoterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoterStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndividualId" type="{http://schemas.acxiom.com/v201110/us/idod/common}IndividualIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoterType", propOrder = {
    "activeInactive",
    "congressionalDistrict",
    "dateLastVote",
    "maxDateVote",
    "minDateVote",
    "politicalParty",
    "precinct1",
    "precinct2",
    "precinct3",
    "registrationDate",
    "registrationState",
    "searchId",
    "specialDist1",
    "specialDist2",
    "stateHouse",
    "stateSenate",
    "voteNumTimes",
    "voterId",
    "voterStatus",
    "individualId"
})
public class VoterType {

    @XmlElement(name = "ActiveInactive")
    protected String activeInactive;
    @XmlElement(name = "CongressionalDistrict")
    protected String congressionalDistrict;
    @XmlElement(name = "DateLastVote")
    protected String dateLastVote;
    @XmlElement(name = "MaxDateVote")
    protected String maxDateVote;
    @XmlElement(name = "MinDateVote")
    protected String minDateVote;
    @XmlElement(name = "PoliticalParty")
    protected String politicalParty;
    @XmlElement(name = "Precinct1")
    protected String precinct1;
    @XmlElement(name = "Precinct2")
    protected String precinct2;
    @XmlElement(name = "Precinct3")
    protected String precinct3;
    @XmlElement(name = "RegistrationDate")
    protected String registrationDate;
    @XmlElement(name = "RegistrationState")
    protected String registrationState;
    @XmlElement(name = "SearchId")
    protected String searchId;
    @XmlElement(name = "SpecialDist1")
    protected String specialDist1;
    @XmlElement(name = "SpecialDist2")
    protected String specialDist2;
    @XmlElement(name = "StateHouse")
    protected String stateHouse;
    @XmlElement(name = "StateSenate")
    protected String stateSenate;
    @XmlElement(name = "VoteNumTimes")
    protected Long voteNumTimes;
    @XmlElement(name = "VoterId")
    protected String voterId;
    @XmlElement(name = "VoterStatus")
    protected String voterStatus;
    @XmlElement(name = "IndividualId")
    protected String individualId;

    /**
     * Gets the value of the activeInactive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveInactive() {
        return activeInactive;
    }

    /**
     * Sets the value of the activeInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveInactive(String value) {
        this.activeInactive = value;
    }

    /**
     * Gets the value of the congressionalDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCongressionalDistrict() {
        return congressionalDistrict;
    }

    /**
     * Sets the value of the congressionalDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCongressionalDistrict(String value) {
        this.congressionalDistrict = value;
    }

    /**
     * Gets the value of the dateLastVote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLastVote() {
        return dateLastVote;
    }

    /**
     * Sets the value of the dateLastVote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLastVote(String value) {
        this.dateLastVote = value;
    }

    /**
     * Gets the value of the maxDateVote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDateVote() {
        return maxDateVote;
    }

    /**
     * Sets the value of the maxDateVote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDateVote(String value) {
        this.maxDateVote = value;
    }

    /**
     * Gets the value of the minDateVote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinDateVote() {
        return minDateVote;
    }

    /**
     * Sets the value of the minDateVote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDateVote(String value) {
        this.minDateVote = value;
    }

    /**
     * Gets the value of the politicalParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticalParty() {
        return politicalParty;
    }

    /**
     * Sets the value of the politicalParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticalParty(String value) {
        this.politicalParty = value;
    }

    /**
     * Gets the value of the precinct1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecinct1() {
        return precinct1;
    }

    /**
     * Sets the value of the precinct1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecinct1(String value) {
        this.precinct1 = value;
    }

    /**
     * Gets the value of the precinct2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecinct2() {
        return precinct2;
    }

    /**
     * Sets the value of the precinct2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecinct2(String value) {
        this.precinct2 = value;
    }

    /**
     * Gets the value of the precinct3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecinct3() {
        return precinct3;
    }

    /**
     * Sets the value of the precinct3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecinct3(String value) {
        this.precinct3 = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationDate(String value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the registrationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationState() {
        return registrationState;
    }

    /**
     * Sets the value of the registrationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationState(String value) {
        this.registrationState = value;
    }

    /**
     * Gets the value of the searchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * Sets the value of the searchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchId(String value) {
        this.searchId = value;
    }

    /**
     * Gets the value of the specialDist1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialDist1() {
        return specialDist1;
    }

    /**
     * Sets the value of the specialDist1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialDist1(String value) {
        this.specialDist1 = value;
    }

    /**
     * Gets the value of the specialDist2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialDist2() {
        return specialDist2;
    }

    /**
     * Sets the value of the specialDist2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialDist2(String value) {
        this.specialDist2 = value;
    }

    /**
     * Gets the value of the stateHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateHouse() {
        return stateHouse;
    }

    /**
     * Sets the value of the stateHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateHouse(String value) {
        this.stateHouse = value;
    }

    /**
     * Gets the value of the stateSenate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateSenate() {
        return stateSenate;
    }

    /**
     * Sets the value of the stateSenate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateSenate(String value) {
        this.stateSenate = value;
    }

    /**
     * Gets the value of the voteNumTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVoteNumTimes() {
        return voteNumTimes;
    }

    /**
     * Sets the value of the voteNumTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVoteNumTimes(Long value) {
        this.voteNumTimes = value;
    }

    /**
     * Gets the value of the voterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterId() {
        return voterId;
    }

    /**
     * Sets the value of the voterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterId(String value) {
        this.voterId = value;
    }

    /**
     * Gets the value of the voterStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterStatus() {
        return voterStatus;
    }

    /**
     * Sets the value of the voterStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterStatus(String value) {
        this.voterStatus = value;
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

}
