import java.io.*;
class OStreamExample
{
	public static void main(String a[])
	{
		try
		{
		File file = new File("D:\\text.txt");
		DataInputStream stream = new DataInputStream(new FileInputStream(file));
		boolean isTrue = stream.readBoolean();
		int value = stream.readInt();
		stream.close();
		System.out.println(isTrue + " " + value);
		}catch(IOException e)
		{
			System.out.println(""+e);
		}
		
	}
}