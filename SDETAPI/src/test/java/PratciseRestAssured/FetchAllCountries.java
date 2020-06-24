package PratciseRestAssured;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchAllCountries {

	@Test
	public void fetchAllCountry()
	{
		Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		
		System.out.println("Fetching captials of all countries: ");
		ArrayList<Object> ListOfCapital = resp.jsonPath().get("capital");
		System.out.println(ListOfCapital);
		
		Iterator<Object> it = ListOfCapital.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------------------");
		System.out.println("Total capitals are : " + ListOfCapital.size());
		
		System.out.println("-------------------------------------");
		System.out.println("Fetching specific data by index");
		Object obj = resp.jsonPath().get("capital[0]");
		System.out.println(obj);
	}
}










