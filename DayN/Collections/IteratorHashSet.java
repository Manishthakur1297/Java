import java.util.*;
public class IteratorHashSet
{
	public static void main(String[] args)
	{
		HashSet v1 = new HashSet();
		v1.add(111);
		v1.add(222);
		v1.add(32453);
		v1.add(444);
		v1.add(234);

		Iterator e = v1.iterator();
		while(e.hasNext())
		{
			System.out.println(e.next());
		}
		
	}

}