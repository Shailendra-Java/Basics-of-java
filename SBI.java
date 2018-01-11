import java.util.Scanner;
import java.io.*;

public class SBI {
	
	public static String[] AcctNo = new String[10];
	public static String[] pwd = new String[10];
	public static String[] names = new String[10];
	public static double[] bal = new double[10];
	
	public static void details()
	{   AcctNo[0]= "00001"; AcctNo[1]= "00002"; AcctNo[2]= "00003"; AcctNo[3]= "00004";
	    AcctNo[4]= "00005"; AcctNo[5]= "00006"; AcctNo[6]= "00007"; AcctNo[7]= "00008";
	    AcctNo[8]= "00009"; AcctNo[9]= "00010";
	    
	    pwd[0]="12340"; pwd[1]="12341"; pwd[2]="12342"; pwd[3]="12343";
	    pwd[4]="12344"; pwd[5]="12345"; pwd[6]="12346"; pwd[7]="12347"; 
	    pwd[8]="12348"; pwd[9]="12349"; 
	    
	    names[0]="Mr.Shivam Kumar";
	    names[1]="Mr.Anik Aggarwal";
	    names[2]="Mr.Rohan Roy";
	    names[3]="Mr.Souvik Gomes";
	    names[4]="Mr.MaddySudhan";
	    names[5]="Mrs.Nidhi Kanta";
	    names[6]="Mrs.Diksha Devi";
	    names[7]="Mrs.Akshaya Ghosh";
	    names[8]="Mrs.Esha Bhadauria";
	    names[9]="Mrs.Charu Nair";
	    
	    bal[0]= 5000000; bal[1]= 5000000;
	    bal[2]= 5000000; bal[3]= 5000000;
	    bal[4]= 5000000; bal[5]= 5000000;
	    bal[6]= 5000000; bal[7]= 5000000;
	    bal[8]= 5000000; bal[9]= 5000000;
	}
	
	public void login()
	{   Scanner s= new Scanner(System.in);
	     int i,choice,w;
	     String AcctNoEntered;
	     String pwdEntered;
	     System.out.println("Account No.= ");
	     AcctNoEntered=s.next();
	     System.out.println("Password= ");
	     pwdEntered=s.next();
	     for(i=0;i<10;i++)
	     {
	    	 if(AcctNoEntered.equals(AcctNo[i]))
	    	 { 
	    		 if(pwdEntered.equals(pwd[i]))
	    		 { System.out.println("       Welcome "+names[i]);
	    		   System.out.println("1=Withdrawal\n2=Deposit\n3=Mini Statement");
	    		   System.out.println("Enter your choice");
	    		   choice=s.nextInt();
	    		   switch(choice)
	    		   { case 1: System.out.println("Enter the amount to be withdrawn:");
	    		             w=s.nextInt();
	    		             bal[i]=bal[i]-w;
	    		             System.out.println("Withdrawal successful ");
	    		             break;
	    		     case 2: System.out.println("Enter the amount to be Deposited:");
		                     w=s.nextInt();
		                     bal[i]=bal[i]+w;
		                     System.out.println("Amount Deposited");
		                     break;
	    		     case 3: System.out.println("Account No= "+AcctNo[i]);
	    		             System.out.println("Current Balance: "+bal[i]);
	    		             break;
	    		  }
	    			 
	    		 }
	    		 }
	    	 break;
	    	}
	     System.out.println("Account No. and Password mismatch");
	     
	}
	public void about()
	{
		System.out.println("********STATE BANK OF INDIA********");
		System.out.println("State Bank Of India is a private company owned\nby its Founder Mr.Shivam kumar.\nThe visionary founder of this company\nstarted off by lending money to his close friends and relatives\nin the year 1995 and slowly expanded\nto a chain of banks spread across\n108 countries with a remarkable presence\nin the South-East Asia.\nCurrently the State Bank Of India\nhas an annual turnover of\n$98.8 Billion USD \nand adds a new customer to its family every second."); 
	}
	
	public static void main(String arg[])
	{    int choice;
	     char c='y';
		Scanner s= new Scanner(System.in);
		SBI d= new SBI();
		details();
		do{
		System.out.println("       Welcome To State Bank Of India   ");
		System.out.println("1=Login\n2=About Us\n3=Exit ");
		System.out.println("Choose your option");
		choice = s.nextInt();
		switch(choice)
		{ case 1: d.login(); break;
		  case 2: d.about(); break;
		  case 3: break;
		
		}
		System.out.println("Do you wish to continue?(y/n)");
		c= s.next().charAt(0);
		}while(c!='n');
	}

}
