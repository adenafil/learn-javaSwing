import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() throws MalformedURLException, IOException {
        Image myPict = ImageIO.read(new URL("https://avatars.githubusercontent.com/u/125995735?v=4"));

        // JFrame = a GUI window to add components to
        this.setTitle("Ade Nafil this"); // set title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // activate x button on right corner

        this.setResizable(false); // to make window ? resizable

        // there will be a some properties that you can use below
        // this.setDefaultCloseOperation(Jthis.DO_NOTHING_ON_CLOSE);
        // this.setDefaultCloseOperation(Jthis.HIDE_ON_CLOSE);

        this.setSize(1240, 720); // sets the x-dimension and y-dimension of this
        this.setVisible(true); // make this visible

        this.setIconImage(new ImageIcon(myPict).getImage()); // Change icon of this on top left

        this.getContentPane().setBackground(new Color(0XDDDDDD)); // Change color of background
    }
}
