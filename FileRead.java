import java.io.*; 
public class FileRead
{ 
	public static void main(String args[])throws IOException
	{ 
			File file = new File("Hello1.txt"); 
			FileWriter writer = new FileWriter(file); 
			writer.write("This\n is\n an\n Example\n"); 
			writer.flush(); 
			writer.close(); 
			FileReader fr = new FileReader(file); 
			char [] a = new char[50]; 
			fr.read(a); 
			for(char c : a) 
			{
				if(c>='a' && c<='z')
				{
					c -= 32;
					System.out.print(c);
				}
				else
				{
					System.out.print(c);
				}
			}
			fr.close(); 
	} 
}