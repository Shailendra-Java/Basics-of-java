import java.util.Scanner;
class DoWhile
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		char choice = 'n';
		do
		{
			System.out.println("Do you want to continue (y/n)");
			choice = sc.next().charAt(0);
		}while(choice!='n');
	}
}