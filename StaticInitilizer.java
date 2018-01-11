class StaticInitilizer
{
	static int x;
	static String s;
	static
	{
		x = 10;
		s = "Hello";
		System.out.println("Before main method x= "+x+" S = "+s);
	}
	public static void main(String a[])
	{
		System.out.println("In Main method");
	}
}