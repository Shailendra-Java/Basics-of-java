public class AddArguments2
{
	public static void main(String args[])
	{
		int sum=0;
		for(int i=0; i<args.length; i++)
		{
			try
			{
				sum+=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException nfe)
			{
				System.err.println("Error :[ "+args[i]+"] is not an Integer"
				+"and will not included in the sum");
			}
		}
				System.out.println("sum = "+sum);
		
	}
}