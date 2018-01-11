class Emp
 {	
    private int age ;		
    public Emp( int age )	
        {		
        this.age = age;	
        }		

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emp other = (Emp) obj;
        if (this.age != other.age) {
            return false;
        }
        return true;
    }
   	
    public int hashCode()	
    {		
    return age;
    }
    
}
    
public class Hash
{	
public static void main(String[] args) 	
{		
Emp emp1 = new Emp(23);		
System.out.println("emp1.hashCode()"+emp1.hashCode());	
}
}
//In the preceding example, the variable age in the class Emp is important. Here the hashCode value will return the age of the person.
