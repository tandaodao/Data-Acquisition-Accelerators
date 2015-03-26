//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-07/05/2013 05:22 AM(foreman)-)
//


package com.acxiom.schemas.v201110.us.idod.comprehensivereport.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PilotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PilotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertType4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certexpdate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certexpdate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certexpdate3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certexpdate4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MedicalClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MedicalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MedicalExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ratings1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ratings2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ratings3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ratings4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PilotType", propOrder = {
    "certType1",
    "certType2",
    "certType3",
    "certType4",
    "certexpdate1",
    "certexpdate2",
    "certexpdate3",
    "certexpdate4",
    "licenseNumber",
    "medicalClass",
    "medicalDate",
    "medicalExpireDate",
    "ratings1",
    "ratings2",
    "ratings3",
    "ratings4",
    "searchId"
})
public class PilotType {

    @XmlElement(name = "CertType1")
    protected String certType1;
    @XmlElement(name = "CertType2")
    protected String certType2;
    @XmlElement(name = "CertType3")
    protected String certType3;
    @XmlElement(name = "CertType4")
    protected String certType4;
    @XmlElement(name = "Certexpdate1")
    protected String certexpdate1;
    @XmlElement(name = "Certexpdate2")
    protected String certexpdate2;
    @XmlElement(name = "Certexpdate3")
    protected String certexpdate3;
    @XmlElement(name = "Certexpdate4")
    protected String certexpdate4;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "MedicalClass")
    protected String medicalClass;
    @XmlElement(name = "MedicalDate")
    protected String medicalDate;
    @XmlElement(name = "MedicalExpireDate")
    protected String medicalExpireDate;
    @XmlElement(name = "Ratings1")
    protected String ratings1;
    @XmlElement(name = "Ratings2")
    protected String ratings2;
    @XmlElement(name = "Ratings3")
    protected String ratings3;
    @XmlElement(name = "Ratings4")
    protected String ratings4;
    @XmlElement(name = "SearchId")
    protected String searchId;

    /**
     * Gets the value of the certType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertType1() {
        return certType1;
    }

    /**
     * Sets the value of the certType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertType1(String value) {
        this.certType1 = value;
    }

    /**
     * Gets the value of the certType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertType2() {
        return certType2;
    }

    /**
     * Sets the value of the certType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertType2(String value) {
        this.certType2 = value;
    }

    /**
     * Gets the value of the certType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertType3() {
        return certType3;
    }

    /**
     * Sets the value of the certType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertType3(String value) {
        this.certType3 = value;
    }

    /**
     * Gets the value of the certType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertType4() {
        return certType4;
    }

    /**
     * Sets the value of the certType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertType4(String value) {
        this.certType4 = value;
    }

    /**
     * Gets the value of the certexpdate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertexpdate1() {
        return certexpdate1;
    }

    /**
     * Sets the value of the certexpdate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertexpdate1(String value) {
        this.certexpdate1 = value;
    }

    /**
     * Gets the value of the certexpdate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertexpdate2() {
        return certexpdate2;
    }

    /**
     * Sets the value of the certexpdate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertexpdate2(String value) {
        this.certexpdate2 = value;
    }

    /**
     * Gets the value of the certexpdate3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertexpdate3() {
        return certexpdate3;
    }

    /**
     * Sets the value of the certexpdate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertexpdate3(String value) {
        this.certexpdate3 = value;
    }

    /**
     * Gets the value of the certexpdate4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertexpdate4() {
        return certexpdate4;
    }

    /**
     * Sets the value of the certexpdate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertexpdate4(String value) {
        this.certexpdate4 = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the medicalClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalClass() {
        return medicalClass;
    }

    /**
     * Sets the value of the medicalClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalClass(String value) {
        this.medicalClass = value;
    }

    /**
     * Gets the value of the medicalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalDate() {
        return medicalDate;
    }

    /**
     * Sets the value of the medicalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalDate(String value) {
        this.medicalDate = value;
    }

    /**
     * Gets the value of the medicalExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalExpireDate() {
        return medicalExpireDate;
    }

    /**
     * Sets the value of the medicalExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalExpireDate(String value) {
        this.medicalExpireDate = value;
    }

    /**
     * Gets the value of the ratings1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatings1() {
        return ratings1;
    }

    /**
     * Sets the value of the ratings1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatings1(String value) {
        this.ratings1 = value;
    }

    /**
     * Gets the value of the ratings2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatings2() {
        return ratings2;
    }

    /**
     * Sets the value of the ratings2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatings2(String value) {
        this.ratings2 = value;
    }

    /**
     * Gets the value of the ratings3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatings3() {
        return ratings3;
    }

    /**
     * Sets the value of the ratings3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatings3(String value) {
        this.ratings3 = value;
    }

    /**
     * Gets the value of the ratings4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatings4() {
        return ratings4;
    }

    /**
     * Sets the value of the ratings4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatings4(String value) {
        this.ratings4 = value;
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

}
