class ExceptionEx
{
	public static void main(String a[])
	{
		float x,y,z=0.0f;
		try
		{
			x=Float.parseFloat(a[0]);
			y=Float.parseFloat(a[1]);
			z=x/y;
			System.out.println("Result = "+z);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Can't divide by zero");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Provide an Integer value");
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("Enter 2 values");
		}
		
	}
}