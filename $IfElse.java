class $IfElse
{
	void ifelse()
	{
		int x = 15;
		if(x>10)
		{
			System.out.println("The x is greater than 10");
		}
		else
		{
			System.out.println("The x is not greater than 10");
		}
	}
	public static void main(String s[])
	{
		$IfElse obj = new $IfElse();
		obj.ifelse();
	}
}