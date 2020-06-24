package JJParser;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestJsonToJava {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		File filename = new File("person.json");
		JsonToJavaParser parser = new JsonToJavaParser();
		Person pobj = parser.unmarshalling(filename, Person.class);
		System.out.println(pobj);
	}

}
