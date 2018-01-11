import java.io.*;
class IOStreamExample
{
	public static void main(String a[])
	{
		try
		{
		File file = new File("D:\\text.txt");
		file.createNewFile();
		DataOutputStream stream = new DataOutputStream(new FileOutputStream(file));
		stream.writeBoolean(true);
		stream.writeInt(1234);
		stream.close();
		}catch(IOException e)
		{
			System.out.println(""+e);
		}
		
	}
}
