class Abc
{
	public Abc(String a)
	{
		System.out.println("Welcome "+a);
	}
}
class ConstSuper extends Abc
{
	public ConstSuper()
	{
		super("NIIT");
		System.out.println("Constructor of child class");
	}
	public void display(int x)
	{
		x=200;
		System.out.println("Method of Child class x = "+x);
	}
	public static void main(String a[])
	{
		ConstSuper cs = new ConstSuper();
		cs.display(100);
	}
}