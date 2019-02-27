package assignment;
import java.util.*;

public class EmpMenu
{
	public static void MainMenu() 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Emp> c_arr = new ArrayList<Emp>();
		int m_choice = 1;
		do
		{
			System.out.println("-----------------------------");
		    System.out.println("1. Create");
		    System.out.println("2. Display");
		    System.out.println("3. Raise Salary");
		    System.out.println("4. Exit");
		    System.out.println("-----------------------------");
		    System.out.print("Enter choice : ");
		    m_choice = sc.nextInt();
		    sc.nextLine();
		    switch(m_choice)
		    {
		        case 1:
		        		int s_choice = 1;
		            	do
		            	{
		            		System.out.println("-----------------------------");
		                    System.out.println("1. Clerk");
		        		    System.out.println("2. Programmer");
		        		    System.out.println("3. Manager");
		        		    System.out.println("4. Exit");
		        		    System.out.println("-----------------------------");
		        		    System.out.print("Enter choice : ");
		        		    s_choice = sc.nextInt();
		        		    sc.nextLine();
		        		    switch(s_choice)
		        		    {
		        		        case 1:
		        		            	c_arr.add(new Clerk());
		        		            	break;
		        		       	case 2:
		        		            	c_arr.add(new Programmer());
		        		            	break;
		        		        case 3:
		        		            	c_arr.add(new Manager());
		        		            	break;
		        		        case 4:
		        		            	break;
		        		    }
		                    
		                }while(s_choice!=4);
		            	break;
		        case 2:
		            	for(Emp emp : c_arr)
		            	{
		            		Emp.display(emp);
		            	}
		            	break;
		        case 3:
		        	for(Emp emp : c_arr)
		        	{
						emp.raiseSalary();
					}
		            break;
		        case 4:
		            break;
		    }
		}while(m_choice!=4);

		System.out.println("Employee Count------>"+Emp.employeeCount);
		
	}
	
}