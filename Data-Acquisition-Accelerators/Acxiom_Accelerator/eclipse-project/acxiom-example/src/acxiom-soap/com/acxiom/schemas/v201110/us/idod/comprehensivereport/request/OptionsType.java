//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-07/05/2013 05:22 AM(foreman)-)
//


package com.acxiom.schemas.v201110.us.idod.comprehensivereport.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessOptions" type="{http://schemas.acxiom.com/v201110/us/idod/comprehensivereport/request}ProcessOptionsType" minOccurs="0"/>
 *         &lt;element name="ReportOptions" type="{http://schemas.acxiom.com/v201110/us/idod/comprehensivereport/request}ReportOptionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionsType", propOrder = {
    "processOptions",
    "reportOptions"
})
public class OptionsType {

    @XmlElement(name = "ProcessOptions")
    protected ProcessOptionsType processOptions;
    @XmlElement(name = "ReportOptions")
    protected ReportOptionsType reportOptions;

    /**
     * Gets the value of the processOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessOptionsType }
     *     
     */
    public ProcessOptionsType getProcessOptions() {
        return processOptions;
    }

    /**
     * Sets the value of the processOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessOptionsType }
     *     
     */
    public void setProcessOptions(ProcessOptionsType value) {
        this.processOptions = value;
    }

    /**
     * Gets the value of the reportOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ReportOptionsType }
     *     
     */
    public ReportOptionsType getReportOptions() {
        return reportOptions;
    }

    /**
     * Sets the value of the reportOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportOptionsType }
     *     
     */
    public void setReportOptions(ReportOptionsType value) {
        this.reportOptions = value;
    }

}
