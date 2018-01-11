public class Employee
{
	private int empid;
	private String name;
	private double salary;
	private String ssn;
	public Employee(int id,String name,double salary,String ssn)
	{
		this.empid = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}	
	
	public void setName(String name)
	{
		if(name != null)
		{
			this.name = name;
		}
	}
	public void raiseSalary(double increase)
	{
		this.salary += increase;
	}
	public String getDetails()
	{
		return "ID: "+empid+"\nName: "+name+"\nSalary: "+salary+"\nSSN: "+ssn;
	}
}
