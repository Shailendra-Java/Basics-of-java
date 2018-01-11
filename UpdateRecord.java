import java.util.Scanner;
import java.sql.*;
public class UpdateRecord
{
	public void update()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Name to update");
		String name = sc.next();
		System.out.println("Enter Last Name to update");
		String name2 = sc.next();
		System.out.println("Enter RollNo");
		int rollno = sc.nextInt();
		try
		 {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123"); 
			PreparedStatement ps = con.prepareStatement("update Students set Name=?, LName=? where RollNo=?");
			ps.setString(1,name);
			ps.setString(2,name2);
			ps.setInt(3,rollno);
			int i = ps.executeUpdate();
			System.out.println(i+" Record Updated");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Error : "+e);
		 }
	}
}