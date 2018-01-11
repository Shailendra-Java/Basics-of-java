class IfElse
{
	 int n1,n2,n3;
	 public void max()
	 {
		n1=160;
		n2=33;
		n3=141;
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.print("N1 is greater");
			}
		}
		else if(n2>n3)
		{
			if(n2>n1)
			{
				System.out.print("N2 is greater");
			}
		}
		else
		{
			System.out.print("N3 is greater");
		}
	 }
	public static void main(String s[])
	{
		IfElse ie=new IfElse();
		ie.max();
	}
}