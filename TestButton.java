import java.awt.*;
import javax.swing.*;
public class TestButton
{
	private JFrame f;
	private JButton b;
	public TestButton()
	{
		f = new JFrame("Test");
		b = new JButton("Press Me");
		b.setActionCommand("ButtonPressed");
	}
	public void launchFrame()
	{
		b.addActionListener(new ButtonHandeler());
		f.add(b,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		TestButton tb = new TestButton();
		tb.launchFrame();
	}
}