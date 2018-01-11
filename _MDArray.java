import java.util.Scanner;
class _MDArray
{
	int[][][] arr=new int[2][3][4];
	int i,j,k;
	public void acceptArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 24 values of Array");
		for(i=0; i<2; i++)
		{
			for(k=0; k<3; k++)
			{
				for(j=0;j<4; j++)
				{
				 arr[i][k][j]=sc.nextInt();
				}
			}
		}
	}
	public void displayArray()
	{
		for( k=0; k<2; k++)
		{
			for(int l=0; l<3; l++)
			{
				for(int x=0; x<4; x++)
				{
					System.out.println("arr["+k+"]["+l+"]["+x+"] = "+arr[k][l][x]);
				}
			}
		}
	}
	public static void main(String ar[])
	{
		_MDArray obj = new _MDArray();
		obj.acceptArray();
		obj.displayArray();
		
	}
}