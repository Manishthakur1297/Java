public class Person
{
	String name;
	int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{

		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		return "";
	}	

}