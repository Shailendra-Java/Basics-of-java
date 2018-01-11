class Employee
{
	private int id;
	private String name;
	private float salary;
	private String ssn;
	public Employee(int id, String name, float salary, String ssn)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.ssn=ssn;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public float getSalary()
	{
		return salary;
	}
	public void raiseSalary(float amount)
	{
		salary += amount;
	}
	public String getSsn()
	{
		return ssn;
	}
	
}
public class Employee2
{
	public static void main(String a[])
	{
		Employee shyam = new Employee(101,"Shyam",12500.500f,"56545646343");
		System.out.println("Employee ID:\t\t"+shyam.getId());
		System.out.println("Employee Name:\t\t"+shyam.getName());
		System.out.println("Employee Salary:\t"+shyam.getSalary());
		System.out.println("Employee SSN:\t"+shyam.getSsn());
		
		//Now updating salary of employee shyam
		shyam.raiseSalary(15000.00f);
		System.out.println("After updatation....");
		System.out.println("Salary = "+shyam.getSalary());
	}
}
