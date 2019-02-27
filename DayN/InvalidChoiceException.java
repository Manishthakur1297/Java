package assignment;
import java.util.*;

class InvalidChoiceException extends Exception
{
	public InvalidChoiceException()
	{
	}

	public InvalidChoiceException(String msg)
	{
		super(msg);
	}

	public int readMChoice()
	{
		int m_choice = 0;
		while(true)
		{
			/*System.out.println("-----------------------------");
		    	System.out.println("1. Create");
		    	System.out.println("2. Display");
		    	System.out.println("3. Raise Salary");
		    	System.out.println("4. Exit");
		    	System.out.println("-----------------------------");
			*/try
			{
				System.out.print("Enter choice : ");
				m_choice = new Scanner(System.in).nextInt();
				if(m_choice<0 || m_choice>4)
				{
					throw new InvalidChoiceException();
				}
				return m_choice;
				
			}
			catch(InputMismatchException e)
			{
				System.out.print("\nString is an invalid Choice  !!!! ");
				System.out.println(" Enter Valid Choice below.....\n");
			}
			catch(InvalidChoiceException e)
			{
				System.out.println("\nPlease Enter number between [1-4] only !!!\n");
			}
		}
	}


	public int readSChoice()
	{
		int m_choice = 0;
		while(true)
		{
		            	/*System.out.println("-----------------------------");
		                System.out.println("1. Clerk");
		        	System.out.println("2. Programmer");
		        	System.out.println("3. Manager");
		        	System.out.println("4. Exit");
		        	System.out.println("-----------------------------");
			*/try
			{
				System.out.print("Enter choice : ");
				m_choice = new Scanner(System.in).nextInt();
				if(m_choice<0 || m_choice>4)
				{
					throw new InvalidChoiceException();
				}
				return m_choice;
				
			}
			catch(InputMismatchException e)
			{
				System.out.print("\nString is an invalid Choice  !!!! ");
				System.out.println(" Enter Valid Choice below.....\n");
			}
			catch(InvalidChoiceException e)
			{
				System.out.println("\nPlease Enter number between [1-4] only !!!\n");
			}
		}
	}
}
