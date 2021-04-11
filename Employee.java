package Assignment3;
import java.io.*;
import java.util.*;

public class Employee
{
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee()
	{
		this.name = "";
		this.idNumber = 0;
		this.department = "";
		this.position = "";
	}
	
	public Employee(String nme, int id, String dept, String pos)
	{
		this.name = nme;
		this.idNumber = id;
		this.department = dept;
		this.position = pos;	
	}
	
	public Employee(String nme, int id)
	{
		this.name = nme;
		this.idNumber = id;
		this.department = "";
		this.position = "";
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getIdNumber()
	{
		return idNumber;
	}
	
	public void setIdNumber(int id)
	{
		this.idNumber = id;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public void setDepartment(String dept)
	{
		this.department = dept;
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public void setPosition(String pos)
	{
		this.position = pos;
	}
	
	public String toString()
	{
       return String.format("%-22s%-12s%-22s%-22s", name, idNumber, department, position);
    }
}