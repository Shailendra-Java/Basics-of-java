class StaticExample
{
	static String name;
	static int age,id;
	public static String getName()
	{
		return name;
	}
	public static void getDetails()
	{
		System.out.println("User Details");
		System.out.println("User Name: "+getName());
		System.out.println("ID: "+id+"\nAge: "+age);
	}
}
class StaticExample2
{
	public static void main(String a[])
	{
		StaticExample.name="NIIT";
		StaticExample.id=102;
		StaticExample.age=25;
		StaticExample.getDetails();
	}
}