package assignment; 
import java.util.*;
import java.io.*;
public abstract class Emp{
	public String name;
	public int age;
	public int salary;
	public String designation;
	public static int employeeCount=0;
	public Emp(int salary, String designation)
	{
		System.out.println("Enter details of "+designation+":-");
		Scanner in=new Scanner(System.in);
		System.out.print("\nEnter Name of "+designation+" : ");
		name=in.next();
		try
		{
			System.out.print("Enter Age of "+designation+" : ");
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

		this.salary = salary;
		this.designation = designation;
		try
		{
			PrintWriter out = new PrintWriter(new FileOutputStream("Employee.txt",true));
			out.println(this.name+"|"+this.age+"|"+this.salary+"|"+this.designation);
			out.flush();
			out.close();
			
		}
		catch(Exception e)
		{

			System.out.println("Excvtbyt");
		}
		

		employeeCount++;
	}

	
	@Override
	public String toString(){
		//String res = "";
		//res+="\nName : "+name+"\nAge : "+age+"\nDesignation : "+designation+"\nSalary : "+salary+"\n";
		//return res;

		System.out.println("\nName : "+name);
		System.out.println("Age : "+age);
		System.out.println("Designation : "+designation);
		System.out.println("Salary : "+salary+"\n");
		return "";
		
	}
	
	public abstract void raiseSalary();

	public static void display()
	{
		try
		{

			File f = new File("Employee.txt");
			if(f.exists())
			{
				BufferedReader fr = new BufferedReader(new FileReader(f));
				String line = null;
				while((line=fr.readLine())!=null)
				{
					StringTokenizer st = new StringTokenizer(line,"|");
					System.out.println("\nName : "+st.nextToken());
					System.out.println("Age : "+st.nextToken());	
					System.out.println("Salary : "+st.nextToken());	
					System.out.println("Designation : "+st.nextToken());					
					System.out.println();
				}

				fr.close();

			}
			else
			{
				System.out.println("Sorry ! No Employee Record exists....");
			
			}
		
		}
		catch(Exception e)
		{

			System.out.println("Exception occured...." + e);
		}

		/*finally
		{
			try
			{
				if(f!=null)
					f.close();
			}
			catch(Exception e)
			{
				System.out.println("Exception caught");
			}
		}*/

	}

}
