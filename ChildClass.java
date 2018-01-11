class BaseClass
{
	public BaseClass()
	{
		System.out.println("Base Class Method");
	}
}
class ChildClass extends BaseClass
{
	public static void main(String a[])
	{
		ChildClass c = new ChildClass();
	}
}