package com.mulesoft.salesforce.outbound;

import com.mulesoft.salesforce.outbound.generated.*;

import javax.jws.WebService;

@WebService(serviceName = "OpportunityTrigger", endpointInterface = "com.mulesoft.salesforce.outbound.generated.NotificationPort")


@javax.xml.ws.BindingType(value = "http://cxf.apache.org/bindings/xformat")
public class OpportunityTrigger implements NotificationPort {

	public java.util.List<com.mulesoft.salesforce.outbound.generated.OpportunityNotification> notifications(String organizationId, String actionId,
			String sessionId, String enterpriseUrl, String partnerUrl,
			java.util.List<OpportunityNotification> notification) 
	{
		
	
		return notification;
	}

}
