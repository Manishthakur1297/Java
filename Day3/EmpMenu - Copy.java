package assignment;
import java.util.*;

public class EmpMenu
{
	public static void MainMenu() 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Emp> c_arr = new ArrayList<Emp>();
		int m_choice = 1;
	/*	boolean b = true;
		do
		{
		    
			b=true;
			while(b)
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
					b = false;
				}
				catch(InputMismatchException e)
				{
					System.out.print("\nString is an invalid Choice  !!!! ");
					System.out.println(" Enter Valid Choice below.....\n");
			
				}
				sc.nextLine();
			}
	*/
		    switch(m_choice)
		    {
		        case 1:
		        	int s_choice = 1;
		            	do
		            	{
		    			b = true;
					while(b)
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
							b = false;
						}
						catch(InputMismatchException e)
						{
							System.out.print("\nString is an invalid Choice  !!!! ");
							System.out.println("Enter Valid Choice below.....\n");
						}
						sc.nextLine();
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