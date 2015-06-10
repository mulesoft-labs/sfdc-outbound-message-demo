String intacctmessage = message.getSessionProperty("intacctmessage");
if (intacctmessage == null || intacctmessage == "{}") {
	message.setSessionProperty("intacctmessage", " ");
}

String referenceno = message.getSessionProperty("referenceno");
if (referenceno == null || referenceno == "{}") {
	message.setSessionProperty("referenceno", " ");
}

return payload;

