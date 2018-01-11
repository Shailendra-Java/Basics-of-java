package CoreJava.Sub;
public class CoreJava
{
	int a;
	float f;
	char c;
	String s1;
    public void display()
	{
		System.out.println("A= "+a+" F= "+f+" C= "+c+" S1= "+s1);
	}
	public static void main(String a[])
	{
		CoreJava obj2 = new CoreJava();
		obj2.display();
	}
}