class Virtual
{
	public int id;
	public String name;
	
	public void show(int id, String name)
	{
		this.id = id;
		this.name = name;
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
	}
}
public class Virtual_Method extends Virtual
{
	public void show(int id, String name)
	{
		System.out.println("Details of Super class");
		super.show(id,name);
	}
	public static void main(String a[])
	{
		Virtual obj = new Virtual_Method();
		obj.show(123,"NIIT");
	}
}