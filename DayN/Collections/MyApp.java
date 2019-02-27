public class MyApp
{
	public static void main(String[] args)
	{
		try
		{
			Runtime rt = Runtime.getRuntime();
			System.out.println("Wait and see the magic------------");
			Thread.sleep(500);
			Process p1 = rt.exec("explorer.exe");
			Thread.sleep(500);
			Process p2 = rt.exec("calc.exe");
			Thread.sleep(500);
			Process p3 = rt.exec("notepad.exe");
			Thread.sleep(500);
			Process p4 = rt.exec("mspaint.exe");
			Thread.sleep(5000);

			p1.destroy();
			Thread.sleep(1000);
			p2.destroy();
			Thread.sleep(1000);
			p3.destroy();
			Thread.sleep(1000);
			p4.destroy();
			Thread.sleep(1000);

		}
		catch(Exception e)
		{
			System.out.println("Exception occured..........");
		}
	}

}