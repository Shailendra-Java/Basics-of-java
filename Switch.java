import java.util.Scanner;
class Switch
{
	public void days()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter between 1 to 4");
		int n= s.nextInt();
		switch(n)
		{
			case 1:
				System.out.print("Monday");
				break;
			case 2:
				System.out.print("Tuesday");
				break;
			case 3:
				System.out.print("Wednesday");
				break;
			case 4:
				System.out.print("Thursday");
				break;
			default:
				System.out.print("Invalid value");
		}
	}
	public static void main(String a[])
	{
		Switch sw = new Switch();
		sw.days();
	}
}