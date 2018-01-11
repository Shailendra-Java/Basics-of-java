import java.awt.*;
public class FrameExample
{
	private Frame f;
	public Panel p;
	public FrameExample()
	{
		f = new Frame("Frame Example");
		p = new Panel();
	}
	public void launchFrame()
	{
		f.setSize(455,455);
		f.setLayout(null);
		f.setBackground(Color.red);
		p.setSize(250,250);
		p.setBackground(Color.yellow);
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		FrameExample fe = new FrameExample();
		fe.launchFrame();
	}
}