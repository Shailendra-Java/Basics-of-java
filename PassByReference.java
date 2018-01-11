class PassByReference
{
	public PassByReference sum(PassByReference p)
	{
		return p;
	}
	public static void main(String a[])
	{
		PassByReference psv=new PassByReference();
		psv = psv.sum(psv);
		System.out.print(psv);
	}
}