
package com.aitequ.webservice;

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
@WebServiceClient(name = "MyServiceImpService", targetNamespace = "http://webservice.aitequ.com/", wsdlLocation = "http://localhost:8888/ns?wsdl")
public class MyServiceImpService
    extends Service
{

    private final static URL MYSERVICEIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException MYSERVICEIMPSERVICE_EXCEPTION;
    private final static QName MYSERVICEIMPSERVICE_QNAME = new QName("http://webservice.aitequ.com/", "MyServiceImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/ns?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYSERVICEIMPSERVICE_WSDL_LOCATION = url;
        MYSERVICEIMPSERVICE_EXCEPTION = e;
    }

    public MyServiceImpService() {
        super(__getWsdlLocation(), MYSERVICEIMPSERVICE_QNAME);
    }

    public MyServiceImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYSERVICEIMPSERVICE_QNAME, features);
    }

    public MyServiceImpService(URL wsdlLocation) {
        super(wsdlLocation, MYSERVICEIMPSERVICE_QNAME);
    }

    public MyServiceImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYSERVICEIMPSERVICE_QNAME, features);
    }

    public MyServiceImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyServiceImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MyServiceInterface
     */
    @WebEndpoint(name = "MyServiceImpPort")
    public MyServiceInterface getMyServiceImpPort() {
        return super.getPort(new QName("http://webservice.aitequ.com/", "MyServiceImpPort"), MyServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyServiceInterface
     */
    @WebEndpoint(name = "MyServiceImpPort")
    public MyServiceInterface getMyServiceImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.aitequ.com/", "MyServiceImpPort"), MyServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYSERVICEIMPSERVICE_EXCEPTION!= null) {
            throw MYSERVICEIMPSERVICE_EXCEPTION;
        }
        return MYSERVICEIMPSERVICE_WSDL_LOCATION;
    }

}