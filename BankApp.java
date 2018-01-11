
import java.io.*;
import java.util.Scanner;
class BankApp
{
	static Scanner s;
	static String[] account;
	static String[] password;
	static String[] name;
	static double[] amount;
	static boolean valid;
	public BankApp()
	{
		account = new String[]{"101","102","103","104","105","106","107"};
		password = new String[]{"@121","@122","@123","@124","@125","@126","@127"};
		name = new String[]{"Ankit","Suraj","Sanjay","Pravin","Konshal","Shailendra","Aman"};
		amount = new double[]{10000,15000,20000,25000,30000,35000,40000};
	
		s = new Scanner(System.in);
	}
	public static void mainPage()
	{
		System.out.println("\n\n\n\t====================================");
		System.out.println("\t\tCANARA BANK GWALIOR\n\t\t     M.P. INDIA");
		System.out.println("\t====================================\n\n");
		
	}
	public static boolean validation(String ac, String pass)
	{
		int passIndex = 0;
		for(int i = 0; i<7; i++)
		{
			if(ac.equals(account[i]))
			{
				passIndex = i;
				break;
			}
		}
		if(pass.equals(password[passIndex]))
			valid = true;
		else
			valid = false;
		return valid;
	}
	public static void clear()
	{
		for(int i=0; i<15; i++)
				System.out.println();
	}
	public static void withdraw(double money,String acc)
	{
		int index=0;
		double minus=0;
		for(int i=0; i<7; i++)
		{
			if(acc.equals(account[i]))
			{
				index = i;
				break;
			}
		}
		if(money>amount[index])
		{
			clear();
			System.out.println("You dont have enough balance");
			internalWorking(acc);
		}
		else
			minus = amount[index] - money;
		if(minus<500)
		{
			clear();
			System.out.println("Transaction not complete\nplease leave at least 500 rupees");
			internalWorking(acc);
		}
		else
		{
			clear();
			amount[index] = minus;
			System.out.println("\n\nTransaction successful\nof "+money);
			System.out.println("Mr. "+name[index]+"\nYour current balance is\n"+amount[index]);
		}
	}
	public static void deposit(double am,String acc)
	{
		
	}
	public static void miniStatement(String acc)
	{
		
	}
	public static void internalWorking(String acc)
	{
		int choice=0;
		String _continue;
		do
		{
			clear();
			System.out.println("\n\n=========================");
			System.out.println("\n1 => WITHDRAW\n2 => DEPOSIT\n3 => MINI STATEMENT");
			System.out.println("\n=========================");
			System.out.println("\nEnter your choice ");
			choice = s.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("\n\n\nEnter amount for withdraw");
					double amt = s.nextDouble();
					withdraw(amt,acc);
					break;
				case 2:
					System.out.println("\n\n\nEnter amount for deposit");
					double dep = s.nextDouble();
					deposit(dep,acc);
				case 3:
					miniStatement(acc);
					break;
				default:
					System.err.println("\n\nInvalid option try again");
					break;
			}
			System.out.println("\n\nDo you want to another transaction (y/n)?");
			_continue = s.next();
		}while(!_continue.equals("n"));
	}
	public static void main(String a[])
	{
		Console inp = System.console();
		BankApp ba = new BankApp();
		int n=0;
		String pass="",id="";
		mainPage();
		System.out.println("\n1 => Login");
		do
		{
			 n = s.nextInt();
			
			if(n==1)
			{
				if(inp!=null)
				{
					id = inp.readLine("%s", "Account No: ");
					pass = new String(inp.readPassword("%s", "Password: "));
					valid = validation(id,pass);
					if(valid)
					{
						internalWorking(id);
					}
					else
					{
						System.out.println("Invalid id OR password!!");
						System.out.println("\nSystem goes to shut down ");
						for(int i=15; i>=0; i--)
						{
							try
							{
								System.out.print("=");
								Thread.sleep(500);
								if(i==0)
									System.exit(0);
							}catch(InterruptedException ie)
							{
							
							}
						}
						
					}
				}
			}
			else
				System.out.println("Please provide 1 for Login");
		}while(n!=1);
	}
}
