
package soap.register;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GameRegisterService", targetNamespace = "http://register.soap/", wsdlLocation = "http://localhost:8081/register/reg?wsdl")
public class GameRegisterService
    extends Service
{

    private final static URL GAMEREGISTERSERVICE_WSDL_LOCATION;
    private final static WebServiceException GAMEREGISTERSERVICE_EXCEPTION;
    private final static QName GAMEREGISTERSERVICE_QNAME = new QName("http://register.soap/", "GameRegisterService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/register/reg?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GAMEREGISTERSERVICE_WSDL_LOCATION = url;
        GAMEREGISTERSERVICE_EXCEPTION = e;
    }

    public GameRegisterService() {
        super(__getWsdlLocation(), GAMEREGISTERSERVICE_QNAME);
    }

    public GameRegisterService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GAMEREGISTERSERVICE_QNAME, features);
    }

    public GameRegisterService(URL wsdlLocation) {
        super(wsdlLocation, GAMEREGISTERSERVICE_QNAME);
    }

    public GameRegisterService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GAMEREGISTERSERVICE_QNAME, features);
    }

    public GameRegisterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GameRegisterService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Register
     */
    @WebEndpoint(name = "GameRegisterPort")
    public Register getGameRegisterPort() {
        return super.getPort(new QName("http://register.soap/", "GameRegisterPort"), Register.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Register
     */
    @WebEndpoint(name = "GameRegisterPort")
    public Register getGameRegisterPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://register.soap/", "GameRegisterPort"), Register.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GAMEREGISTERSERVICE_EXCEPTION!= null) {
            throw GAMEREGISTERSERVICE_EXCEPTION;
        }
        return GAMEREGISTERSERVICE_WSDL_LOCATION;
    }

}
