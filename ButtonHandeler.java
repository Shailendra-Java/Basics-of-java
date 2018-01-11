import java.awt.event.*;
public class ButtonHandeler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Action Performed");
		System.out.println("Button's command is : "+e.getActionCommand());
		
	}
}