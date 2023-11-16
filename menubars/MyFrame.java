package menubars;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem, saveItem, exitItem;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // this ALT+ L for load
        editMenu.setMnemonic(KeyEvent.VK_E); // this ALT + E for save
        helpMenu.setMnemonic(KeyEvent.VK_H); // this ALT + Hl for exit

        loadItem.setMnemonic(KeyEvent.VK_L); // this l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // this s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // this l for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == loadItem) {
            System.out.println("Beep Boop You Loaded a file");
        }
        if (e.getSource() == saveItem) {
            System.out.println("Beep Boop You Saved a file");
        }
        if (e.getSource() == exitItem) {
            System.out.println("Beep Boop You Exit a file");
        }

    }

}
