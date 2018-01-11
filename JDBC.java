//STEP 1. Import required packages 

import java.sql.*; 
public class JDBC 
{
	// JDBC driver name and database URL 
	
	static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static final String DB_URL = "jdbc:sqlserver://FUTURE;databaseName=Temp";

	// Database credentials 
	
	static final String USER = "sa";
	static final String PASS = "123";

	public static void main(String[] args)
	{
		Connection conn = null;
		Statement stmt = null;
		try
		{
			//STEP 2: Register JDBC driver

			Class.forName(JDBC_DRIVER);
			
			//STEP 3: Open a connection
			
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			//STEP 4: Execute a query
			
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM Users";
			ResultSet rs = stmt.executeQuery(sql);
			
			//STEP 5: Extract data from result set

			while(rs.next())
			{
				//Retrieve by column name

				String first = rs.getString(1);
				String last = rs.getString(2);
				int mob = rs.getInt(3);

				//Display values

				System.out.print("First Name: " + first);
				System.out.print(", Last Name: " + last);
				System.out.print(", Mobile No: " + mob+"\n");
				
			}
			//STEP 6: Clean-up environment

			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se)
		{
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e)
		{
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally
		{
			//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
				}catch(SQLException se2)
				{ }// nothing we can do

				try
				{
					if(conn!=null)
						conn.close();
				}catch(SQLException se)
				{
					se.printStackTrace();
				}//end finally try
		}//end finally
		System.out.println("Goodbye!");
	}
}