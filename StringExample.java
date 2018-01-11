package strings;
public class StringExample 
{
  public static void main(String[] ar)
  {
	  char letter = 'a';
		String string1 = "Hello";
		String string2 = "World";
		String string3 = "";
		String result="";
		String d = new String ("Bad Practice");
		string3 = string1 + string2;//Concatenate strings
		System.out.println("Output: " + string3 + " " + letter);
		result = string3+d;
		System.out.println("Result = "+result);
  }
}
