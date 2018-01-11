class Parent
{
	Parent(String name)
	{
		System.out.println("Name = "+name);
	}
	Parent(int x, float f)
	{
		System.out.println("X= "+x+" F = "+f);
	}
}
class SuperKeyword extends Parent
{
	SuperKeyword()
	{
		super("NIIT");
		System.out.println("Constructor of Child Class");
	}
	SuperKeyword(String name)
	{
		super(10,12.5f);
		System.out.println("Name = "+name);
	}
	public static void main(String a[])
	{
		SuperKeyword sk = new SuperKeyword("Welcome");
		SuperKeyword sk2 = new SuperKeyword();
	}
}