class Parent
{
	public void display()
	{
		System.out.println("Method of Parent class");
	}
}
public class Child extends Parent
{
	public void display()
	{
		super.display();
		System.out.println("Method of Child class");
	}
	public static void main(String s[])
	{
		Child obj = new Child();
		obj.display();
	}
}