class ThisExample
{
	int id;
	String name;
	ThisExample(int id, String name)
	{
		this.name=name;
		this.id=id;
	}
	void xyz()
	{
		System.out.print(id+"\t "+name);
	}
	public static void main(String ar[])
	{
		ThisExample obj = new ThisExample(111,"NIIT"); 
		obj.xyz();
	}
}