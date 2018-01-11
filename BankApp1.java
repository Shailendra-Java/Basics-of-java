class CheckingAccount 
{
     private int custID;
     private String name;
     private double amount;		
     public CheckingAccount(int id, String n) 
	 {
		custID = id;
		name = n;
     }
     private void setAmount (double amount) 
	 {
         this.amount = amount;
     }
	public double getAmount () 
	{
         return amount;
    }
  
 }
public class BankApp1
 {
	public static void main(String a[])
	{
		CheckingAccount ca = new CheckingAccount(121,"John");
		ca.setAmount(20000); // It wiil throw compile time error
	}
 }
