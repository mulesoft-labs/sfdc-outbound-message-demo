import javax.xml.bind.*
import javax.xml.namespace.QName

JAXBContext context = JAXBContext.newInstance(payload.class);
StringWriter sw = new StringWriter();
context.createMarshaller().marshal(new JAXBElement(new QName("urn:sobject.partner.soap.sforce.com","queryresult"),payload.class,payload),sw);
return sw.toString()
