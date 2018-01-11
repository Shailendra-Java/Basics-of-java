public class StringSplit 
{
	public static void main(String[] args)
	{
		String shirts = "Blue Shirt, Red Shirt, Black Shirt, Maroon Shirt";      
        String[] results = shirts.split(",");
        for(String shirtStr:results)
		{
            System.out.println(shirtStr);
        }
    }
}
