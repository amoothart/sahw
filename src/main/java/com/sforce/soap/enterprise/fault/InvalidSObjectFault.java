
package com.sforce.soap.enterprise.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidSObjectFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvalidSObjectFault">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:fault.enterprise.soap.sforce.com}ApiQueryFault">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidSObjectFault")
public class InvalidSObjectFault
    extends ApiQueryFault
{


}
