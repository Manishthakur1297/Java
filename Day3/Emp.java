package assignment; 
import java.util.*;
import java.io.*;
public abstract class Emp{
	public String name;
	public int age;
	public int salary;
	public String designation;
	public static int employeeCount=0;
	public Emp(String str)
	{
		System.out.println("Enter details of "+str+":-");
		Scanner in=new Scanner(System.in);
		System.out.print("\nEnter Name of "+str+" : ");
		name=in.next();
		try
		{
			System.out.print("Enter Age of "+str+" : ");
			age=in.nextInt();

			if(age<21 || age>60)
			{
				throw new InvalidAgeException("\nAge must be in range[21-60].... Please Enter Valid Age\n");
			}
		}
		catch(InputMismatchException|InvalidAgeException e)
		{
			age = new InvalidAgeException("Please Enter number between [21-60] only").readEmpAge();
			
		}
		employeeCount++;
	}
	public static final void display(Emp e){
		System.out.println("\nName : "+e.name);
		System.out.println("Age : "+e.age);
		System.out.println("Designation : "+e.designation);
		System.out.println("Salary : "+e.salary+"\n");
	}

	
	public abstract void raiseSalary();
}
