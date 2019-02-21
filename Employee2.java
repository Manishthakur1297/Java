import java.util.*;

interface fun
{
	public void raiseSalary(); 
}

class Clerk implements fun
{
	String name;
	int age;
	private float salary=8000F;
	private String designation="Clerk";
	
	public Clerk() {}
	
	public Clerk(String name, int age)
	{
		this.name = name;
		this.age= age;
	}
	
	public void display()
	{
		System.out.println("\nName : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Salary : "+getSalary());
		System.out.println("Designation : "+getDesignation()+"\n");
	}
	
	@Override
	public void raiseSalary() {
		this.salary = this.salary+2000;	
	}
	public String getDesignation() {
		return this.designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public float getSalary() {
		return this.salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

class Programmer extends Clerk implements fun
{
	private float salary=20000F;
	private String designation="Programmer";
	
	public Programmer(String name, int age)
	{
		super();
		this.name = name;
		this.age= age;
	}
	
	@Override
	public void raiseSalary() {
		this.salary = this.salary+5000;	
	}
	
	public String getDesignation() {
		return this.designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public float getSalary() {
		return this.salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}

class Manager extends Clerk implements fun
{
	//String name;
	//int age;
	private float salary=80000F;
	private String designation="Manager";
	
	public Manager(String name, int age)
	{
		super();
		this.name = name;
		this.age= age;
	}
	
	@Override
	public void raiseSalary() {
		this.salary = this.salary+10000;	
	}

	public String getDesignation() {
		return this.designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public float getSalary() {
		return this.salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}

public class Employee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Enter Details of Clerk-----------\n");
		System.out.print("Enter Name of Clerk : ");
		String name = sc.nextLine();
		System.out.print("Enter Age of Clerk : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		Clerk ck = new Clerk(name,age);
		
		System.out.println("\n\n----------Enter Details of Programmer-----------\n");
		System.out.print("Enter Name of Programmer : ");
		name = sc.nextLine();
		System.out.print("Enter Age of Programmer : ");
		age = sc.nextInt();
		sc.nextLine();

		Programmer pr = new Programmer(name,age);
		
		System.out.println("\n\n----------Enter Details of Manager-----------\n");
		System.out.print("Enter Name of Manager : ");
		name = sc.nextLine();
		System.out.print("Enter Age of Manager : ");
		age = sc.nextInt();
		sc.nextLine();

		Manager mr = new Manager(name,age);
		
		System.out.println("\n---------Salary before incrementing------------");
		ck.display();
		pr.display();
		mr.display();
		
		ck.raiseSalary();
		pr.raiseSalary();
		mr.raiseSalary();
		
		System.out.println("\n---------Salary after incrementing------------");
		ck.display();
		pr.display();
		mr.display();
	}

}