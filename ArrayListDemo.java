import java.util.*;
class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList alObj = new ArrayList();
		System.out.println("Length of alObj :" + alObj.size());

		alObj.add("A");
		alObj.add("B");
		alObj.add("C");
		alObj.add("D");
		alObj.add(1,"S");

		System.out.println("Length of alObj :" + alObj.size());
		System.out.println("Array List alObj :" + alObj);
		
		alObj.remove("D");
		alObj.remove(2);

		System.out.println("Array List alObj :" + alObj);
	}
}

