package PratciseRestAssured;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CheckJsonPath {

	@Test
	public void fetchPerticularData()
	{
		Response resp = RestAssured.get("http://localhost:3000/posts/15");
		
		resp.prettyPrint();
		
		System.out.println("Fecth the rating of Selenium");
		
		Object obj1 = resp.jsonPath().get("employee.skills.selenium");
		System.out.println("Selenium Rating is : " + obj1);
		
		System.out.println("Fecth the rating of Manual");
		
		Object obj2 = resp.jsonPath().get("employee.skills.manual");
		System.out.println("manual Rating is : " + obj2);
		
		System.out.println("Fecth the name of employee");
		
		Object obj3 = resp.jsonPath().get("employee.name");
		System.out.println("name of employee is : " + obj3);
		
		System.out.println("Fecth the All Skills");
		
		Object obj4 = resp.jsonPath().get("employee.skills");
		System.out.println("All Skills is : " + obj4);
		
		System.out.println("Fecth the All Skills");
		
		HashMap<Object , Object> obj5 = resp.jsonPath().get("employee.skills");
		System.out.println("All Skills is : " + obj5);
	}
}
