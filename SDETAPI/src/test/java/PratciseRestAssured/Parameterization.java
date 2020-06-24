package PratciseRestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Parameterization {

	@Test
	public void checkParameter()
	{
		Response resp = given()
						.param("userId", "7")
						.pathParam("x", "posts")
						.when()
						.get("https://jsonplaceholder.typicode.com/{x}");
		
		resp.then().log().all();
	}
}
