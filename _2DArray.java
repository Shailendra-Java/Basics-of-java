import java.util.Scanner;
class _2DArray
{
	int[][] arr=new int[3][3];
	int i,k;
	public void acceptArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 9 values of Array");
		for(i=0; i<3; i++)
		{
			for(k=0; k<3; k++)
			{
				arr[i][k]=sc.nextInt();
			}
		}
	}
	public void displayArray()
	{
		for( k=0; k<3; k++)
		{
			for(int l=0; l<3; l++)
			{
				System.out.print("\t"+arr[k][l]);
			}
			System.out.println();
		}
	}
	public static void main(String ar[])
	{
		_2DArray obj = new _2DArray();
		obj.acceptArray();
		obj.displayArray();
		
	}
}