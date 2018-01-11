class StaticClassExample
{
	public void display()
	{
		System.out.println("Method of Non-Static class");
	}
	static class InnerClass
	{
		public void print_()
		{
			System.out.println("Nested Class Method");
		}
	}
	public static void main(String...a)
	{
		StaticClassExample sce = new StaticClassExample();
		sce.display();
		InnerClass ic = new InnerClass();
		ic.print_();
		
	}
}