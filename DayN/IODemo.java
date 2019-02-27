import java.io.*;

public class IODemo
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter File Name : ");
			String fname = br.readLine();

			File f = new File(fname);

			if(f.exists())
			{
				BufferedReader fr = new BufferedReader(new FileReader(fname));
				String line = null;
				while((line=fr.readLine())!=null)
				{
					System.out.println(line);
				}

				fr.close();

			}
			else
			{
				System.out.println("Sorry ! File doesn't exist....");
			
			}
		
		}
		catch(Exception e)
		{

			System.out.println("Exception occured....");
		}

	}

}