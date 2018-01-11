interface Security
{
	
}
public class Interface implements Methods,Security
{
	public int x,y;
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public void div()
	{
		x=100;
		y=25;
		System.out.println(x/y);
	}
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public static void main(String a[])
	{
		Interface i = new Interface();
		if(i instanceof Security)
		{
			i.sum(100,200);
			i.div();
			i.sub(230,120);
		}
		else
			System.out.println("Not instance of Methods interface");
		
	}
}