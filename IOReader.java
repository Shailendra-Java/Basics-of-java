import java.io.*;
import java.util.Scanner;
class IOReader
{
	public static void main(String args[])
	{
		try
		{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter any String value");
		String str = br.readLine();
		System.out.println("Output = "+str);
		
		//String i/p using Scanner class
		Scanner s = new Scanner(System.in);
		System.out.println("Enter another String value");
		String str2 = s.next();
		System.out.println("Output = "+str2);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}