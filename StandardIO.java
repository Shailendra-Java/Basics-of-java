import java.io.*;
class StandardIO
{
	public static void main(String a[])
	{
		try
		{
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.println("Enter First Name");
			String s = br.readLine();
			System.out.println("Enter Last Name");
			String s2 = br.readLine();
			System.out.println("First Name = "+s+"\t Last Name = "+s2);
		}
		catch(Exception e)
		{
			System.out.println(" "+e);
		}
	}
}