public class TeamIndia{
	public static void main(String arsgs[]){
		
		System.out.println("Team India player and there description");
		for(Cricketer cric: Cricketer.values()){
			
			System.out.println(cric+"\t"+cric.getOrder()+"\t"+cric.getDesc());
		}
	}
}