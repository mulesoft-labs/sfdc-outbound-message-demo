
package com.mulesoft.salesforce.outbound.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mulesoft.salesforce.outbound.generated package. 
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

    private final static QName _OpportunityAccountId_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "AccountId");
    private final static QName _OpportunityBillingContactEmail_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Contact_Email__c");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mulesoft.salesforce.outbound.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationsResponse }
     * 
     */
    public NotificationsResponse createNotificationsResponse() {
        return new NotificationsResponse();
    }

    /**
     * Create an instance of {@link Notifications }
     * 
     */
    public Notifications createNotifications() {
        return new Notifications();
    }

    /**
     * Create an instance of {@link OpportunityNotification }
     * 
     */
    public OpportunityNotification createOpportunityNotification() {
        return new OpportunityNotification();
    }

    /**
     * Create an instance of {@link SObject }
     * 
     */
    public SObject createSObject() {
        return new SObject();
    }

    /**
     * Create an instance of {@link Opportunity }
     * 
     */
    public Opportunity createOpportunity() {
        return new Opportunity();
    }

    /**
     * Create an instance of {@link AggregateResult }
     * 
     */
    public AggregateResult createAggregateResult() {
        return new AggregateResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "AccountId", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityAccountId(String value) {
        return new JAXBElement<String>(_OpportunityAccountId_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "Billing_Contact_Email__c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityBilling_Contact_Email__c(String value) {
        return new JAXBElement<String>(_OpportunityBillingContactEmail_QNAME, String.class, Opportunity.class, value);
    }

}
