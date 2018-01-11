public class ComparableStudent implements Comparable<ComparableStudent>
{
	private String name;
	private long id = 0;
	private double gpa = 0.0;
	public ComparableStudent(String name, long id, double gpa)
	{
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	public String getName()
	{ return this.name; }
	// Additional code here
	public int compareTo(ComparableStudent s)
	{
		int result = this.name.compareTo(s.getName());
		if (result > 0)
		{ return 1; }
		else if (result < 0)
		{ return -1; }
		else
		{ return 0; }
	}
}
