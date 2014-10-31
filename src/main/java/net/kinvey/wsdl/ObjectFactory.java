
package net.kinvey.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.kinvey.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPolicy_QNAME = new QName("http://www.kinvey.net/wsdl", "getPolicy");
    private final static QName _SamlToken_QNAME = new QName("http://www.kinvey.net/wsdl", "samlToken");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.kinvey.wsdl
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLoginHistory }
     *
     */
    public GetLoginHistory createGetPolicy() {
        return new GetLoginHistory();
    }

    /**
     * Create an instance of {@link LoginHistory }
     *
     */
    public LoginHistory createLoginHistory() {
        return new LoginHistory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoginHistory }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.kinvey.net/wsdl", name = "getPolicy")
    public JAXBElement<GetLoginHistory> createGetPolicy(GetLoginHistory value) {
        return new JAXBElement<GetLoginHistory>(_GetPolicy_QNAME, GetLoginHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.kinvey.net/wsdl", name = "samlToken")
    public JAXBElement<String> createSamlToken(String value) {
        return new JAXBElement<String>(_SamlToken_QNAME, String.class, null, value);
    }
}
