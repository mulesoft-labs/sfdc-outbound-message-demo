import java.util.ArrayList;
import org.mule.module.intacct.schema.request.Contact;
import org.mule.module.intacct.schema.request.Contactname;
import org.mule.module.intacct.schema.request.Mailaddress;

Contactname contactname = new Contactname();
contactname.setValue(payload["Name"]);

Mailaddress mailaddress = new Mailaddress();

if (payload["BillingStreet"] != null && payload["BillingStreet"] != "" && payload["BillingStreet"].toString() != "[:]")
	mailaddress.setAddress1(payload["BillingStreet"]);
if (payload["BillingCity"] != null && payload["BillingCity"] != "" && payload["BillingCity"].toString() != "[:]")
	mailaddress.setCity(payload["BillingCity"]);
if (payload["BillingState"] != null && payload["BillingState"] != "" && payload["BillingState"].toString() != "[:]")
	mailaddress.setState(payload["BillingState"]);
if (payload["BillingPostalCode"] != null && payload["BillingPostalCode"] != "" && payload["BillingPostalCode"].toString() != "[:]")
	mailaddress.setZip(payload["BillingPostalCode"]);
if (payload["BillingCountry"] != null && payload["BillingCountry"] != "" && payload["BillingCountry"].toString() != "[:]")
	mailaddress.setCountry(payload["BillingCountry"]);

Contact contact = new Contact();
contact.setPrintas(message.getSessionProperty("billingcontact"));
contact.setCompanyname(payload["Name"]);
contact.setContactname(contactname);
contact.setMailaddress(mailaddress);

ArrayList<Object> contacts = new ArrayList<Object>();
contacts.add(contact);

message.setInvocationProperty("contacts", contacts);

return payload;