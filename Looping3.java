import java.util.Scanner;
class Looping3
{
	public static void main(String a[])
	{
		Scanner s = new Scanner(System.in);
		int n=0;
		
		do
		{
			System.out.println("Enter 0 to break loop");
		    n = s.nextInt();
		}while(n != 0);
		System.out.println("Loop Break...");
	}
}