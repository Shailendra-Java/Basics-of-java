public class EnumDemo
{
	public static void main(String []args)
	{
		System.out.println("List of Months");
		System.out.println("---------------------------");
		for(Months mth:Months.values())
		{
			System.out.println(mth);
		}		
	}
}