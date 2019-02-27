import java.sql.*;
import java.io.*;
public class PreparedStatement
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			
			/*
			CallableStatement ctmt = conn.prepareCall("CALL ?");
			System.out.println("Enter procedure name : ");
			ctmt.setString(1,br.readLine());
			ctmt.execute();
			ctmt.close();
			*/
			
			conn.setAutoCommit(false);
			
			PreparedStatement ptmt = conn.prepareStatement("insert into EMP(NAME,AGE) values(?,?)");
			for(int i=0;i<10;i++)
			{
				System.out.println("Enter name : ");
				String name = br.readLine();
				System.out.println("Enter age : ");
				int age = Integer.parseInt(br.readLine());
				ptmt.setString(1,name);
				ptmt.setInt(2,age);
				ptmt.execute();
			if(i==5)
			{
				conn.rollback();
			}
			if(i==10)
			{
				conn.commit();
			}
			}
				ptmt.close();
	
			/*
			Statement stmt = conn.createStatement();
			stmt.addBatch("insert into EMP values('Manish',21)");
			stmt.addBatch("insert into EMP values('Manish',21)");
			stmt.addBatch("insert into EMP values('Manish',21)");
			stmt.addBatch("insert into EMP values('Manish',21)");
			stmt.addBatch("insert into EMP values('Manish',21)");
			stmt.addBatch("insert into EMP values('Manish',21)");
			stmt.addBatch("insert into EMP values('Manish',21)");
			stmt.addBatch("insert into EMP values('Manish',21)");
			stmt.addBatch("insert into EMP values('Manish',21)");
			System.out.println("Wait 5 seconds.........");
			Thread.sleep(5000);
			stmt.executeBatch();
			System.out.println("Done.....");
			stmt.close();
			*/

			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception e");
		}

	}

}