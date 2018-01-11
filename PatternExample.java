package patternexample;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternExample
{
	public static void main(String[] args)
	{
		String t = "It was the best of times";
		Pattern pattern = Pattern.compile("the");
		Matcher matcher = pattern.matcher(t);
		if ( matcher.find())
		{
			System.out.println("Found match!");
		}
		else
			System.out.println("Not Found!");
	}
}
