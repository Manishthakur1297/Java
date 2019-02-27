package assignment;
import java.util.*;

class SortByName implements Comparator<Emp>
{
	public int compare(Emp e1, Emp e2)
	{
		int n = e1.name.compareTo(e2.name);
		int a = e1.age-e2.age;
		int s = e1.salary-e2.salary;
		int d = e1.designation.compareTo(e2.designation);
		if(n!=0)
		{ 
			return n; 
		}
		else
		{
			if(a==0)
			{
				return ((s==0)?d:s);
			}
			else
			{
				return a;
			}
			
		}


	}
}

class SortByAge implements Comparator<Emp>
{
	public int compare(Emp e1, Emp e2)
	{
		int n = e1.name.compareTo(e2.name);
		int a = e1.age-e2.age;
		int s = e1.salary-e2.salary;
		int d = e1.designation.compareTo(e2.designation);
		if(a!=0)
		{ 
			return a; 
		}
		else
		{
			if(n==0)
			{
				return ((s==0)?d:s);
			}
			else
			{
				return n;
			}
			
		}
	}
}

class SortBySalary implements Comparator<Emp>
{
	public int compare(Emp e1, Emp e2)
	{
		int n = e1.name.compareTo(e2.name);
		int a = e1.age-e2.age;
		int s = e1.salary-e2.salary;
		int d = e1.designation.compareTo(e2.designation);
		if(s!=0)
		{ 
			return s; 
		}
		else
		{
			if(n==0)
			{
				return ((a==0)?d:a);
			}
			else
			{
				return n;
			}
			
		}
	}
}

class SortByDesignation implements Comparator<Emp>
{
	public int compare(Emp e1, Emp e2)
	{
		int d = e1.designation.compareTo(e2.designation);
		int n = e1.name.compareTo(e2.name);
		int a = e1.age-e2.age;
		int s = e1.salary-e2.salary;
		if(d!=0)
		{ 
			return d; 
		}
		else
		{
			if(n==0)
			{
				return ((a==0)?s:a);
			}
			else
			{
				return n;
			}
			
		}
	}
}