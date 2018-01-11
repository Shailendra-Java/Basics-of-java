class Employee
{
	public Employee()
	{
		System.out.println("Employee ");
	}
}
class Manager extends Employee
{
	public Manager(int y)
	{
		System.out.println("Manager Y = "+y);
	}
}
class PManager extends Employee
{
	public PManager(int x)
	{
		System.out.println("Inside PManager x="+x);
	}
}
class Hetrogenious 
{
	public static void main(String a[])
	{
		Employee[] h = new Employee[1024];
		h[0] = new PManager(50);
		h[1] = new Manager(20);
	}
}