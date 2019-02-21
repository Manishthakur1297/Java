import assignment.Clerk;
import assignment.Manager;
import assignment.Programmer;
import assignment.Emp;
import java.util.*;

public class MainMenu
{

	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Emp> c_arr = new ArrayList<Emp>();
    	
	public static void subMenu()
    	{
        	int s_choice = 1;
        	do
        	{
            		System.out.println("\n1. Clerk");
		    	System.out.println("2. Programmer");
		    	System.out.println("3. Manager");
		    	System.out.println("4. Exit");
		    	System.out.print("Enter choice : ");
		    	s_choice = sc.nextInt();
		    	sc.nextLine();
		    	switch(s_choice)
		    	{
		        	//count++;
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
		            		//Exit
		            		break;
				default:
					break;
		    	}
            
        	}while(s_choice!=4);
    	}
    
	public static void main(String[] args) {
		int m_choice = 1;
		do
		{
		    System.out.println("\n1. Create");
		    System.out.println("2. Display");
		    System.out.println("3. Raise Salary");
		    System.out.println("4. Exit");
		    System.out.print("Enter choice : ");
		    m_choice = sc.nextInt();
		    sc.nextLine();
		    switch(m_choice)
		    {
		        case 1:
		            	MainMenu.subMenu();
		            	break;
		        case 2:
		            	//Display
		            	for(Emp emp : c_arr)
				{
					Emp.display(emp);
					
				}
		            	break;
		        case 3:
		            	//Raise
				for(Emp emp : c_arr)
				{
					emp.raiseSalary();
				}
		            	break;
		        case 4:
		            	//Exit
		            	break;

			default:
				break;
		    }
		}while(m_choice!=4);

		System.out.println("Employee Count------>"+Emp.employeeCount);
		
	}
}