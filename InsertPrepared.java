import java.sql.*;
class InsertPrepared
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");
			stmt.setInt(1,101);
			stmt.setString(2,"Ratan");
			int i=stmt.executeUpdate();
			System.out.println(i+" records inserted");
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		} 
	}
}