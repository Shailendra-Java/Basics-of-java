import java.util.Scanner;
		import java.util.regex.*; 
		public class VowelConsonant
		{
			public static void main(String[] x)
			{
				String ch;
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter a Character");
				ch = scan.next();
				if(Pattern.matches("[A-Za-z]", ch))
				{
					switch(ch.charAt(0))
					{
						case 'A':
						case 'a':
						case 'E':
						case 'e':
						case 'I':
						case 'i':
						case 'O':
						case 'o':
						case 'U':
						case 'u':
							System.out.println(ch+" is Vowel");
							break;
						default:
							System.out.println(ch+" is Consonant");
					}
				}
			}
		}