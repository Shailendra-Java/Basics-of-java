class $StaticExample
{
	public static void display()
	{
		System.out.println("Static Method invoked");
	}
	public void display2()
	{
		System.out.println("Non-Static Method invoked");
	}
	public static void main(String[] a)
	{
		display(); //Calling static method without object
		$StaticExample se = new $StaticExample();
		se.display2(); // Calling non-static method with object
	}
}