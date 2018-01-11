class CharArray
{
	public static void main(String a[])
	{
		char[] ch ;
		ch= new char[26];
		int i;
		for(i=0; i<26; i++)
		{
			ch[i] = (char) ('a'+i);
		}
		for(i=0; i<26; i++)
		{
			System.out.print("  "+ch[i]);
		}
	}
}