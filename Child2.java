class Base
{
	private void display()
	{
		System.out.println("Method of Base Class");
	}
}
class Child2 extends Base
{
	
	public void display()
	{
		super.display();
		System.out.println("Method of Child Class");
	}
	public static void main(String a[])
	{
		Child2 ch=new Child2();
		ch.display();
	}
}