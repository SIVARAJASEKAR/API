package PratciseRestAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Authentication {

	@Test
	public void checkAuth()
	{
		Response resp = given()
						.auth()
						.oauth2(getToken())
						.get("Authorised API");
		
		resp.then().log().all();
	}
	
	public String getToken()
	{
		Response resp = given()
				.auth()
				.basic("ToolsQA", "TestPassword")
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication");
			// Token provider API
		Object tokenIDObj = resp.jsonPath().get("FaultID");
		return tokenIDObj.toString();
	}
}
