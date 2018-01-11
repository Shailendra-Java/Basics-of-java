class Ascii
{
	public static void main(String a[])
	{
		char c;
		int i;
		for(i=0; i<=128; i++)
		{
			c=(char)i;
			System.out.print("  "+c);
		}
	}
}