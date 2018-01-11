class ConstOverloading
{
	public ConstOverloading()
	{
		System.out.println("First Constructor");
	}
	public ConstOverloading(int x, String s)
	{
		System.out.println("Second Constructor X = "+x+" S = "+s);
	}
	public ConstOverloading(float x)
	{
		this(10,"Niit");
		System.out.println("Third Constructor Float = "+x);
	}
	public static void main(String a[])
	{
		ConstOverloading co = new ConstOverloading();
		ConstOverloading co2 = new ConstOverloading(11.5f);
		ConstOverloading co3 = new ConstOverloading(22,"Welcome");
	}
}