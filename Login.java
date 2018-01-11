public class Login
{
	static String id,password;
	public Login(String id, String pass)
	{
		this.id = id;
		password = pass;
	}
	public void check()
	{
		if(id.equals("niit") && password.equals("123"))
		{
			welcome();
		}
		else
		{
			error();
		}
	}
	public static void welcome()
	{
		System.out.println("Welcome To NIIT Gwalior");
		System.out.println("H! "+id+"\nThank you for visiting");
	}
	public static void error()
	{
		System.out.println("Invalid ID OR Password!!!");
	}
	public static void main(String a[])
	{
		String id, pass;
		id = a[0];
		pass = a[1];
		Login l = new Login(id,pass);
		l.check();
	}
}h