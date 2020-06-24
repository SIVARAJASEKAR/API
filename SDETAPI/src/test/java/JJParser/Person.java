package JJParser;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value = {
		"name",
		"id",
		"gender",
		"address",
		"salary"
})
public class Person {

	String name, address, gender;
	int id, salary;
	
	Person(String name, String address, String gender, int id, int salary)
	{
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.id = id;
		this.salary = salary;
	}
	Person()
	{
		
	}
	
	public  String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public  String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public  String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public  int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public  int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	@Override
	public String toString() {

		return "Person Data is [ " +" name = "+ name + " id = "+id + " gender = "+gender +
				" address = "+address + " salary = "+salary + " ]" ;
	}
}
