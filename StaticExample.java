class StaticExample
{
	static String name;
	static int age,id;
	public String getName()
	{
		return name;
	}
	public static void getDetails()
	{
		System.out.println("User Details");
		System.out.println("User Name: "+getName());
		System.out.println("ID: "+id+"\nAge: "+age);
	}
	public static void main(String a[])
	{
		name="NIIT";
		id=102;
		age=25;
		getDetails();
	}
}
