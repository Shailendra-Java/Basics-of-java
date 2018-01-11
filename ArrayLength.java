public class ArrayLength
		{
			public static void main(String[] x)
			{
				int[] ar1 = {11,22,33,44,55,66,77};
				int[] ar2 = {1,2,3,4,5,6,7,8,9,0,11,22};
				
				if(ar1.length > ar2.length)
				{
					System.out.println("Largest Array is Ar1");
					for(int i:ar1)
						System.out.print(i+"\t");
				}
				else
				{
					System.out.println("Largest Array is Ar2");
					for(int i:ar2)
						System.out.print(i+"\t");
				}
			}
		}