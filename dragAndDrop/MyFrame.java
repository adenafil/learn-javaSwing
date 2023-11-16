package dragAndDrop;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    
    DragPanel dragPanel;

    MyFrame() throws MalformedURLException, IOException {

        dragPanel = new DragPanel();

        this.add(dragPanel);
        this.setTitle("Drag & Drop Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
    }
}
