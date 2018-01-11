class MyDate
{
	int day,month,year;
	public MyDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void print()
	{
		System.out.println("Date = "+day+"/"+month+"/"+year);
	}
	public void add(int x, int y)
	{
		int r = x+y;
		System.out.println(" "+r);
	}
}
class ClassTypes
{
	public static void main(String a[])
	{
		MyDate date = new MyDate(19,8,2015);
		date.print();
		date.add(19,8);
	}
}