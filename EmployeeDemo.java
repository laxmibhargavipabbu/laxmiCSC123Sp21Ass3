package Assignment3;
import java.io.*;
import java.util.*;

public class EmployeeDemo
{
	public static void main(String [] args)
	{
		Employee emp1 = new Employee("Susan Meyers",47899,"Accounting","Vice President");
		Employee emp2 = new Employee("Mark Jones",39119,"IT","Programmer");
		Employee emp3 = new Employee("Joy Rogers",81774,"Manufacturing","Engineer");  
		System.out.printf("\n");
		System.out.println("Employee #1");
        System.out.printf("Name: "+emp1.getName()+"\n");
        System.out.printf("ID Number: "+emp1.getIdNumber()+"\n");
        System.out.printf("Department: "+emp1.getDepartment()+"\n");
        System.out.printf("Position: "+emp1.getPosition()+"\n");
        System.out.printf("\n");
        System.out.println("Employee #2");
        System.out.printf("Name: "+emp2.getName()+"\n");
        System.out.printf("ID Number: "+emp2.getIdNumber()+"\n");
        System.out.printf("Department: "+emp2.getDepartment()+"\n");
        System.out.printf("Position: "+emp2.getPosition()+"\n");
        System.out.printf("\n");
        System.out.println("Employee #3");
        System.out.printf("Name: "+emp3.getName()+"\n");
        System.out.printf("ID Number: "+emp3.getIdNumber()+"\n");
        System.out.printf("Department: "+emp3.getDepartment()+"\n");
        System.out.printf("Position: "+emp3.getPosition()+"\n");
        System.out.printf("\n");
        System.out.printf("%-22s%-12s%-22s%-22s\n","Name","ID Number","Department","Position");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        
	}
}