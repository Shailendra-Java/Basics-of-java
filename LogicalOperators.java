class LogicalOperators
{
	int x,y;
	boolean t;
	LogicalOperators()
	{
		t = true;
		x = 10;
		y = 15;
	}
	public void evaluate()
	{
		if(x>5 && x==15)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(!t)
		{
			System.out.println("The value of T is "+t);
		}
	}
	public static void main(String a[])
	{
		LogicalOperators lo = new LogicalOperators();
		lo.evaluate();
	}
}