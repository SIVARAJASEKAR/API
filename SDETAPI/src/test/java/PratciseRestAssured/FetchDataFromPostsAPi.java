package PratciseRestAssured;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class FetchDataFromPostsAPi {

	@Test
	public void getDataRequest()
	{
		Response resp = RestAssured.get("http://localhost:3000/posts");
		
		resp.prettyPrint();
	}
}








