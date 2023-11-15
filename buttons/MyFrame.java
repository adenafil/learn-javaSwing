package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

    JButton button;
    JLabel label;

    MyFrame()throws Exception{
        Image myPict = ImageIO.read(new URL("https://avatars.githubusercontent.com/u/125995735?v=4"));
        ImageIcon icon = new ImageIcon(myPict.getScaledInstance(50, 50, Image.SCALE_DEFAULT));

        ImageIcon icon2 = new ImageIcon(ImageIO.read(new URL("https://www.1999.co.jp/itbig101/11015885a2_m.jpg")).getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(e -> {
            // System.out.println("poo");
            // button.setEnabled(false);
            label.setVisible(true);
        });
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
}
