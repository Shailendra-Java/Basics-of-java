class Example
{
	private int num;
	public int display(int x)
	{
		num = x;
		return num;
	}
}
public class Java
{
	public static void main(String a[])
	{
		int value;
		Example ex = new Example();
		value = ex.display(20);
		// ex.num = 30; it will throw an error because it has private access
		System.out.println("Hello NIIT");
		System.out.println("Value = "+value);
	}
} 