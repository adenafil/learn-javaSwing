package comboBoxes;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFrame extends JFrame{
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};

        JComboBox comboBox = new JComboBox(animals);

        // comboBox.setEditable(true);
        // System.out.println(comboBox.getItemCount());
        // comboBox.addItem("horse");
        // comboBox.insertItemAt("Pig", 0);
        // comboBox.setSelectedIndex(0);
        //comboBox.removeItem("cat");
        //comboBox.removeItem(0);
        // comboBox.removeAllItems();

        comboBox.addActionListener(e -> {
            if (e.getSource() == comboBox) {
                // System.out.println(comboBox.getSelectedItem());
                System.out.println(comboBox.getSelectedIndex());
            }
        });

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }
}
