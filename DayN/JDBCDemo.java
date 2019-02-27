import java.sql.*;


public class JDBCDemo
{
	public static void main(String[] args)
	{
		try
		{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into EMP values('Manish',21)");
			//stmt.executeUpdate("delete from EMP where AGE>30");
			//stmt.executeUpdate("update EMP set AGE=AGE+1");
			ResultSet rs = stmt.executeQuery("select * from EMP");

			while(rs.next())
			{
				System.out.println("Name : "+rs.getString(1));
				System.out.println("Age : "+rs.getInt(2));
				System.out.println();
			}
			rs.close();
			stmt.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured....");
		}
	}

}