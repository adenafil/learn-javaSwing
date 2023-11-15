package textfields;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(Color.green);
        textField.setBackground(Color.GRAY);
        textField.setCaretColor(Color.WHITE);
        textField.setText("Username");

        JButton button = new JButton("Submit");
        
        this.add(button);
        button.addActionListener(e -> {
            if (e.getSource() == button) {
                System.out.println("Welcone " + textField.getText());
                textField.setEditable(false);
                button.setEnabled(false);
            }
        });

        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

}
