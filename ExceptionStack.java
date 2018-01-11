import java.util.Scanner;
public class ExceptionStack
{
	public void first(int x, int y)
	{
		System.out.println("Inside first method");
		
		 second(x,y);
		
	}
	public void second(int a, int b)
	{
			System.out.println(a/b);
		
	}
	public static void main(String a[])
	{
		ExceptionStack es = new ExceptionStack();
		Scanner s = new Scanner(System.in);
		int n1,n2;
		try
		{
			System.out.println("Enter two values");
			n1 = s.nextInt();
			n2 = s.nextInt();
			System.out.println("Inside main method");
			try
			{
				es.first(n1,n2);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception Handeled in Main Method");
			}
		
		}catch(Exception nfe)
		{
			System.out.println("Error at "+nfe);
		}
		finally
		{
			System.out.println("Always execute...");
		}			
	}
}