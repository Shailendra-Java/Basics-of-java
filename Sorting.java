import java.util.Scanner;
class Sorting
{
	static int[] a = new int[10];
	static int i,j;
	
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=1; i<a.length; i++)
		{
			for(j=0; j<10-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(i=a.length-1; i>=0; i--)
		{
			System.out.print("  "+a[i]);
		}
	}
	
}