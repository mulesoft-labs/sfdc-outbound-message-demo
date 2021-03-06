package com.mulesoft.salesforce.outbound.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.3
 * 2011-05-30T12:18:19.458-07:00
 * Generated source version: 2.3.3
 * 
 */


@WebServiceClient(name = "NotificationService", 
                  wsdlLocation = "file:/Users/albinkjellin/Documents/mule/workspace/SalesForceToIntacct/src/main/resources/wsdl/SFWonOpportunity.wsdl",
                  targetNamespace = "http://soap.sforce.com/2005/09/outbound") 
public class NotificationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.sforce.com/2005/09/outbound", "NotificationService");
    public final static QName Notification = new QName("http://soap.sforce.com/2005/09/outbound", "Notification");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/albinkjellin/Documents/mule/workspace/SalesForceToIntacct/src/main/resources/wsdl/SFWonOpportunity.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/Users/albinkjellin/dev/temp/sf-wsdl/SFWonOpportunity.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public NotificationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public NotificationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NotificationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    /*
    public NotificationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
    */

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    /*
    public NotificationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }
*/
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
  /*  
    public NotificationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }
*/
    /**
     * 
     * @return
     *     returns NotificationPort
     */
    /*
    @WebEndpoint(name = "Notification")
    public NotificationPort getNotification() {
        return super.getPort(Notification, NotificationPort.class);
    }
    */

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NotificationPort
     */
    /*
    @WebEndpoint(name = "Notification")
    public NotificationPort getNotification(WebServiceFeature... features) {
        return super.getPort(Notification, NotificationPort.class, features);
    }
    */

}
