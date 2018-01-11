import java.util.Scanner;
class _1DArray
{
	//Declaring Array
	String[] arr=new String[5];
	int i;
	public void acceptArray()
	{
		//Creating object of Scanner class for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 String values");
		
		//For loop to store 5 String values
		for(i=0; i<5; i++)
		{
			arr[i]=sc.next();
		}
	}
	public void displayArray()
	{
		System.out.println("Array values are...");
		
		//Foreach Loop to traverse array elements
		for(String j:arr)
		{
			System.out.print(j+"\t");
		}
	}
	public static void main(String ar[])
	{
		_1DArray obj = new _1DArray();
		obj.acceptArray();
		obj.displayArray();
		
	}
}