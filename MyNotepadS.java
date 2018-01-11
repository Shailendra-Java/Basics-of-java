import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class MyNotepadS extends JFrame implements ActionListener {
   JMenuBar mb;
   JMenu filemenu, editmenu, formatmenu, viewmenu, helpmenu;
   JMenuItem newitem, openitem, saveitem, saveasitem, pagesetupitem,
         printitem, exititem, undoitem, cutitem, copyitem, pasteitem,
         deleteitem, finditem, findnextitem, replaceitem, gotoitem,
         selectallitem, timedateitem, wordwrapitem, fontitem, statusbaritem,
         viewhelpitem, aboutnotepaditem;
   JTextArea ta;
   JScrollPane jsp;
   JFileChooser jfc;
   JColorChooser jc;
   Font f = new Font("verdana", 3, 30);
   public MyNotepadS() {
      jfc = new JFileChooser();
      jc = new JColorChooser();
      ta = new JTextArea();
      ta.setFont(f);
      int vsp = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
      int hsp = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
      jsp = new JScrollPane(ta, vsp, hsp);
      add(jsp);
      mb = new JMenuBar();
      setJMenuBar(mb);
      filemenu = new JMenu("File");
      editmenu = new JMenu("Edit");
      formatmenu = new JMenu("Format");
      viewmenu = new JMenu("View");
      helpmenu = new JMenu("Help");
      mb.add(filemenu);
      mb.add(editmenu);
      mb.add(formatmenu);
      mb.add(viewmenu);
      mb.add(helpmenu);
      newitem = new JMenuItem("New");
      newitem.setAccelerator(KeyStroke.getKeyStroke('N', 1));
      openitem = new JMenuItem("Open");
      saveitem = new JMenuItem("Save");
      saveasitem = new JMenuItem("Save as....");
      pagesetupitem = new JMenuItem("Page Setup...");
      printitem = new JMenuItem("Print... Ctrl+P");
      exititem = new JMenuItem("Exit");
      exititem.setAccelerator(KeyStroke.getKeyStroke('X',
            InputEvent.ALT_DOWN_MASK));
      undoitem = new JMenuItem("Undo");
      cutitem = new JMenuItem("Cut");
      cutitem.setAccelerator(KeyStroke.getKeyStroke('X',
            InputEvent.CTRL_DOWN_MASK));
      copyitem = new JMenuItem("Copy");
      pasteitem = new JMenuItem("Paste");
      deleteitem = new JMenuItem("Delete  Del");
      finditem = new JMenuItem("Find... Ctrl+F");
      findnextitem = new JMenuItem("Find Next  F3");
      replaceitem = new JMenuItem("Replace... Ctrl+H");
      gotoitem = new JMenuItem("GoTo... Ctrl+G");
      selectallitem = new JMenuItem("Select All Ctrl+A");
      timedateitem = new JMenuItem("Time/Date  F5");
      wordwrapitem = new JMenuItem("WordWrap     ");
      fontitem = new JMenuItem("Color  ");
      statusbaritem = new JMenuItem("Status Bar");
      viewhelpitem = new JMenuItem("View Help");
      aboutnotepaditem = new JMenuItem("About Notepad");
      filemenu.add(newitem);
      filemenu.add(openitem);
      filemenu.add(saveitem);
      filemenu.add(saveasitem);
      filemenu.addSeparator();
      filemenu.add(pagesetupitem);
      filemenu.add(printitem);
      filemenu.addSeparator();
      filemenu.add(exititem);
      editmenu.add(undoitem);
      editmenu.addSeparator();
      editmenu.add(cutitem);
      editmenu.add(copyitem);
      editmenu.add(pasteitem);
      editmenu.add(deleteitem);
      editmenu.addSeparator();
      editmenu.add(finditem);
      editmenu.add(findnextitem);
      editmenu.add(replaceitem);
      editmenu.add(gotoitem);
      editmenu.addSeparator();
      editmenu.add(selectallitem);
      editmenu.add(timedateitem);
      formatmenu.add(wordwrapitem);
      formatmenu.add(fontitem);
      viewmenu.add(statusbaritem);
      helpmenu.add(viewhelpitem);
      helpmenu.add(aboutnotepaditem);
      setTitle("Untitled - Notepad");
      setVisible(true);
      setExtendedState(MAXIMIZED_BOTH);
      newitem.addActionListener(this);
      openitem.addActionListener(this);
      saveitem.addActionListener(this);
      saveasitem.addActionListener(this);
      exititem.addActionListener(this);
      copyitem.addActionListener(this);
      cutitem.addActionListener(this);
      pasteitem.addActionListener(this);
      fontitem.addActionListener(this);
   }
   public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == exititem) {
         System.exit(0);
      }
      if (ae.getSource() == newitem) {
         ta.setText("");
      }
      if (ae.getSource() == copyitem) {
         ta.copy();
      }
      if (ae.getSource() == pasteitem) {
         ta.paste();
      }
      if (ae.getSource() == cutitem) {
         ta.cut();
      }
      if (ae.getSource() == openitem) {
         String s = ta.getText();
         if (!(s.equalsIgnoreCase(""))) {
            int opt = JOptionPane.showConfirmDialog(this,
                  "Do u want to save the previous data?y/n");
            if (opt == JOptionPane.YES_OPTION) {
               jfc.showSaveDialog(this);
               try {
                  FileWriter fw = new FileWriter(jfc.getSelectedFile());
                  String data = ta.getText();
                  fw.write(data + "\n");
                  fw.close();
               } catch (Exception e) {
                  JOptionPane.showMessageDialog(this, "Error in write",
                        "Error", JOptionPane.ERROR_MESSAGE);
               }
            }
         } else {
            jfc.showOpenDialog(this);
            try {
               FileReader fr = new FileReader(jfc.getSelectedFile());
               BufferedReader br = new BufferedReader(fr);
               String data = "";
               ta.setText("");
               while ((data = br.readLine()) != null) {
                  ta.append(data + "\n");
               }
               fr.close();
            } catch (Exception e) {
               JOptionPane.showMessageDialog(this, "Error in open",
                     "Error", JOptionPane.ERROR_MESSAGE);
            }
         }
      }
      if (ae.getSource() == saveitem) {
         jfc.showSaveDialog(this);
         try {
            FileWriter fw = new FileWriter(jfc.getSelectedFile());
            String data = ta.getText();
            fw.write(data + "\n");
            fw.close();
         } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error in write", "Error",
                  JOptionPane.ERROR_MESSAGE);
         }
      }
      if (ae.getSource() == fontitem) {
         ta.setForeground(jc.showDialog(this, "Color", Color.red));
      }
   }
   public static void main(String args[]) {
      new MyNotepadS();
   }
}