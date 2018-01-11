import java.util.Scanner;
public class Calculator
{
	float num1,num2,result;
	public Calculator()
	{
		num1=0;
		num2=0;
		result=0;
	}
	public void addition()
	{
		result = num1+num2;
		System.out.println("Addition = "+result);
	}
	public void subtraction()
	{
		result = num1-num2;
		System.out.println("Subtraction = "+result);
	}
	public void division()
	{
		result = num1/num2;
		System.out.println("Division = "+result);
	}
	public void multiply()
	{
		result = num1*num2;
		System.out.println("Multiply = "+result);
	}
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		Calculator calc = new Calculator();
		System.out.println("Enter two numbers");
		calc.num1 = s.nextFloat();
		calc.num2 = s.nextFloat();
		System.out.println("Menu\n===================");
		System.out.println("1=> Addition\n2=>Subtraction\n3=>Division\n4=>Multiply");
		System.out.println("Enter your choice");
		int choice = s.nextInt();
		switch(choice)
		{
			case 1:
				calc.addition();
				break;
			case 2:
				calc.subtraction();
				break;
			case 3:
				calc.division();
				break;
			case 4:
				calc.multiply();
				break;
			default:
				System.out.println("Invalid choice!");
		}
	}
}