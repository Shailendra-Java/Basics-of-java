class PatternDemo
{
		public static void main(String[] x)
		{
			int i, j, k;
			for(i=1; i<=5; i++)
			{
				for(j=i; j<5; j++)
				{
					System.out.print(" ");
				}
				for(k=1; k<(i*2); k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			for(i=4; i>=1; i--)
			{
				for(j=5; j>i; j--)
				{
						System.out.print(" ");
				}
				for(k=1;k<(i*2);k++)
				{
						System.out.print("*");
				}
				System.out.println();
			}
		}
}