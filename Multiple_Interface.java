interface Printable
{
	void print();
}
interface Showable extends Printable
{
	void show();
}
public class Multiple_Interface implements Showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome to NIIT");
	}
	public static void main(String a[])
	{
		Multiple_Interface mi = new Multiple_Interface();
		mi.print();
		mi.show();
	}
}