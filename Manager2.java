class Employee2 {
     private int empId;
     private String name;
     Employee2(int id, String name)
	 {
		 empId = id;
		 this.name = name;
	 }
     public String getDetails () {
         return "Employee id:  " + empId +
                " Employee name:" + name;    
     }
 }
public class Manager2 extends Employee2 {
  private String deptName;
  public Manager2(int id, String name, String dept)
  {
	  super(id,name);
	  deptName = dept;
  }
  public String getDetails () {
   return super.getDetails () + 
     " Department: " + deptName;
     }
	 public static void main(String... a)
	 {
		 Manager2 m = new Manager2(101,"John","IT");
		 System.out.println(m.getDetails());
	 }
 }
