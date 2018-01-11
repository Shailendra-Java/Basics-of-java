package enumeration.example;
public enum teamList{
	Sehwag("Opener","1"),
	Sachin("Opener","2"),
	Dravid("One Down","3"),
	Yuvraj("Two Down","4"),
	Dhoni("Three Down","5"),
	Kohli("Four Down","6"),
	Aswin("Five Down","7"),
	Jadeja("Six Down","8"),
	Pravin("Seven Down","9"),
	Zahir("Eight Down","10"),
	Nehra("Nine Down","11");

	public String desc;
	public String orderNo;
	
	teamList(String description, String bettingOrder)
	{
		desc=description;
		orderNo=bettingOrder;
	}
	
	public String getDesc()
	{
		return desc;
	}
	public String getOrder()
	{
		return orderNo;
		
	}

}