import java.io.*;

public class IORandomFile
{
	public static void main(String[] args)
	{
		try
		{
		/*	RandomAccessFile raf = new RandomAccessFile("abc.txt","rw");
			raf.seek(raf.length());
			raf.writeBytes("JUST FOR DEMO");
			raf.close();

			PrintWriter pw1 = new PrintWriter(System.out);
			PrintWriter pw = new PrintWriter(new FileOutputStream("abc.txt",true));
			pw.println("HELLO EVERYBODY");
			pw.flush();
			pw.close();
		*/

			File dir1 = new File("abc");
			dir1.mkdir();
			File dir2 = new File(dir1,"xyz");
			dir2.mkdir();	
			File f = new File(dir2,"atoz.txt");
			f.createNewFile();

			PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));					
			pw.println(args[0]);
			pw.flush();
			pw.close();
		

		}

		catch(Exception e)
		{
			System.out.println("Exception caught......");
		}

	}

}