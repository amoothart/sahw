
package net.kinvey.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for getLoginHistoryResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getLoginHistoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.kinvey.net/wsdl}LoginHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLoginHistoryResponse", propOrder = {
        "_return"
})
public class GetLoginHistoryResponse {

    @XmlElement(name = "return")
    protected LoginHistory _return;

    /**
     * Gets the value of the return property.
     *
     * @return
     *     possible object is
     *     {@link LoginHistory }
     *
     */
    public LoginHistory getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value
     *     allowed object is
     *     {@link LoginHistory }
     *
     */
    public void setReturn(LoginHistory value) {
        this._return = value;
    }

}
