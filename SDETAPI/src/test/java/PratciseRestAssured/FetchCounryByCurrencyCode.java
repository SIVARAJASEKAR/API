package PratciseRestAssured;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchCounryByCurrencyCode {

	@Test
	public void getCuntryNameByCurrancy()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("ENter the code to be compare: ");
		String code = s.next();
		Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		ArrayList<Object> allCode = resp.jsonPath().get("currencies.code");
		System.out.println(allCode);
		ArrayList<String> lst = converter(allCode);
		String countryName = FindCountryByCurrancyCode(lst, resp, code);
		System.out.println("The " + code + " is associated with country: " + countryName);
	}

	public ArrayList<String> converter(ArrayList<Object> list)
	{
		ArrayList<String> s = new ArrayList<String>();
		for(Object obj : list)
		{
			String s1 = obj.toString();
			s.add(s1);
		}
		return s;
	}
	public String FindCountryByCurrancyCode(ArrayList<String> list , Response resp , 
			String codeToBeCompare)
	{
		String countryName = null;
		System.out.println(list.contains(codeToBeCompare));
		if(list.contains(codeToBeCompare))
		{
			int index = list.indexOf(codeToBeCompare);
			System.out.println(index);
			countryName = resp.jsonPath().get("name[" + index + "]");
		}else{
			throw new RuntimeException("Invalid Country Code");
		}
		return countryName;
	}

	
}









