import java.awt.*;
class FlowLayoutEx
{
	private Frame f;
	private Button b1,b2;
	public TextField t;
	FlowLayoutEx()
	{
		f = new Frame("Flow Layout");
		b1 = new Button("Click Me");
		b2 = new Button("Cancel");
		t = new TextField();
	}
	public void codeFrame()
	{
		f.setLayout(new FlowLayout());
		f.setSize(300,300);
		f.setBackground(Color.gray);
		f.add(b1);
		f.add(b2);
		f.add(t);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		FlowLayoutEx fx = new FlowLayoutEx();
		fx.codeFrame();
	}
}