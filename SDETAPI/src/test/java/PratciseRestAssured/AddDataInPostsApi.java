package PratciseRestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class AddDataInPostsApi {

	@Test
	public void createNewData()
	{
		// step 1 :- set the precondition
		RequestSpecification preConditionreq = RestAssured.given();
		
		// step 2 :- create json data
		JSONObject jobj = new JSONObject();
		
		jobj.put("name", "Amitabh");
		jobj.put("salary", 50000);
		jobj.put("age" , 69);
		
		// step 3 :- give json structure for data
		String jsondata = jobj.toJSONString();
		preConditionreq.body(jsondata);
		
		// step 4 :- set the content type for request
		preConditionreq.contentType(ContentType.JSON);
		
		// step 5 :- apply the precondition 

		RequestSender sender = preConditionreq.when();

		// step 6 :- send the request through sender & get the response
		Response resp = sender.post("http://dummy.restapiexample.com/api/v1/create");
		
		// step 7 :- set post condition
		ValidatableResponse vr = resp.then();
		
		// step 8 :- print entire response
		vr.log().all();
	}
}










