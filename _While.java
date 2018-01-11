class _While
{
	public static void main(String b[])
	{
		int i=5;
		int fact=1;
		while(i>=1)
		{
			fact=fact*i;
			i--;
		}
		System.out.print(fact);
	}
}