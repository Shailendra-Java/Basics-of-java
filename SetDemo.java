import java.util.Set;
import java.util.TreeSet;

public class SetDemo
{
	public static void main(String args[])
	{
		TreeSet hs = new TreeSet();
		hs.add(11);
		hs.add(5);
		hs.add(15);
		hs.add(10);
		hs.add(90);
		hs.add(70);
		TreeSet<String> hs2 = new TreeSet<>();
		hs2.add("Hello");
		hs2.add("Sachin");
		hs2.add("Aman");
		hs2.add("Kamal");
		System.out.println(hs);
		System.out.println(hs2);
	}
} 

