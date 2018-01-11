public class ReverseStringArray
		{
			public static void main(String[] x)
			{
				String[] days = new String[]{"Sunday","Monday","Tuesday","Wednesday"};
				for(int i=days.length-1; i>=0; i--)
				{
					System.out.print(days[i]+"\t");
				}
			}
		}