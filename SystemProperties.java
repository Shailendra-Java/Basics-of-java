import java.util.Properties;
import java.util.Enumeration;
class SystemProperties
{
	public static void main(String a[])
	{
		Properties p = System.getProperties();
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements())
		{
			String pName = (String) e.nextElement();
			String property = p.getProperty(pName);
			System.out.println("Property:-  "+pName+"\n Value is =>  "+property+"'");
		}
	}
}