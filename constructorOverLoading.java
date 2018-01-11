class ConstructorOverLoading
{	static int x,y;
	public ConstructorOverLoading()
	{
		System.out.println("Constructor1 ");
	}
	public ConstructorOverLoading(int x, int y)
	{
		this();
		System.out.println("X = "+x+" Y = "+y);
	}
	public ConstructorOverLoading(float a, float b)
	{
		
		System.out.println("A = "+a+" B = "+b);
	}
	public static void main(String a[])
	{
		
		ConstructorOverLoading col = new ConstructorOverLoading();
		ConstructorOverLoading col3 = new ConstructorOverLoading(100,200);
		ConstructorOverLoading col2 = new ConstructorOverLoading(10.5f, 11.3f);
		
	}
}