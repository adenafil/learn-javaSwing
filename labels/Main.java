package labels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args)throws Exception {
        Image myPict = ImageIO.read(new URL("https://avatars.githubusercontent.com/u/125995735?v=4"));

        // JLabel = a GUI display area for a string of text, an imagem,or both

        ImageIcon image = new ImageIcon(myPict);
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); // Create a label
        label.setText("Ade Nafil Firmansah"); // Set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); // can be set to TOP, CENTER, BOTTOM of imageIcon
        label.setForeground(new Color(0xFF5733)); // Set Font Color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); // Set font of text
        label.setIconTextGap(-25); // Set gap of text to image
        label.setBackground(new Color(0X3388FF)); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizintal position of icon + text within label
       // label.setBounds(100, 100, 500, 500); // set x, y position within frame as well as dimension

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(1000, 1000);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.add(label);
        frame.pack();
    }
}
