import java.awt.*;
public class MenuBarExample 
{
	Frame f;
	MenuBar menu;
	public MenuBarExample()
	{
		f = new Frame("Menu Bar");
		menu = new MenuBar();
	}
	public void launchFrame()
	{
		CheckboxMenuItem cmi = new CheckboxMenuItem("Delete");
		Menu m1 = new Menu("File");
		Menu m2 = new Menu("Edit");
		Menu m3 = new Menu("Help");
		menu.add(m1);
		menu.add(m2);
		menu.setHelpMenu(m3);
		MenuItem mi1 = new MenuItem("New");
		MenuItem mi2 = new MenuItem("Open");
		MenuItem mi3 = new MenuItem("Exit");
		m1.add(mi1);
		m1.addSeparator();
		m1.add(mi2);
		m1.add(mi3);
		m1.addSeparator();
		m1.add(cmi);
		f.setMenuBar(menu);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		MenuBarExample mbe = new MenuBarExample();
		mbe.launchFrame();
	}
}