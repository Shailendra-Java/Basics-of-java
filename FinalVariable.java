class FinalVariable
{
	final int x=1;
	public FinalVariable(int x)
	{
		this.x=x;// it will throw an error
		System.out.println(x);
	}
	public static void main(String a[])
	{
		FinalVariable f=new FinalVariable(20);
	}
}