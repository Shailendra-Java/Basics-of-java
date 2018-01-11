import java.util.Scanner;
public class StringSwitch
{
    public static void main(String[] args) 
    {  
		Scanner s = new Scanner(System.in);
		int x=10, y=20;
		System.out.println("=>PLUS\n=>MINUS\n=>TIMES\n=>DIVIDE");
		System.out.println("Enter your choice");
		String add =s.next();
		switch(add) 
		{
			case "PLUS": System.out.println(x + y); 
			break;
			case "MINUS": System.out.println(x - y); 
			break;
			case "TIMES": System.out.println(x * y);
			break;
			case "DIVIDE": System.out.println(x / y);
			break;
			default: System.out.println("Please enter Valid choice");
		}
    }
}
