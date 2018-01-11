class For
{
	public static void main(String a[])
	{
		int i;
		for(i=1; i>0; i++)
		{
			if(i==10)
			{
				break;
			}
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}