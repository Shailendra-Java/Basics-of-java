interface Security
{
}
class Demo implements Security
{
	public void show()
	{
		System.out.println("Hello");
	}
}
public class MarkerInterface
{
	public static void main(String a[])
	{
		Demo obj = new Demo();
		if(obj instanceof Security)
		{
			obj.show();
		}
		else
		{
			System.out.println("You don't have permission");
		}
	}
}