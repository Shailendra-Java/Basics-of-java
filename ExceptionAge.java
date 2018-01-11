class AgeException extends Exception
{
	AgeException(String s)
	{
		super(s);
	}
}
class ExceptionAge
{
	public static void main(String a[])
	{
		int age = Integer.parseInt(a[0]);
		try
		{
			if(age<18)
			{
				throw new AgeException("You are not eligible for vote");
			}
			else
			{
				System.out.println("Welcome to India Election Commision");
			}
		}catch(AgeException ae)
		{
			System.out.println("Exception Caught: "+ae.getMessage());
		}
	}
}