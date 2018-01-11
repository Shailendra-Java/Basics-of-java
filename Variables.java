class Variables
{
	int x,y; // Instance variables
	static float a,b; //Class/Static Variables
	public void display()
	{
		char c; // Local variable
		c = 'A';
		System.out.println("Local Variables C = "+c);
	}
	public static void main(String ar[])
	{
		Variables var = new Variables();
		var.x = 10;
		var.y = 20;
		a = 11.3f;
		b = 2.5f;
		var.display();
		System.out.println("Instance variables Addition = "+(var.x+var.y));
		System.out.println("Static variables Addition = "+(a+b));
	}
}