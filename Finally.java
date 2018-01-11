class Finally
{
	public void Number(int a, int b)
	{
		System.out.println("Division = "+(a/b));
	}
	public static void main(String a[])
	{
		Finally f = new Finally();
		int x,y;
		try
		{
			x = Integer.parseInt(a[0]);
			y = Integer.parseInt(a[1]);
			f.Number(x,y);
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Exception occur:- "+ne);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception occur:- "+ae);
		}
		finally
		{
			System.out.println("******** ALWAYS EXECUTE ************");
		}
	}
}