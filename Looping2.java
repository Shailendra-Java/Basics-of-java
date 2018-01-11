import java.util.Scanner;
class Looping2
{
	public void disp()
	{
		Scanner s = new Scanner(System.in);
		int n=1;
		int count = 0;
		while(n != 0)
		{
			System.out.println("Enter 0 to break loop");
		    n = s.nextInt();
			count++;
		}
		System.out.println("Loop Break...");
		System.out.println("Total times loop execute: "+count);
	}
	public static void main(String a[])
	{
		Looping2 lp = new Looping2();
		lp.disp();
	}
}