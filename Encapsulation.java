class EncapsulationEx
{
	private int id;
	private String name;
	private double salary;
	public void setDetails(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
}
class Encapsulation
{
	public static void main(String a[])
	{
		EncapsulationEx ex = new EncapsulationEx();
		ex.setDetails(101,"NIIT",5464.8667);
		System.out.println("Employee ID: "+ex.getId());
		System.out.println("Employee Name: "+ex.getName());
		System.out.println("Salary: "+ex.getSalary());
	}
}