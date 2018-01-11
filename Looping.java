class Looping
{
	public static void main(String a[])
	{
		int i,j;
		for(i=1; i<=10; i++)
		{
			
			for(j=1; j<=10; j++)
			{
				System.out.print("\t"+(i*j));
			}
			System.out.println("\n");
		}
		System.out.println("Printing characters");
		for(char ch='A'; ch<='Z'; ch++)
		{
			System.out.print("\t"+ch);
		}
	}
}