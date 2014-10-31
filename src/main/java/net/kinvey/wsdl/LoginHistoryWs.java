package net.kinvey.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

@WebService(targetNamespace = "http://www.kinvey.net/wsdl", name = "LoginHistoryWs")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LoginHistoryWs {
    @WebResult(name = "getLoginHistoryResponse", targetNamespace = "http://www.kinvey.net/wsdl", partName = "result")
    @Action(input = "http://www.kinvey.net/wsdl/LoginHistoryWs/getLoginHistoryRequest", output = "http://www.kinvey.net/wsdl/LoginHistoryWs/getLoginHistoryResponse")
    @WebMethod
    //TODO: this should be a list
    public GetLoginHistoryResponse getLoginHistory(
            @WebParam(partName = "parameters", name = "getLoginHistory", targetNamespace = "http://www.kinvey.net/wsdl")
            GetLoginHistory parameters,
            @WebParam(partName = "samlToken", name = "samlToken", targetNamespace = "http://www.kinvey.net/wsdl", header = true)
            java.lang.String samlToken
    );
}
