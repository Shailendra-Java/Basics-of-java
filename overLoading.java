import java.util.Scanner;
class overLoading
{	
	public void swap(int x, int y)
	{
		int temp = x;
		x = y;
		y = temp;
		System.out.println("X = "+x+", Y = "+y);
	}
	public void swap(float x, float y)
	{
		float temp = x;
		x = y;
		y = temp;
		System.out.println("X = "+x+", Y = "+y);
	}
	public void swap(char x, char y)
	{
		char temp = x;
		x = y;
		y = temp;
		System.out.println("X = "+x+", Y = "+y);
	}
	public static void main(String... args)
	{
		int x,y;
		float a,b;
		char c,d;
		Scanner sc = new Scanner(System.in);
		overLoading ol = new overLoading();
		System.out.println("Enter two integer value");
		x = sc.nextInt();
		y = sc.nextInt();
		ol.swap(x,y);
		System.out.println("Enter two character value");
		c = sc.next().charAt(0);
		d = sc.next().charAt(0);
		ol.swap(c,d);
		System.out.println("Enter two float value");
		a = sc.nextFloat();
		b = sc.nextFloat();
		ol.swap(a,b);
	}
}