package JXParser;

import javax.xml.bind.JAXBException;

public class TestXmljavaParser {

	public static void main(String[] args) throws JAXBException {

		XmlToJavaParser parser = new XmlToJavaParser();
		parser.unmarshalling("Emploey.xml");
	}

}
