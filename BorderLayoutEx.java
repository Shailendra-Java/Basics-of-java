import java.awt.*;
class BorderLayoutEx
{
	private Frame f;
	private Button b1,b2,b3,b4,b5;
	BorderLayoutEx()
	{
		f = new Frame("Border Layout");
		b1 = new Button("Click Me");
		b2 = new Button("Cancel");
		b3 = new Button("Save");
		b4 = new Button("Open");
		b5 = new Button("Exit");
	}
	public void codeFrame()
	{
		f.setLayout(new BorderLayout(50,50));
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		BorderLayoutEx fx = new BorderLayoutEx();
		fx.codeFrame();
	}
}