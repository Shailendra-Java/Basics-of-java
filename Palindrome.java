		import java.util.Scanner;
		public class Palindrome
		{
			public static void main(String[] x)
			{
				String name,rev="";
				int i, j=0, count=0;
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter a string to check palindrome");
				name = scan.next();
				for(i=name.length()-1; i>=0; i--)
				{
					rev += name.charAt(i);
					j++;
				}
				for(i=0; i<name.length(); i++)
				{
					if(rev.charAt(i) == name.charAt(i))
						count++;
					else
						continue;
				}
				if(count == name.length())
					System.out.println(name+" is a palindrome");
				else
					System.out.println(name+" not a palindrome");
			}
		}