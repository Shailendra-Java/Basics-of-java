public class SingeltonExample
{
	public static void main(String a[])
	{
		SingletonClass sc = SingletonClass.getInstance();
		sc.display();
		//SingletonClass sc2 = new SingletonClass(); //throws error can't create
		// new object
	}
}