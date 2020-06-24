package PratciseRestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class CreateComplexData {

	@Test
	public void AddComplexData()
	{
		RequestSpecification req = RestAssured.given();
		
		JSONObject jobj1 = new JSONObject();
		jobj1.put("java" , "very good");
		jobj1.put("selenium" , "good");
		jobj1.put("manual" , "average");

	     JSONObject jobj2 = new JSONObject();
		jobj2.put("name" , "anuj");
		jobj2.put("id" , 12);
		jobj2.put("skills" , jobj1);

	     JSONObject jobj3 = new JSONObject();
		jobj3.put("employee" , jobj2);

		String jsondata = jobj3.toJSONString();
		req.body(jsondata);
		req.contentType(ContentType.JSON);
		
		RequestSender sender = req.when();
		Response resp = sender.post("http://localhost:3000/posts");
		
		resp.then().log().all();
	}
}
