class If
{
	public void ifElse(int x)
	{
		int n=x;
		if(n==1)
		System.out.print("Sunday");
		else if(n==2)
		System.out.print("Monday");
		else if(n==3)
		System.out.print("Tuesday");
		else if(n==4)
		System.out.print("Wednesday");
		else if(n==5)
		System.out.print("Thursday");
		else if(n==6)
		System.out.print("Friday");
		else if(n==7)
		System.out.print("Saturday");
		else
		System.out.print("Invalid no.");
	}
	public void switchCase(int y)
	{
		switch(y)
		{
			case 1:
				System.out.print("Sunday");
				break;
			case 2:
				System.out.print("Monday");
				break;
			case 3:
				System.out.print("Tuesday");
				break;
			case 4:
				System.out.print("Wednesday");
				break;
			case 5:
				System.out.print("Thursday");
				break;
			case 6:
				System.out.print("Friday");
				break;
			case 7:
				System.out.print("Saturday");
				break;
			default:
				System.out.print("Invalid choice");
				break;
		}
	}
	public static void main(String a[])
	{
	  int n=Integer.parseInt(a[0]);
	  If obj = new If();
	  obj.ifElse(n);
	  System.out.println("\nNow switch case is running");
	  obj.switchCase(n);
	  
	}
}