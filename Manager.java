public class Manager extends Employee
{
	private String deptName;
	public Manager(int id,String name,double salary,String ssn,String dept)
	{
		super(id,name,salary,ssn);
		this.deptName = dept;
	}
	public String getDept()
	{
		return "Department: "+deptName;
	}
}
