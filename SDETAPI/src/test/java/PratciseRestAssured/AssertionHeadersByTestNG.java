package PratciseRestAssured;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class AssertionHeadersByTestNG {

	@Test
	public void checkAssertion()
	{
		Response resp = given()
				.when()
				.get("http://localhost:3000/posts");
		
		// status code validation
		int actstatuscode = resp.getStatusCode();
		int expStatuscode = 200;
		Assert.assertEquals(actstatuscode, expStatuscode);
		System.out.println("status code validation pass");
		System.out.println("------------------------------------------------------");
		
		// content type validation
		String actcontentType = resp.getContentType();
		Assert.assertEquals(actcontentType, "application/json; charset=utf-8");
		System.out.println("Content type validation pass");
		System.out.println("------------------------------------------------------");
		
		// response time validation
		long timeInMS = resp.getTime();
		Assert.assertTrue(timeInMS < 7000);
		System.out.println("Response time is less than 7000");
		System.out.println("------------------------------------------------------");
		
		// Response  data validation
		ArrayList<Object> actName = resp.jsonPath().get("employee.name");
		System.out.println("actual name is : " + actName.get(2));
		String name = actName.get(2).toString();
		Assert.assertEquals(name, "anuj");
		System.out.println("------------------------------------------------------");
		
		resp.then().log().all();
	}
}











