import java.util.*;
public class StackDemo 
{
  public static void main(String[] args) 
  {
	Stack stack = new Stack();
		
	stack.push("Aman");
	stack.push("Rahul");
	stack.push("Rakesh");
	stack.push("Buddhi");
	
	Iterator itr = stack.iterator();
	while(itr.hasNext())
		System.out.println("Name is: "+stack.pop());
  }
}
