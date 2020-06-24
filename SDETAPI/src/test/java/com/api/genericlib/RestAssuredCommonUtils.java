package com.api.genericlib;

import java.util.ArrayList;

import org.hamcrest.Matchers;
import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * @author Gaurav
 *
 * {@code} This is useful for all common scenarios for Rest API
 * @since 2020
 */

public class RestAssuredCommonUtils {
	/**
	 * @author Gaurav
	 *
	 * @param Response to fetch status code
	 * @param expected status code for validation
	 * 
	 * {@code} Its use for validation of status code of a API Response
	 */
	public void validateStatusCode(Response resp , int expectedStatusCode)
	{
		resp.then().assertThat().statusCode(expectedStatusCode);
		System.out.println("status code validation is successfull");
	}
	
	public void validateContentType(Response resp)
	{
		resp.then().assertThat().contentType(ContentType.JSON);
		System.out.println("content type validation is successfull");
	}
	
	/**
	 * @author Gaurav
	 * 
	 * @param resp to fetch Response Time
	 * @param rangeofWithInTime to ensure maximum time limit for response
	 */
	public void validateResponseTime(Response resp , long rangeofWithInTime)
	{
		resp.then().assertThat().time(Matchers.lessThan(rangeofWithInTime));
		System.out.println("Response Time validation is successfull");
	}
	
	public void validateKVPair(Response resp , String jsonpath , String expectedValue)
	{
		Object obj = resp.jsonPath().get(jsonpath);
		String actualValue = obj.toString();
		Assert.assertEquals(actualValue, expectedValue);
	}
	
	/**
	 * @author Rajshekhar
	 *
	 * @param ArrayList<Object> to fetch one by one object from list
	 * 
	 * {@code} Its used to convert Object List into String List
	 * 
	 * @return ArrayList<String> 
	 */
	public ArrayList<String> convertObjectList_To_StringList(ArrayList<Object> list)
	{
		ArrayList<String> s = new ArrayList<String>();
		for(Object obj : list)
		{
			String s1 = obj.toString();
			s.add(s1);
		}
		return s;
	}
	
	public String fetchTokenID(Response resp , String jsonPath)
	{
		Object objtoken = resp.jsonPath().get(jsonPath);
		return objtoken.toString();
	}
}















