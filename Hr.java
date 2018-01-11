class Admin
{
	public void getDetails()
	{
		System.out.println("Employee Details");
		System.out.println("=====================");
		System.out.println("\nEmployee ID: 101");
		System.out.println("Employee Name: Ram\nJob ID : HR");
	}
}
public class Hr extends Admin
{
	public static void main(String a[])
	{
		Admin ad = new Hr();
		ad.getDetails();
		if(ad instanceof Hr)
		{
			System.out.println("Ad holds reference of Hr class");
		}
		else
		{
			System.out.println("Ad holds reference of Admin class");
		}
	}
}