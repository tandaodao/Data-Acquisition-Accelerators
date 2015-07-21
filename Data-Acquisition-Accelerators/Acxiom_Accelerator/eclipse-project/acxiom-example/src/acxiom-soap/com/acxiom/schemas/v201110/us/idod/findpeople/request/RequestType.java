//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-07/05/2013 05:22 AM(foreman)-)
//


package com.acxiom.schemas.v201110.us.idod.findpeople.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessOptions" type="{http://schemas.acxiom.com/v201110/us/idod/findpeople/request}ProcessOptionsType"/>
 *         &lt;element name="Inputs" type="{http://schemas.acxiom.com/v201110/us/idod/findpeople/request}InputListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "processOptions",
    "inputs"
})
public class RequestType {

    @XmlElement(name = "ProcessOptions", required = true)
    protected ProcessOptionsType processOptions;
    @XmlElement(name = "Inputs", required = true)
    protected InputListType inputs;

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
     * Gets the value of the inputs property.
     * 
     * @return
     *     possible object is
     *     {@link InputListType }
     *     
     */
    public InputListType getInputs() {
        return inputs;
    }

    /**
     * Sets the value of the inputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputListType }
     *     
     */
    public void setInputs(InputListType value) {
        this.inputs = value;
    }

}