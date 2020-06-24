package JXParser;

import javax.xml.bind.JAXBException;

public class TestJavaXmlParser {

	public static void main(String[] args) throws JAXBException {

		Employee eobj = new Employee("Shakal", "Behind Taliban", "not sure", 420, 500000);
	
		JavaToXmlParser parser = new JavaToXmlParser();
		parser.marshalling(eobj);
	}

}
