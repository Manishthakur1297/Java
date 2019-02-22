public class ThreadDemo
{
	public static void main(String[] args)
	{
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();

		a1.start();
		b1.start();
		c1.start();
		
		System.out.println("----------Main-----------");

	}

}

class A extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("i = "+i);
		}
	}

}

class B extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("j = "+i);
		}
	}

}

class C extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("k = "+i);
		}
	}

}