import java.util.Scanner;
class Area
{
	static int a,b,area;
	public void setVariable()
	{
		area = a*b;
		System.out.println("Area = "+area);
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Area ar = new Area();
		System.out.println("Enter two values...");
		a = s.nextInt();
		b = s.nextInt();
		
		ar.setVariable();
	}
}