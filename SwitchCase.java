public class SwitchCase
{
    public static void main(String[] args) 
    {  
		int x=10, y=20;
		String add ="TIMES";
		switch(add) 
		{
			case "PLUS": 
				System.out.println(x + y); 
				break;
			case "MINUS": 
				System.out.println(x - y); 
				break;
			case "TIMES": 
				System.out.println(x * y);
				break;
			case "DIVIDE": 
				System.out.println(x / y);
				break;
			default:
				System.out.println("Invalid operation!");
				break;
    	}
    }
}
