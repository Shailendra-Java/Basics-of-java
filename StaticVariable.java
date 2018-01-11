class StaticVariable
{
	public static int count=0;
	int count2=0;
	StaticVariable()
	{
		count++;
		count2++;
		System.out.println("Count= "+count);
		System.out.println("Count2= "+count2);
	}
	static
	{
		System.out.println("Before main method");
	}
	
	public static void main(String a[])
	{
		StaticVariable sv=new StaticVariable();
		StaticVariable sv2=new StaticVariable();
		StaticVariable sv3=new StaticVariable();
				
	}
}