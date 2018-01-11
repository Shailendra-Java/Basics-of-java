class This
{
	int id;
	String name;
	This(int id, String name)
	{
		this.name=name;
		this.id=id;
	}
	void display()
	{
		System.out.print(id+"\t "+name+"\t");
	}
	public static void main(String ar[])
	{
		This obj = new This(111,"NIIT"); 
		obj.display();
	}
}