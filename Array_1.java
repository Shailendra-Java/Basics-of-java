class Array_1
{
	public char[] createArray()
	{
		char[] s;
		s=new char[10];
		for(int i=0; i<10; i++)
		{
			s[i]=(char)('A'+i);
		}
		for(char j: s)
		{
			System.out.println(j);
		}
		return s;
	}
	
	public static void main(String a[])
	{
		Array_1 a1 = new Array_1();
		a1.createArray();
	}
}