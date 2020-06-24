package JXParser;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaToXmlParser {

	public void marshalling(Employee eobj) throws JAXBException
	{
		// create a employee class object in form of JAXB
		JAXBContext jb = JAXBContext.newInstance(Employee.class);
		
		// Get The Marshaller interface reference
		Marshaller m = jb.createMarshaller();
		
		// Set the standard xml format
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		// Convert java eobj object into xml & print in console
		m.marshal(eobj, System.out);
		
		// Convert java eobj object into xml & saved in file
		m.marshal(eobj, new File("Emploey.xml"));
	}
}
