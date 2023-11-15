package HowToOpenNewWindow;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    LaunchPage() {

        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(e -> {
            if (e.getSource() == myButton) {
                frame.dispose();
                 new NewWindow();
            }
        });

        frame.add(myButton);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
