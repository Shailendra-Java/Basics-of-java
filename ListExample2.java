import java.util.*;
public class ListExample2
{
	public static void main(String a[])
	{
		
		List list = new ArrayList();
		list.add(new String("One"));
		list.add(new Integer(10));
		list.add(new Float(11.5f));
		list.add(new Integer(10)); //list allowed duplicate values
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(" "+i.next());
		}
		
	}
}