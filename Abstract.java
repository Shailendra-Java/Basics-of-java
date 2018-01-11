abstract class Demo
{
	abstract public void sum(int x, int y);
	abstract public void display();
}
class Abstract extends Demo
{
	int z;
	public void sum(int x, int y)
	{
		z = x+y;
	}
	public void display()
	{
		System.out.println("Sum = "+z);
	}
	public static void main(String ar[])
	{
		Abstract a = new Abstract();
		//Demo dm = new Demo();
		a.sum(10,20);
		a.display();
	}
}