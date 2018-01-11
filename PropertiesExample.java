import java.util.*;
import java.io.*;
class PropertiesExample
{
	public static void main(String[] args) 
	{
		Properties myProps = new Properties();

		try 
		{
			FileInputStream fis = new FileInputStream("ServerInfo.txt");
			myProps.load(fis);
		} catch (IOException e) 
		{
			System.out.println("Error: " + e.getMessage());
		}
		// Print Values
		System.out.println("Server: " + myProps.getProperty("hostName"));
		System.out.println("User: " + myProps.getProperty("userName"));
		System.out.println("Password: " + myProps.getProperty("password"));
	}
}
