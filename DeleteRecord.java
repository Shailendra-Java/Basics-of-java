import java.util.Scanner;
import java.sql.*;
public class DeleteRecord
{
		public void delete()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter RollNo");
			int rollno = sc.nextInt();
			try
			 {
				Class.forName("oracle.jdbc.driver.OracleDriver"); 
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123"); 
				PreparedStatement ps = con.prepareStatement("delete from Students where RollNo=?");
				ps.setInt(1,rollno);
				int i = ps.executeUpdate();
				System.out.println(i+" Record Deleted");
			 }
			 catch(Exception e)
			 {
				 System.out.println("Error : "+e);
			 }
		}
}