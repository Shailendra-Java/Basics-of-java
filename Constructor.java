class Constructor
{
	int x;
	float y;
	public Constructor()
	{
		System.out.println("Constructor 1");
		System.out.println("X = "+x+" Y = "+y);
	}
	public Constructor(String str)
	{
		System.out.println("Str = "+str);
	}
	public static void main(String a[])
	{
		Constructor ch=new Constructor();
		Constructor ch2 = new Constructor("Constructor 2");
	}
}