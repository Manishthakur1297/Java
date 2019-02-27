import java.util.*;
class NameSorter implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		//Person p1 = (Person) o1;
		//Person p2 = (Person) o2;
		
		String n1 = p1.name;
		String n2 = p2.name;
		
		return n1.compareTo(n2);		

	}

}

class NameSorterDesc implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		//Person p1 = (Person) o1;
		//Person p2 = (Person) o2;
		
		String n1 = p1.name;
		String n2 = p2.name;
		
		return n2.compareTo(n1);		

	}

}

class AgeSorter implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		//Person p1 = (Person) o1;
		//Person p2 = (Person) o2;
		
		Integer n1 = p1.age;
		Integer n2 = p2.age;
		
		return n1.compareTo(n2);		

	}

}

class AgeSorterDesc implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		//Person p1 = (Person) o1;
		//Person p2 = (Person) o2;
		
		Integer n1 = p1.age;
		Integer n2 = p2.age;
		
		return n2.compareTo(n1);		

	}

}