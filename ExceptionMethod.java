class ExceptionMethod
{
	public void display(int a, int b)
	{
		System.out.println("A+B = "+(a+b));
	}
	public static void main(String a[])
	{
		int x,y;
		ExceptionMethod em = new ExceptionMethod();
		try
		{
			x = Integer.parseInt(a[0]);
			y = Integer.parseInt(a[1]);
		
			em.display(x,y);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number must be Integer");
		}
		
	}
}