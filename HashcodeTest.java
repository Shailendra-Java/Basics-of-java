public class HashcodeTest
{
   public static void main(String args[])
   {
      String Str = new String("Welcome");
	  String Str2 = new String("welcome");
	  int first = Str.hashCode();
	  int second = Str2.hashCode();
	  if(first == second)
	  {
		  System.out.println("Strings are equal\n"+first+"\n"+second);
	  }
	  else
	  {
		  System.out.println("Strings are not equal\n"+first+"\n"+second);
	  }
   }
}