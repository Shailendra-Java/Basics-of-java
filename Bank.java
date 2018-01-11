public class Bank
{
	public static void main(String a[])
	{
		CheckingAmount ca = new CheckingAmount(101);
		System.out.println("Depositing $500");
		ca.deposit(500.00);
		try
		{
			System.out.println("Withdrawing $100");
			ca.withdraw(100.00);
			System.out.println("Withdrawing $500");
			ca.withdraw(500
			.00);
		}catch(InsufficientFundsException ife)
		{
			System.out.println("Sorry, but you are short $" + ife.getAmount()); 
			ife.printStackTrace();
		}
	}
}