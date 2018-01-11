public class GenericsMethod
{
	public <E>void swap(E x, E y)
	{
		System.out.println("Before Swapping: ");
		System.out.println(" X = "+x+" Y = "+y);
		E temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping: ");
		System.out.println(" X = "+x+" Y = "+y);
	}
	public static void main(String a[])
	{
		GenericsMethod gm = new GenericsMethod();
		gm.swap(100,200);
		gm.swap(10.5f,20.5f);
		gm.swap('A','B');
		gm.swap("Hello","NIIT");
	}
}