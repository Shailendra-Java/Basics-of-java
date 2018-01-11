class Parent
{
	public Parent()
	{
		System.out.println("Constructor of parent class");
	}
}
class Child_Parent extends Parent
{
	public Child_Parent(String name)
	{
		super();
		System.out.println("Constructor of Child class "+name);
	} 
	public static void main(String a[])
	{
		Child_Parent cop = new Child_Parent ("Hello");
	}
}