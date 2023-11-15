package JOptionPane;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws MalformedURLException, IOException {
        // JOptionPane = pop up a standard dialog box that prompts users for a value or
        // informs them of something

        // JOptionPane.showMessageDialog(null, "This is some useless info", "title",
        // JOptionPane.PLAIN_MESSAGE);

        // JOptionPane.showMessageDialog(null, "Here is some more useless info",
        // "title", JOptionPane.INFORMATION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "really ?", "title",
        // JOptionPane.QUESTION_MESSAGE);

        // JOptionPane.showMessageDialog(null, "You're computer has a VIRUS!!", "title",
        // JOptionPane.WARNING_MESSAGE);

        // JOptionPane.showMessageDialog(null, "Error Message bruh", "title",
        // JOptionPane.ERROR_MESSAGE);

        // int answer = JOptionPane.showConfirmDialog(null, "Bro Do You Even Code ?",
        // "This is My Title", JOptionPane.YES_NO_CANCEL_OPTION );
        // String name = JOptionPane.showInputDialog("What Is Your Name ?");
        // System.out.println("Hello " + name);

        String[] responses = {"No, You're Awesome", "Thank You!", "blush"};

        ImageIcon icon = new ImageIcon(ImageIO.read(new URL("https://www.1999.co.jp/itbig101/11015885a2_m.jpg"))
                .getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        JOptionPane.showOptionDialog(
            null,
            "You Are Awesome",
            "This Is Secret",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            icon,
            responses, 
            0);
    }
}
