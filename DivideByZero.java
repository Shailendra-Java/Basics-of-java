import java.util.Scanner;
class DivideByZero
{
	public static void main(String args[])
	{
		int num1,num2,result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two values");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		try
		{
			result = num1/num2;
		}catch(ArithmeticException aex)
		{
			System.out.println("Some problems Occur: "+aex);
			System.out.println("Provide a non-zero value");
		}
		finally
		{
			System.out.println("Inside finally block");
			System.out.println("Result = "+result);
			System.out.println("Program Execute successfully");
		}
	}
}