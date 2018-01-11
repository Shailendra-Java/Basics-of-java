import java.util.*;
public class SetExample2 
{
   public static void main(String[] args)
   {
	   Set<String> set = new TreeSet<>();
	   set.add("one");
	   set.add("two");
	   set.add("three");
	   set.add("Four");
	   set.add("Agra");
	   set.add("Gwalior");
	   set.add("three"); // not added, only unique
	   for (String item:set)
	   {
		System.out.println("Item: " + item);
	   }
   }
}
