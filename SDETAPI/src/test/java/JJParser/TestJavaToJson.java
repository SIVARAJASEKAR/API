package JJParser;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestJavaToJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Person p = new Person("Anuj", "OAR", "male", 12, 50000);
		
		JavaToJsonParser parser = new JavaToJsonParser();
		parser.marshalling(p);
		
		System.out.println("pass");
	}
}
