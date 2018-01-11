class Super
{
	protected int x,y;
	public Super()
	{
		System.out.println("Constructor of Super Class");
	}
	public void sum()
	{
		x = 10;
		y = 20;
		System.out.println("Addition = "+(x+y));
	}
}
class SingleInheritance extends Super
{
	public SingleInheritance()
	{
		System.out.println("Constructor of Sub-Class");
	}
	public static void main(String ar[])
	{
		SingleInheritance s = new SingleInheritance();
		s.sum();
	}
}