package PratciseRestAssured;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static io.restassured.RestAssured.*;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddBulkData {

	@Test
	public void checkBulkPosting() throws IOException
	{
		File f = new File("./src/test/resources/BulkComplexData.json");
		FileInputStream fis = new FileInputStream(f);
		String jsondata = IOUtils.toString(fis , "UTF-8");
		
		Response resp = given()
						.body(jsondata)
						.contentType(ContentType.JSON)
						.when()
						.post("http://localhost:3000/posts");
		
		resp.then().log().all();
	}
}







