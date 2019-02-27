import java.util.*;
import java.util.TreeSet;
public class TreeSetDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<Person> ts = new TreeSet<Person>(new AgeSorterDesc());
		ts.add(new Person("Manish",21));
		ts.add(new Person("Anish",20));
		ts.add(new Person("AJ",34));
		ts.add(new Person("RJ",43));
		ts.add(new Person("MJ",22));

		Iterator<Person> i = ts.iterator();
		while (i.hasNext()) 
		{ 
            		System.out.println(i.next()); 
        	} 
		

	}

}