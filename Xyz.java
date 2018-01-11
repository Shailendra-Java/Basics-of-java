class Abc
{
	public void display()
	{
		System.out.println("Inside class Abc");
	}
}
public class Xyz
{
	public static void main(String a[])
	{
		System.out.println("Inside main method");
		Abc obj = new Abc();
		obj.display();
	}	
}