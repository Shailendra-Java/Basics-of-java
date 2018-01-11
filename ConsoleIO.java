import java.io.*;
public class ConsoleIO
{
	public static void main(String a[])
	{
		Console cons = System.console();
		boolean userValid=false;
		if (cons != null) {
			String userTyped; String pwdTyped;
			do {
				userTyped = cons.readLine("%s", "User name: ");
				pwdTyped = new String(cons.readPassword("%s", "Password: "));
				if (userTyped.equals("oracle") && pwdTyped.equals("tiger")) {
					System.out.println("Please Wait ");
					try
					{
					for(int i=0; i<15; i++){
						System.out.print("*");
						Thread.sleep(1000);
					}
					}catch(InterruptedException e)
					{
						System.out.println(e);
					}
					userValid = true;
				}
				else {
					System.out.println("Wrong user name/password. Try again.\n");
				}
			} while (!userValid); 
		}
	}
}
