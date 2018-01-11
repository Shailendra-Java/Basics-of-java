import java.util.*;
public class TestComparable 
{
	public static void main(String[] args)
	{
		Set<ComparableStudent> studentList = new TreeSet<>();
		studentList.add(new ComparableStudent("Thomas Jefferson", 1111, 3.8));
		 studentList.add(new ComparableStudent("John Adams", 2222, 3.9));
		 studentList.add(new ComparableStudent("George Washington", 3333, 3.4));
		 
		 for(ComparableStudent student:studentList)
		 {
			System.out.println(student); 
		 }
	}
}
