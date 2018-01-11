class ExceptionMath
{
	public void divide(int num1, int num2)
	{
		int result=0;
		try
		{
			result = num1 / num2;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero exception");
		}
		finally
		{
			System.out.println("Always execute");
		}
		
	}
	public void show()
	{
		System.out.println("Normal flow of program");
	}
	public static void main(String a[])
	{
		ExceptionMath em = new ExceptionMath();
		em.divide(10,0);
		em.show();
	}
}