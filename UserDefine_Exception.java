class InvalidMobile extends Exception
{
	InvalidMobile(String msg)
	{
		super(msg);
	}
}
public class UserDefine_Exception
{
	public static void main (String s[])
	{
		String m_num=s[0];
		try
		{
			if(m_num.length()>10||m_num.length()<10)
			{
				throw new InvalidMobile("Exception: Inavlid mobile Number");
			}
			else
			{
				System.out.println("Mobile Number is = "+m_num);
			}
		}
		catch(InvalidMobile e)
		{
			System.out.println(e.getMessage());
			System.out.println("Please provide a valid Number");
		}		
	} 
}