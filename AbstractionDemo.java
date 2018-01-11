abstract class Example
{
	int x,y;
	public Example(int a, int b)
	{
		x=a;
		y=b;
		System.out.println("inside abstract class constructor :"+x);
		System.out.println("inside abstract class constructor :"+y);
	}
	abstract void sum(int a, int b);
	abstract void display();
}
class Child extends Example
{
	public Child(int a, int b)
	{
		super(a,b);
		System.out.println("inside constructor :"+x);
		System.out.println("inside constructor :"+y);
	}
	public void sum(int a, int b)
	{
		System.out.println(a+b);
		
	}
	public void display()
	{
		System.out.println("Abstraction Demo");
	}
}
class AbstractionDemo
{
	public static void main(String a[])
	{
		Child e = new Child(20,30);
		//Example e1 = new Example(100,200); // we can't create object of abstract class
		e.sum(20,30);
		e.display();
	}
}