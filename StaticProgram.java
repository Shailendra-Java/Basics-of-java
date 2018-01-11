import static staticimport.program.StaticExample.getValue;
import staticimport.program.StaticExample;

class StaticProgram
{
	public static void main(String a[])
	{
		StaticExample se1 = StaticExample.createObject();
		StaticExample se2 = StaticExample.createObject();
		
		System.out.println("Static Data = "+getValue());
		System.out.println("Static Data = "+getValue());
		
		System.out.println("Data = "+se1.getTemp());
		System.out.println("Data = "+se2.getTemp());
		
	}
}