final class Abc
{
	int x;
	public void fun1(int x)
	{
		this.x=x;
		System.out.println(x);
	}
}
public class FinalClass extends Abc // It will throw an error
{
	public static void main(String a[])
	{
		Abc f=new Abc();
		f.fun1(10);
	}
}