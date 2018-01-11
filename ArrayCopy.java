class ArrayCopy
{
	static int arr1[]={1,2,3,4,5};
	static int arr2[]={10,20,30,40,50,60,70,80,90};
	public static void main(String a[])
	{
	    System.out.println("Array 1: ");
		for(int i:arr1)
		{
			System.out.print("  "+i);
		}
		System.out.println("\nArray 2: ");
		for(int j:arr2)
		{
			System.out.print("  "+j);
		}
		System.out.println("\nAfter copy Array 2: ");
		System.arraycopy(arr1,0,arr2,0,arr1.length);
		for(int i: arr2)
		{
			System.out.print("  "+i);
		}		
	}
}