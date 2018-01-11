import java.util.*;
public class SetExample
{
	public static void main(String a[])
	{
		try
		{
			HashSet set = new HashSet();
			set.add("one");
			set.add("Second");
			set.add("3rd");
			set.add("one"); //set not allowed duplicate values
			set.add("fourth");
			System.out.println(set);
		}catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}
	}
}