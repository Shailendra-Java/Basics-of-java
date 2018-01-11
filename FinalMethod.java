class FinalExample
{
	public final void display()
	{
		System.out.println("Final Method");
	}
}
class FinalMethod extends FinalExample 
{
	public void display()// It will throw an error
	{
		System.out.println("Method of child class");
	}
	public static void main(String a[])
	{
		FinalMethod f=new FinalMethod();
		f.display();
	}
}