enum TeamList{
	ROHIT("Opener","1"),
	DHAWAN("Opener","2"),
	KOHLI("One Down","3"),
	RAINA("Two Down","4"),
	PANDYA("Three Down","5"),
	DHONI("Four Down","6"),
	JADEJA("Five Down","7"),
	ASWIN("Six Down","8"),
	BUMRAH("Seven Down","9"),
	BHUWENSWAR("Eight Down","10"),
	NEHRA("Nine Down","11");

	public String desc;
	public String orderNo;
	
	TeamList(String description, String bettingOrder)
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
public class EnumTeamListDemo
{
	public static void main(String args[])
	{
		for(TeamList player:TeamList.values())
		{
		System.out.println(player+"\t\t"+player.getDesc()+"\t\t"+player.getOrder());
		}
	}
}