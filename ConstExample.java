class ConstExample
{
	int x;
	float f;
	char c;
	String s;
	public ConstExample()
	{
		System.out.println("Constructor 1");
	}
	public ConstExample(int x)
	{
		System.out.println("Constructor 2 and X = "+x);
	}
	public ConstExample(int x, int y)
	{
		System.out.println("Constructor 3 and X = "+x+" Y = "+y);
	}
	public void show(int a,float f, char c, String  s)
	{
		System.out.println("Values = "+a+" "+f+" "+c+" "+s);
	}
	public static void main(String a[])
	{
		ConstExample ch=new ConstExample();
		ConstExample ch2=new ConstExample(10);
		ConstExample ch3=new ConstExample(25,35);
		ch.show(20,11.3f,'A',"Hello");
	}
}