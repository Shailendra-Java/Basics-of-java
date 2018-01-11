import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ReplacingExample 
{
 public static void main(String[] args)
 {
	 String header = "Gwalior city is nice city. Gwalior have more hestorical buildings"; 
	 Pattern p1 = Pattern.compile("Gwalior");
	 Matcher m1 = p1.matcher(header);
	 if (m1.find())
	 {
		  header = m1.replaceAll("Agra");
		  System.out.println(header);
	 }
 }

}
