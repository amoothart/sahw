
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{urn:enterprise.soap.sforce.com}DescribeApprovalLayoutResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result"
})
@XmlRootElement(name = "describeApprovalLayoutResponse")
public class DescribeApprovalLayoutResponse {

    @XmlElement(required = true, nillable = true)
    protected DescribeApprovalLayoutResultType result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeApprovalLayoutResultType }
     *     
     */
    public DescribeApprovalLayoutResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeApprovalLayoutResultType }
     *     
     */
    public void setResult(DescribeApprovalLayoutResultType value) {
        this.result = value;
    }

}
