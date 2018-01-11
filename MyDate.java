class MyDate
{
	int day,month,year;
	public MyDate(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
	public void display()
	{
		System.out.println("Date = "+day+"/"+month+"/"+year);
		
	}
	
	public static void main(String a[])
	{
		MyDate date = new MyDate(21,8,2015);
		date.display();
	}
}