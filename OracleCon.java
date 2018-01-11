import java.sql.*;
import java.util.Scanner;
class OracleCon
{
	static Connection con=null;
	Statement st=null;
	PreparedStatement ps=null;
	String name,sem;
	long rollNo,phone;
	Scanner s;
	public OracleCon()
	{
		s = new Scanner(System.in);
		try
		{
			//step1 load the driver class 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			//step2 create the connection object 
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","123"); 
			//step3 create the statement object 
			st = con.createStatement();
		}catch(Exception sqe)
		{
			System.err.println("Error: "+sqe);
		}
	}
	public void createTable()
	{
		try{
			String query = "CREATE TABLE Student(RollNo Number(5),Name varchar2(20),"
							+"Phone number(10),Semester varchar2(10))";
			boolean check = st.execute(query);
			if(!check)
				System.out.println("Table created");
			else
				System.out.println("Table creation failed!");
		}catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
	public void insert()
	{
		System.out.println("Enter RollNo");
		rollNo = s.nextLong();
		System.out.println("Enter Name of student");
		name = s.next();		
		System.out.println("Enter Phone Number");
		phone = s.nextLong();
		System.out.println("Enter Semester");
		sem = s.next();
		 try
		 {
			String query = "insert into System.Student values(?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setLong(1,rollNo);
			ps.setString(2,name);
			ps.setLong(3,phone);
			ps.setString(4,sem);
			int check = ps.executeUpdate();
			if(check>0)
				System.out.println("Record inserted");
			else
				System.out.println("Insertion failed!");
			   
   	     }catch(SQLException e)
		 {
			 System.out.println(e);
		 } 
		 
	}
	public void display()
	{
		try
		 {
			//step4 execute query 
			ResultSet rs=st.executeQuery("select * from System.Student"); 
			System.out.println("RollNo\tName\tPhone\tSemster");
			while(rs.next())
			{
				
				System.out.print(""+rs.getInt(1));
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t"+rs.getLong(3));
				System.out.println("\t"+rs.getString(4));
			}
			   
   	     }catch(SQLException e)
		 {
			 System.out.println(e);
		 } 
		
	}
	public void updateRecord()
	{
		System.out.println("Enter RollNo of Student");
		rollNo = s.nextLong();
		System.out.println("Enter Name to update");
		name = s.next();
		try
		{
			String query = "Update System.Student set Name='"+name+"' where rollNo="+rollNo;
			int rows = st.executeUpdate(query);
			if(rows>0)
				System.out.println("Record updated...");
			else
				System.out.println("Updation failed!");
		}catch(SQLException sqe)
		{
			System.out.println("Error: "+sqe);
		}
	}
	public void deleteRecord()
	{
		System.out.println("Enter RollNo of Student");
		rollNo = s.nextLong();
		try
		{
			String query = "Delete from System.Student where rollNo="+rollNo;
			int rows = st.executeUpdate(query);
			if(rows>0)
				System.out.println("Record deleted");
			else
				System.out.println("Deletion failed!");
		}catch(SQLException sqe)
		{
			System.out.println("Error: "+sqe);
		}
	}
	public void dropTable()
	{
		try{
			boolean check = st.execute("DROP TABLE System.Student");
			if(!check)
				System.out.println("Table deleted");
			else
				System.out.println("Table deletion failed!");
		}catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char option='y';
		OracleCon oc = new OracleCon();
		do
		{
			System.out.println("Menu\n1) Create Table\n2) Insert\n3) Display\n4) Update\n5) Delete\n6) Drop Table");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					oc.createTable();
					break;
				case 2:
					oc.insert();
					break;
				case 3:
					oc.display();
					break;
				case 4:
					oc.updateRecord();
					break;
				case 5:
					oc.deleteRecord();
					break;
				case 6:
					oc.dropTable();
					break;
				default:
					System.out.println("Invalid Value");
			}
			System.out.println("Do you want to continue(y/n)");
			option = sc.next().charAt(0);
		}while(option=='y' || option=='Y');
		 try{
			con.close();
			}catch(Exception e)
			{} 
	}
}