class Homogenious
{
	public Homogenious(int x, int y, int z)
	{
		System.out.println(""+x+"\n"+y+"\n"+z);
	}
	public static void main(String a[])
	{
		Homogenious[] h = new Homogenious[2];
		h[0] = new Homogenious(10,20,30);
		h[1]= new Homogenious(40,50,60);
	}
}
