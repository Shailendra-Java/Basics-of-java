class Array2D
{
	public static void main(String a[])
	{
		int[][] ar = new int[2][2];
		int i,j;
		ar[0][0] = 10;
		ar[0][1] = 20;
		ar[1][0] = 30;
		ar[1][1] = 40;
		for(i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				System.out.print(" "+ar[i][j]);
			}
			System.out.println();
		}
	}
}