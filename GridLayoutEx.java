import java.awt.*;
class GridLayoutEx
{
	private Frame f;
	private Button b1,b2,b3,b4,b5,b6;
	GridLayoutEx()
	{
		f = new Frame("Grid Layout");
		b1 = new Button("Click Me");
		b2 = new Button("Cancel");
		b3 = new Button("Save");
		b4 = new Button("Open");
		b5 = new Button("Load");
		b6 = new Button("Delete");
	}
	public void codeFrame()
	{
		f.setLayout(new GridLayout(2,3));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		GridLayoutEx fx = new GridLayoutEx();
		fx.codeFrame();
	}
}