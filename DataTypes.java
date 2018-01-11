class DataTypes
{
		boolean t;
		char c;
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		String str;
		public void display()
		{
			System.out.print(t+" "+c+" "+b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+str);
		}
	public static void main(String a[])
	{
		
		DataTypes dt=new DataTypes();
		dt.display();
		
	}
}