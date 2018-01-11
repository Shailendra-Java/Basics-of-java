import java.util.Scanner;
class ScanTest
{
	public static void main(String a[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string value");
		String str = s.next();
		String str2=s.next();
		System.out.println("The 1st value is "+str+str2);
		System.out.println("\n\nEnter any integer value");
		int n = s.nextInt();
		System.out.println("The 2nd value is "+n);
		System.out.println("\n\nEnter any character ");
		char ch = s.next().charAt(0);
		System.out.println("The third value = "+ch);
		s.close();
	}
}