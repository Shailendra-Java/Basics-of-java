class Emp 
{		
	//Declaring variables
   	 int empId;
	 String name;
	 // Create a constructor to initilize variables
     public Emp(int id, String nam)
	 {
		empId = id;
		name = nam;
	 }
	 // Method to return variables data
	 public String getDetails()
	 {
		 return "Employee ID : "+empId+"\nEmployee Name : "+name;
	 }
 }
 // Child class to add additional info
 public class Mgr extends Emp
 {
	 String deptName;
	 //Constructor to initilize variables
	 public Mgr(int id, String nam, String dept)
	 {
		 // Invoking parent class constructor to initilize their values
		 super(id,nam);
		 deptName = dept;
	 }
	 // Child class Overriden method to return additional info
	 public String getDetails()
	 {
		 return super.getDetails()+"\nDepartment Name : "+deptName;
	 }
	 public static void main(String a[])
	{
		// Object of child class to set values of data
		Mgr m = new Mgr(101,"John","Information Technology");
		// Printing info about manager 
		System.out.println("Employee Details \n"+m.getDetails());
	}
 }

