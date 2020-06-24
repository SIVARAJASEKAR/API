package PratciseRestAssured;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class CheckSample {

	@Test
	public void check()
	{
		ArrayList<String> s = new ArrayList<String> ();
		
		s.add("[AFN]");
		s.add("[USD]");
		s.add("[AUD]");
		s.add("[AUR]");
		
		String code = "[USD]";
		System.out.println(s);
		if(s.contains(code))
		{
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}
}
