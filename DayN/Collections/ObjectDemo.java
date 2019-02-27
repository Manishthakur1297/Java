import java.lang.reflect.*;

//class A implements Cloneable
//{


//}

public class ObjectDemo
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName(args[0]);
		Object obj = c1.newInstance();

		System.out.println(obj);

		Method m[] = c1.getMethods();
		Field f[] = c1.getFields();
		Constructor c[] = c1.getConstructors();

		System.out.println("Class "+c1.getName());
		System.out.println("{");
		for(int i=0;i<m.length;i++)
		{
					
			System.out.println("\t"+m[i].getName()+"()");
		}
		
		System.out.println("}");
					

	}

}