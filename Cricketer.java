enum Cricketer{
	Rohit_Sharma(1,"Opener"),
	Sikhar_Dhavan(2,"Opener"),
	Virat_Kohli(3,"One Down"),
	Lokesh_Rahul(4,"Two Down"),
	MS_Dhoni(5,"Five Down"),
	Hardik_Pandya(6,"Six Down"),
	Ravindra_Jadeja(7,"Seven Down"),
	Kuldip_Yadav(8,"Eight Down"),
	Bhuvneshwar(9,"Ninth Down"),
	Jasprit_Bumrah(10,"Tenth Down"),
	Ashish_Nehra(11,"Eleventh Down");
	
	int order;
	String desc;
	
	Cricketer(int o, String d){
		order = o;
		desc = d;
	}
	public int getOrder(){
	
		return order;
	}
	
	public String getDesc(){
	
		return desc;
	}
}