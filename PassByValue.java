class PassByValue
{
	public int sum(int x, int y)
	{
		return x+y;
	}
	public static void main(String a[])
	{
		int result;
		PassByValue psv=new PassByValue();
		result = psv.sum(11,22);
		System.out.print(result);
	}
}