class Parent
{
	public Parent()
	{
		System.out.println("Constructor of parent class");
	}
}
class ChildOfParent extends Parent
{
	public ChildOfParent(String name)
	{
		super();
		System.out.println("Constructor of Child class "+name);
	} 
	public static void main(String a[])
	{
		ChildOfParent cop = new ChildOfParent ("Hello");
	}
}