package PratciseRestAssured;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AssertionHeaderByRA {
	@Test
	public void checkHeaders()
	{
		Response resp = given()
				.when()
				.get("http://localhost:3000/posts");
		
		// status code validation
		resp.then().assertThat().statusCode(200);
		System.out.println("status code validation pass");
		System.out.println("------------------------------------------------------");
		
		// content type validation
		resp.then().assertThat().contentType(ContentType.JSON);
		System.out.println("content type validation pass");
		System.out.println("------------------------------------------------------");
		
		// response time validation
		resp.then().assertThat().time(Matchers.lessThan(5000l));
		System.out.println("Response time validation pass");
		System.out.println("--------------------------------------------------------");
		
		resp.then().log().all();
	}
}











