class MyDate
{
	private int day;
	private int month;
	private int year;
	public MyDate(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public boolean equals(Object o)
	{
		boolean result=false;
		if(o!=null && (o instanceof MyDate))
		{
			MyDate d= (MyDate)o;
			if(day==d.day && month==d.month && year==d.year)
			{
				result = true;
			}
		}
		return result;
	}
}
class Equals
{
	public static void main(String ap[])
	{
		MyDate d1=new MyDate(12, 4, 2015);
		MyDate d2=new MyDate(12, 3, 2015);
		
		if(d1.equals(d2))
		System.out.println("Dates are equal");
		else
		System.out.println("Dates are not equal");
	}
}