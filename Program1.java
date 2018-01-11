public class Program1
{
	public static void main(String a[])
	{
		for(int i=0; i<20; i++)
		{
			int y = (i%2==0)?i:0;
			System.out.print("\t"+y);
		}
	}
}