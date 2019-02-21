package assignment; 
import java.util.*;
public abstract class Emp{
	public String name;
	public int age;
	public int salary;
	public String designation;
	public static int employeeCount=0;
	public Emp(String str){
		System.out.println("Enter details of "+str+":-");
		Scanner in=new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		name=in.next();
		System.out.print("Enter Age : ");
		age=in.nextInt();
		employeeCount++;
	}
	public static final void display(Emp e){
		System.out.println("\nName:"+e.name);
		System.out.println("Age:"+e.age);
		System.out.println("Designation"+e.designation);
		System.out.println("Salary:"+e.salary+"\n");
		//System.out.println();
		//System.out.println();
	}

	
	public abstract void raiseSalary();
}
