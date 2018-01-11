public class FirstExample
{
	int x;
	float f;
	char c;
	String s;
	public void print()
	{
		x = 10;
		f = 11.5f;
		c = 'A';
		s = "Welcome";
		System.out.println("X = "+x);
		System.out.println("F = "+f);
		System.out.println("C = "+c);
		System.out.println("S = "+s);
	}
	public static void main(String args[])
	{
		FirstExample fs = new FirstExample();
		fs.print();
	}
}