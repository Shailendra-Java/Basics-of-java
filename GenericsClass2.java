public class GenericsClass2<T, T2>
{
	private T t;
	private T2 t2;
	public GenericsClass2(T t, T2 t2)
	{
		this.t = t;
		this.t2 = t2;
	}
	void showTypes()
	{
		System.out.println("Type of T is " +
		t.getClass().getName());
		System.out.println("Type of T2 is " +
		t2.getClass().getName());
	}
	T getT1()
	{
		return t;
	}
	T2 getT2()
	{
		return t2;
	}
	public static void main(String[] args)
	{
		GenericsClass2<Integer, String> integer =new GenericsClass2<Integer, String>(10,"Hello");
		integer.showTypes();
		System.out.println("Integer Value "+integer.getT1());
		System.out.println("String Value "+integer.getT2());
	}
}