class EmployeeRecord
{
	public static void main(String s[])
	{
		Manager m = new Manager(101,"Abc",15000.0f,"SSN4676456","Marketing");
		Engineer e = new Engineer(102,"Xyz",20000.0f,"SSN8765346","Development"); 
		
		System.out.println("Record of Manager");
		System.out.println("\nID :\t"+m.getId());
		System.out.println("SSN :\t"+m.getSsn()+"\nName :\t"+m.getName());
		System.out.println("Salary :\t"+m.getSalary()+"\nDepartment :\t"+m.getDept());
		m.raiseSalary(5000.0f);
		System.out.println("Salary after update:\t"+m.getSalary());
		
		System.out.println("Record of Engineer");
		System.out.println("\nID :\t"+e.getId());
		System.out.println("SSN :\t"+e.getSsn()+"\nName :\t"+e.getName());
		System.out.println("Salary :\t"+e.getSalary()+"\nDepartment :\t"+e.getDept());
		
	}
}