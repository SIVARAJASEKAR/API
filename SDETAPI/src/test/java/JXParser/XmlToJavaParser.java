package JXParser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToJavaParser {

	public void unmarshalling(String filename) throws JAXBException
	{
		File FileToBeFetch = new File(filename);
		JAXBContext jb = JAXBContext.newInstance(Employee.class);
		Unmarshaller um = jb.createUnmarshaller();
		Employee eobj = (Employee)um.unmarshal(FileToBeFetch);
		System.out.println(eobj);
	}
}
