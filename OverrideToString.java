public class OverrideToString
{
	private String fName;
	private double salary;
	private int id;
	
	public OverrideToString(int id, String fName, double salary)
	{
		this.fName = fName;
		this.salary = salary;
		this.id = id;
	}
	public String toString()
	{
		return "ID:\t"+id+"\nName:\t"+fName+"\nSalary:\t"+salary;
	}
	public static void main(String ar[])
	{
		OverrideToString ots = new OverrideToString(111,"NIIT",134000);
		System.out.println("Object Data: "+ots.toString());
	}
}