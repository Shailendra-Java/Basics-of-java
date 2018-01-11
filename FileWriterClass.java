import java.io.*;
import java.io.FileWriter;
class FileWriterClass
{
	public static void main(String a[])
	{
		try
		{
			File f = new File("Hello.txt");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			FileWriter fw = new FileWriter(f);
			String s = br.readLine();
			fw.write(s);
			fw.flush(); // To clear the FileWriter
			fw.close(); // Closing the FileWriter
		}catch(IOException e)
		{
			System.out.println(" "+e);
		}
	}
}