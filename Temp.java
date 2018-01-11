class Temp
{
	public static void main(String a[])
	{
		Manager mgr = new Manager(101,"ABC",15000.500f,"S8767565","Marketing");
		System.out.println("Manager Details");
		System.out.println("Emp ID :\t"+mgr.getId());
		System.out.println("Emp Name :\t"+mgr.getName());
		System.out.println("Emp Sal :\t"+mgr.getSalary());
		System.out.println("Emp SSN :\t"+mgr.getSsn());
		System.out.println("Emp Dept :\t"+mgr.getDept());
		mgr.raiseSalary(1000);
		System.out.println("Salary After update");
		System.out.println("Emp ID :\t"+mgr.getSalary());
	}
}