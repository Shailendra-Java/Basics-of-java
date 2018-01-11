class Static
{
	static int count;
	public static void display()
	{
		System.out.println("Count = "+count);
	}
	public static void main(String a[])
	{
		count = 10;
		display();
	}
}