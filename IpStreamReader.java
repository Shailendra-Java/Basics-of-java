import java.io.*;
class IpStreamReader
{
	public static void main(String a[])
	{
		String input;
		try
		{
			InputStreamReader obj = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(obj);
			System.out.println("Enter any value");
			input = br.readLine();
			System.out.println("Data from standard Input = "+input);
		}catch(IOException e)
		{
			System.out.println("Exception reading input");
		}
	}
}