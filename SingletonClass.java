public class SingletonClass 
{
	private static final SingletonClass instance = new SingletonClass();
	private SingletonClass()
	{}
	public static SingletonClass getInstance()
	{
		return instance;
	}
	public void display()
	{
		System.out.println("Only one object can be created");
	}
}
