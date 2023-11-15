package checkboxes;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton();
        button.setText("submit");
        
        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("I'm Not A Robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));

        button.addActionListener(e -> {
            if (e.getSource() == button) {
                System.out.println(checkBox.isSelected());
            }
        });

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }
}
