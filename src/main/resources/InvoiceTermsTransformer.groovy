String prodcat = payload.get('Category__c');

String term = " ";

if (!prodcat.equalsIgnoreCase('Consulting') && !prodcat.equalsIgnoreCase('Training')) {
	term = "Terms: (" + payload.get('Start_Date__c') + " to " + payload.get('End_Date__c') + ")";
}

message.setInvocationProperty("itemterms", term);

return payload;