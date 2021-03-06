package assignment;
import java.util.*;

public class EmpMenu
{
	public static void MainMenu() 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Emp> c_arr = new ArrayList<Emp>();
		int m_choice = 0,s_choice=0;
		do
		{
		
		System.out.println("-----------------------------");
		System.out.println("1. Create");
		System.out.println("2. Display");
		System.out.println("3. Raise Salary");
		System.out.println("4. Exit");
		System.out.println("-----------------------------");
		try
		{
			System.out.print("Enter choice : ");
			m_choice = sc.nextInt();
			if(m_choice<0 || m_choice>4)
			{
				throw new InvalidChoiceException();
			}
		}
		catch(InputMismatchException|InvalidChoiceException e)
		{
			m_choice = new InvalidChoiceException().readMChoice();
		}
		switch(m_choice)
		{
		        case 1:
				do
				{
		            	System.out.println("-----------------------------");
		                System.out.println("1. Clerk");
		        	System.out.println("2. Programmer");
		        	System.out.println("3. Manager");
		        	System.out.println("4. Exit");
		        	System.out.println("-----------------------------");
		try
		{
			System.out.print("Enter choice : ");
			s_choice = sc.nextInt();
			if(s_choice<0 || s_choice>4)
			{
				throw new InvalidChoiceException();
			}
		}
		catch(InputMismatchException|InvalidChoiceException e)
		{
			s_choice = new InvalidChoiceException().readSChoice();
		}

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
		        		        default:
							System.out.println("\nPlease Enter number between [1-4] only !!!\n");
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
		        default:
				System.out.println("\nPlease Enter number between [1-4] only !!!\n");
		       		break;
		    }
		}while(m_choice!=4);

	System.out.println("Employee Count------>"+Emp.employeeCount);
		
	}
	
}