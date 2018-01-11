class Parent
{
	public Parent()
	{
		System.out.println("Constructoe of Parent Class");
	}
	class SubClass
	{
		public SubClass()
		{
			System.out.println("Constructoe of SubClass Class");
		}
	}
	public static void main(String a[])
	{
		//SubClass ac= new SubClass();
		SubClass p=new Parent();
	}
}