class ReturnType
{
	public int function1(int x)
	{
		return x*x;
	}
	public float function2(float y)
	{
		return y;
	}
	public String function3(String s)
	{
		return s;
	}
	public static void main(String ar[])
	{
		int a;
		ReturnType rt = new ReturnType();
		a=rt.function1(200);
		System.out.println(a);
		System.out.println(rt.function1(100));
		System.out.println(rt.function2(11.5f));
		System.out.println(rt.function3("Welcome"));
	}
}