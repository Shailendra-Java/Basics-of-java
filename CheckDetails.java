class CheckDetails
{
	public static void main(String ar[])
	{
		Employee emp = new Employee(123,"John",20000,"S345453453");
		System.out.println("Employee Details");
		System.out.println(emp.getDetails());
		
		//Updating Employee class
		emp.setName("John Kerry");
		emp.raiseSalary(4500);
		System.out.println("\nAfter updating record");
		System.out.println(emp.getDetails());
		
		// Creating Manager class Object
		Manager mgr = new Manager(456,"Peter",15500,"S77767597","Marketing");
		System.out.println("\nManager Details");
		System.out.println(mgr.getDetails());
		System.out.println(mgr.getDept());
		//Updating Manager Salary
		mgr.raiseSalary(12000);
		System.out.println("\nNow record of Manager");
		System.out.println(mgr.getDetails());
	}
}