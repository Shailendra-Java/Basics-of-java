import java.io.*;
public class StringMethodsExample 
{
	public static void main(String[] args)
	{
		PrintWriter pw = new PrintWriter(System.out, true);
		String tc01 = "It was the best of times";
		String tc02 = "It was the wrost of times";
		if (tc01.equals(tc02))
		{
			pw.println("Strings match...");
		}
		if (tc01.contains("It was"))
		{
			pw.println("It was found");
		}
		String temp = tc02.replace("w", "NIIT_");
		pw.println(temp);
		pw.println(tc02.substring(4, 15));
	}
}

