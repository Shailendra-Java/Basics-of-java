package defaultConstructor;
class DefaultCons
{
	int x;
	char c;
	float f;
	String s;
	boolean b;
	public void display()
	{
		System.out.println("X = "+x);
		System.out.println("C = "+c);
		System.out.println("F = "+f);
		System.out.println("S = "+s);
		System.out.println("B = "+b);
	}
	public static void main(String a[])
	{
		DefaultCons obj = new DefaultCons();//Invoking Default Constructor
		obj.display();
	}
}