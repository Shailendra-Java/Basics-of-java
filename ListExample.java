import java.util.*;
public class ListExample
{
	public static void main(String a[])
	{
		
		List<String> list = new ArrayList<>();
		list.add(new String("One"));
		list.add(new String("Second"));
		list.add(new String("Third"));
		list.add(new String("Second")); //list allowed duplicate values
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(" "+i.next());
		}
		
	}
}