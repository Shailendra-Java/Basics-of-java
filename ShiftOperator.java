class ShiftOperator
{
	int a,b,x,y;
	public void rightShift()
	{
		a=25;
		b=40;
		a = a>>2;
		b = b>>3;
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}
	public void leftShift()
	{
		x = 10;
		y = 15;
		x = x<<2;
		y = y<<3;
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}
	public static void main(String a[])
	{
		ShiftOperator so = new ShiftOperator();
		System.out.println("Right Shift");
		so.rightShift();
		System.out.println("Left Shift");
		so.leftShift();
	}
}