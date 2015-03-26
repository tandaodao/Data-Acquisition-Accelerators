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
 * <p>Java class for AssociateRelativeDOB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociateRelativeDOB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestricteduseInfo" type="{http://schemas.acxiom.com/v201110/us/idod/common}RestrictedUseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociateRelativeDOB", propOrder = {
    "dob",
    "restricteduseInfo"
})
public class AssociateRelativeDOB {

    @XmlElement(name = "DOB")
    protected String dob;
    @XmlElement(name = "RestricteduseInfo")
    protected RestrictedUseType restricteduseInfo;

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOB(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the restricteduseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedUseType }
     *     
     */
    public RestrictedUseType getRestricteduseInfo() {
        return restricteduseInfo;
    }

    /**
     * Sets the value of the restricteduseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedUseType }
     *     
     */
    public void setRestricteduseInfo(RestrictedUseType value) {
        this.restricteduseInfo = value;
    }

}
