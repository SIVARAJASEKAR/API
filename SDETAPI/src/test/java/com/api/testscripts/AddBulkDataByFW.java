package com.api.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.api.genericlib.BaseClass;

import io.restassured.response.Response;

public class AddBulkDataByFW extends BaseClass{

	@Test
	public void checkBulkDataByFW() throws Exception
	{
		String apiTestData = config.getApiTestData("AddBulkData");
		Response resp = config.executeBulkPostRequest(apiTestData);
		
		rutil.validateStatusCode(resp, 201);
		rutil.validateContentType(resp);
		
		resp.then().log().all();
		
		System.out.println("Test Pass");
	}
}
