
package id.go.customs.mpn.client.cukai;

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
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CukaiService", targetNamespace = "http://bean.cukai.billing.customs.go.id/", wsdlLocation = "http://10.0.16.126/CukaiService/Cukai?WSDL")
public class CukaiService
    extends Service
{

    private final static URL CUKAISERVICE_WSDL_LOCATION;
    private final static WebServiceException CUKAISERVICE_EXCEPTION;
    private final static QName CUKAISERVICE_QNAME = new QName("http://bean.cukai.billing.customs.go.id/", "CukaiService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.0.16.126/CukaiService/Cukai?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUKAISERVICE_WSDL_LOCATION = url;
        CUKAISERVICE_EXCEPTION = e;
    }

    public CukaiService() {
        super(__getWsdlLocation(), CUKAISERVICE_QNAME);
    }

    public CukaiService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUKAISERVICE_QNAME, features);
    }

    public CukaiService(URL wsdlLocation) {
        super(wsdlLocation, CUKAISERVICE_QNAME);
    }

    public CukaiService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUKAISERVICE_QNAME, features);
    }

    public CukaiService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CukaiService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Cukai
     */
    @WebEndpoint(name = "CukaiPort")
    public Cukai getCukaiPort() {
        return super.getPort(new QName("http://bean.cukai.billing.customs.go.id/", "CukaiPort"), Cukai.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Cukai
     */
    @WebEndpoint(name = "CukaiPort")
    public Cukai getCukaiPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bean.cukai.billing.customs.go.id/", "CukaiPort"), Cukai.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUKAISERVICE_EXCEPTION!= null) {
            throw CUKAISERVICE_EXCEPTION;
        }
        return CUKAISERVICE_WSDL_LOCATION;
    }

}