import java.util.Scanner;
class RunArray
{
	static int[][][] a=new int[2][2][2];
	public static void main(String ar[])
	{
		int i,j,k;
		Scanner s = new Scanner(System.in);
		for( i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				for(k=0; k<2; k++)
				{
					a[i][j][k]=s.nextInt();
				}
			}
		}
		for(i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				for(k=0; k<2; k++)
				{
					System.out.println("a["+i+"]["+j+"]["+k+"] = "+a[i][j][k]);
				}
			}
		}
	}
}