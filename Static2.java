class Static
{
	public static int count=0;
	int count2=0;
	public void getValue()
	{
		count++;
		count2++;
		System.out.println("Count = "+count);
		System.out.println("Count2 = "+count2);
	}
	
}
class Static2
{
	public static void main(String a[])
	{
		System.out.println("Initial value of Count = "+Static.count);
		Static s=new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		s.getValue();
		s2.getValue();
		s3.getValue();
	}
}