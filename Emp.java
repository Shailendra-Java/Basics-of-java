public class Emp 
{					
   	 public int empId;
     public void setEmpId(int empId) 
	 {
        this.empId = empId;
     } 
	public int getEmpId() 
	{
        return empId;
    }
    public static void main(String a[])
	{
		Emp emp = new Emp();
		emp.setEmpId(201);
		System.out.println("Employee Id : "+emp.getEmpId());
	}
 }

