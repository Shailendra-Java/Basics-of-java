class StarPattern
{
	public static void main(String ar[])
	{
		for(int i=0; i<5; i++)
		{
			for(int j=i; j>=0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}