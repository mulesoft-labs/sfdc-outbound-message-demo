import java.util.ArrayList;
import org.mule.module.intacct.schema.request.Contact;
import org.mule.module.intacct.schema.request.Contactname;
import org.mule.module.intacct.schema.request.Mailaddress;

Contactname contactname = new Contactname();
contactname.setvalue(payload["Name"]);

Mailaddress mailaddress = new Mailaddress();

mailaddress.setAddress1(payload["BillingStreet"]);
mailaddress.setCity(payload["BillingCity"]);
mailaddress.setState(payload["BillingState"]);
mailaddress.setZip(payload["BillingPostalCode"]);
mailaddress.setCountry(payload["BillingCountry"]);

Contact contact = new Contact();
contact.setPrintas(message.getSessionProperty("billingcontact"));
contact.setCompanyname(payload["Name"]);
contact.setContactname(contactname);
contact.setMailaddress(mailaddress);

ArrayList<Object> contacts = new ArrayList<Object>();
contacts.add(contact);

message.setSessionProperty("contacts", contacts);

return payload;