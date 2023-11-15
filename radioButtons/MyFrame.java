package radioButtons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamburger");
        hotdogButton = new JRadioButton("Hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();

        // pizzaButton.addActionListener(e -> {
        //     if (e.getSource() == pizzaButton) {
        //         System.out.println("You Order Pizza");
        //     }
        // });
        // hamburgerButton.addActionListener(e -> {
        //     if (e.getSource() == pizzaButton) {
        //         System.out.println("You Order Hamburger");
        //     }
        // });
        // hotdogButton.addActionListener(e -> {
        //     if (e.getSource() == pizzaButton) {
        //         System.out.println("You Order Hotdog");
        //     }
        // });

            pizzaButton.addActionListener(this);
            hamburgerButton.addActionListener(this);
            hotdogButton.addActionListener(this);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) System.out.println("You Orderd a Pizza!");
        if (e.getSource() == hamburgerButton) System.out.println("You Orderd a Hamburger!");
        if (e.getSource() == hotdogButton) System.out.println("You Orderd a hotdog!");
    }
}
