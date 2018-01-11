package session7.activity;
public class Session7Activity 
{
	int rollNo;
	String name;
	
	public Session7Activity()
	{
		rollNo = 101;
		name = "John";
	}
	public void updateName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public static void main(String[] args)
	{
		Session7Activity s7a = new Session7Activity();
		System.out.println("Student Details");
		System.out.println("Roll No: "+s7a.getRollNo());
		System.out.println("Name : "+s7a.getName());
		s7a.updateName("John Peter");
		System.out.println("After Name Update");
		System.out.println("Name : "+s7a.getName());
	}
}