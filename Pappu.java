public class Pappu
{
	private int x=10;
	char c='A';
	float f=10.12f;
	String s="JAVA";
	boolean b;
	public void display()
	{
		System.out.println("X = "+x);
		System.out.println("C = "+c);
		System.out.println("F = "+f);
		System.out.println("S = "+s);
		System.out.println("B = "+b);
	}
	public int sum(int z)
	{
		return z;
	}
	public static void main(String a[])
	{
		Pappu p = new Pappu();
		p.display();
		System.out.println("Sum = "+p.sum(50));
	}
}