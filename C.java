class A
{
	public void display()
	{
		System.out.println("Welcome");
	}
}
class B
{
	public void print()
	{
		System.out.println("to NIIT");	
	}
}
class C
{
	public static void main(String s[])
	{
		A obj = new A();
		obj.display();
		B obj2 = new B();
		obj2.print();
	}
}