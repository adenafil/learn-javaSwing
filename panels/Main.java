package panels;

// import java.awt.BorderLayout;
import java.awt.Color;import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) throws MalformedURLException, IOException {
        // Jpanel = a GUI component that functions as a container to hold other components
        Image myPict = ImageIO.read(new URL("https://avatars.githubusercontent.com/u/125995735?v=4"));
        ImageIcon icon = new ImageIcon(myPict.getScaledInstance(100, 100, Image.SCALE_DEFAULT));        

        JLabel label = new JLabel();
        label.setText("Hi i'm Ade");
        label.setIcon(icon);
        // label.setVerticalAlignment(JLabel.BOTTOM);
        // label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100, 100, 200, 150);
        // label.setPreferredSize(new Dimension(200, 200));

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
