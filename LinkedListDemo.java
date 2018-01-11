import java.util.*;
class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList llObj = new LinkedList();
		
		llObj.add("Isha");
		llObj.add("Nisha");
		llObj.add("Shilpa");
		System.out.println("Linked List :" + llObj);
		System.out.println("Linked List size :" + llObj.size());
		llObj.addFirst("Monika");
		llObj.addLast("Anjali");
		System.out.println("Linked List :" + llObj);
		llObj.removeFirst();
		llObj.removeLast();
		System.out.println("Linked List :" + llObj);
    }
}
