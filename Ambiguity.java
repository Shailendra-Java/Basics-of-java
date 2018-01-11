public class Ambiguity
{
	//Declaring instance variables
	int rollno;
	String name;
	float marks;
	
	//Declaring Constructor to initialize instance variables
	
	public Ambiguity(int rollno, String name, float marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	// Displaying data
	
	public void display()
	{
		System.out.println("Students Details...");
		System.out.println("Name : "+name+"\nRoll No. : "+rollno+"\nMarks : "+marks);
	}
	
	public static void main(String args[])
	{
		Ambiguity am = new Ambiguity(123,"John",85.5f);
		am.display();
	}
}