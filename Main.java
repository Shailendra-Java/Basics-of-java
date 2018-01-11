import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
 
public class Main {
 
  public static void main(String[] args) {
 
    final JFrame frame = new JFrame("JToggle Button Demo");
    frame.setSize(200, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane( ).setLayout(new FlowLayout());
 
    JToggleButton jtbButton = new JToggleButton("ToggleButton Press Me");
 
    jtbButton.addActionListener(new ActionListener( ) {
      public void actionPerformed(ActionEvent ev) {
        JOptionPane.showMessageDialog(frame,
                                "Action Event"
                                );
      }
    });
    jtbButton.addItemListener(new ItemListener( ) {
      public void itemStateChanged(ItemEvent ev) {
          JOptionPane.showMessageDialog(frame,
                                "Item Event"
                                );
      }
    });
    jtbButton.addChangeListener(new ChangeListener( ) {
      public void stateChanged(ChangeEvent ev) {
                  JOptionPane.showMessageDialog(frame,
                                "Change event"
                                );
      }
    });
    frame.add(jtbButton);
    frame.setVisible(true);
  }
}