package JXParser;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Employee")
public class Employee {

	String name, address, gender;
	int id, salary;
	
	Employee(String name, String address, String gender, int id, int salary)
	{
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.id = id;
		this.salary = salary;
	}
	Employee()
	{
		
	}
	@XmlElement
	public  String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@XmlElement
	public  String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	@XmlAttribute
	public  String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	@XmlAttribute
	public  int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	@XmlElement
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

		return "Employee Data is [ " +" name = "+ name + " id = "+id + " gender = "+gender +
				" address = "+address + " salary = "+salary + " ]" ;
	}
}
