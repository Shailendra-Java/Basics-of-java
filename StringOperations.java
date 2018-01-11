public class StringOperations {
	public static void main(String arg[]){   
		String string1= "Hello"; 
		String string2 = "World";
		String string3 = "";
		string3 = "Hello".concat(string2);
		System.out.println("string3: " + string3);
		System.out.println("Length: " + 	string1.length());
		System.out.println("Sub: " +  string3.substring(0, 5));
		System.out.println("Upper: " + string3.toUpperCase());        
	   }    
}

