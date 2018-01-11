import enumeration.example.teamList;
class EnumExample{
	public static void main(String args[])
	{
		for(teamList player:teamList.values())
		{
		System.out.println("\t"+player+"\t"+player.getDesc()+"\t"+player.getOrder());
		}
	}
}