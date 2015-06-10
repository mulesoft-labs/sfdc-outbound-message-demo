import java.util.ArrayList;
import org.mule.module.intacct.schema.request.Contact;

Contact contact = new Contact();
contact.setPrintas("UPDATED " + message.getSessionProperty("billingcontact"));

ArrayList<Object> contacts = new ArrayList<Object>();
contacts.add(contact);

message.setSessionProperty("updatecontacts", contacts);

return payload;