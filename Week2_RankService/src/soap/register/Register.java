
package soap.register;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Register", targetNamespace = "http://register.soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Register {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://register.soap/", className = "soap.register.Register_Type")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://register.soap/", className = "soap.register.RegisterResponse")
    @Action(input = "http://register.soap/Register/registerRequest", output = "http://register.soap/Register/registerResponse")
    public String register(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}