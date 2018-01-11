public class GenericsClass<T>
{
	private T t;
	public void add(T t)
	{
		this.t = t; 
	} public T get()
	{
		return t; 
	}
	public static void main(String[] args)
	{
		GenericsClass<Integer> integer =new GenericsClass<>();
		GenericsClass<String> string =new GenericsClass<>();
		integer.add(new Integer(10));
		string.add(new String("Hello World"));
		System.out.println("Integer Value :\n\n"+ integer.get());
		System.out.println("String Value :\n"+ string.get());
	}
}