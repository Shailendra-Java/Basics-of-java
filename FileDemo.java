import java.io.*;
public class FileDemo
{ 
	public static void main(String[] args) 
	{
		File f = null; 
		String[] strs = {"test1.txt", "test2.txt"}; 
		try
		{ 
			// for each string in string array 
			for(String s:strs ) 
			{ 
				System.out.println();
				// create new 
				 f= new File(s); 
				// true if the file is executable 
				boolean bool = f.canExecute(); 
				// find the absolute path 
				String a = f.getAbsolutePath(); 
				// prints absolute path 
				System.out.println(a); // prints 
				System.out.println(" is executable: "+ bool); 
				FileReader fr = new FileReader(f); 
				char [] a2 = new char[80]; 
				fr.read(a2); 
				for(char c : a2) 
				System.out.print(c); 
				fr.close(); 
			} 
		}catch(Exception e)
		{ 
			// if any I/O error occurs 
			e.printStackTrace(); 
		} 
	} 
}