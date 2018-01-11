package tostring.program;
class ToStringExample
{
	int age;
	String name;
	public ToStringExample(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	/*public String toString()
	{
		return "Employee Name: "+name+"\nEmployee Age: "+age;
	}*/
	
	public static void main(String a[])
	{
		ToStringExample ts = new ToStringExample("NIIT",25);
		ToStringExample ts2 = new ToStringExample("JAVA",55);
		System.out.println("User Details\n"+ts2.toString());
	}
}