import java.util.*;
import java.io.*;
public class EmployeeStore
{

	public static String create(String name, int age)
	{
		Clerk ck = new Clerk(name,age);
		return name+"|"+age+"|"+ck.salary+"|"+ck.designation+"\n";
	}

	public static void display()
	{

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter File Name : ");
			String fname = br.readLine();

			File f = new File(fname);

			if(f.exists())
			{
				BufferedReader fr = new BufferedReader(new FileReader(f));
				String line = null;
				while((line=fr.readLine())!=null)
				{
					String[] st = line.split("\\|");
					//for(String s : st)
					//System.out.println(s);
					System.out.printf("Name : %s\nAge : %s\nSalary : %s\nDesignation : %s",st[0],st[1],st[2],st[3]);
					System.out.println();
				}

				fr.close();

			}
			else
			{
				System.out.println("Sorry ! File doesn't exist....");
			
			}
		
		}
		catch(Exception e)
		{

			System.out.println("Exception occured...." + e);
		}
	}

	public static void main(String[] args) throws IOException
	{
  	     try
	     {
		File f = new File("Employee.txt");
		if(f.exists())
		{
		}
		else
		{
			f.createNewFile();
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name of Clerk : ");
		String name = br.readLine();
		System.out.println("Enter Age of Clerk : ");
		int age = Integer.parseInt(br.readLine());
		String res = EmployeeStore.create(name,age);
		PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));					
		pw.println(res);
		pw.flush();
		pw.close();
		//f.close();

		display();
	      }
		catch(Exception e)
		{
			System.out.println("Exception caught...");
		}

	}

}