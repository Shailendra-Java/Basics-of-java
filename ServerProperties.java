import java.util.Properties;
import java.io.*;
import java.util.Enumeration;
public class ServerProperties
{
	public static void main(String[] args)
	{
		Properties myProps = new Properties();

		try 
		{
			FileInputStream fis = new FileInputStream("catalina.properties");
			myProps.load(fis);
		} catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		// Print Values
		Enumeration e = myProps.propertyNames();
		while(e.hasMoreElements())
		{
			String pName = (String) e.nextElement();
			String property = myProps.getProperty(pName);
			System.out.println("Property:-  "+pName+"\n Value is :-  "+property+"'");
		}
		/*System.out.println("Server: " + myProps.getProperty("hostName"));
		System.out.println("User: " + myProps.getProperty("userName"));
		System.out.println("Password: " + myProps.getProperty("password"));*/
	}
}
