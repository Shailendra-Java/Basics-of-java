import java.util.*;
class VectorDemo
{
	public static void main(String args[])
	{
		Vector vect = new Vector();
		vect.addElement(new Integer(10));
		vect.addElement(new Integer(11));
		vect.addElement(new Integer(12));

		Enumeration enm = vect.elements();
		while (enm.hasMoreElements())
		{
			System.out.println("(double)vect name : " + enm.nextElement());
		}
		if(vect.contains(new Integer(10)))
		{
			System.out.println("Vector contains 10");
		}
		else
		{
			System.out.println("Vector doesnot contain 10");
		}

	}
}
