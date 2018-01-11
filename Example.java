public class Example
{
	private int age; // variable
	public void setAge(int value) // Method
	{
		age=value;
		System.out.println("Age = "+age);
		System.out.println("Value = "+value);
	}
	public int getAge()
	{
		return age;
	}
	public static void main(String a[])
	{
		int a;
		Example ex = new Example(); // creating object
		ex.setAge(10);
		System.out.println("Main method");
		a = ex.getAge();
		System.out.println(a);
	}
}