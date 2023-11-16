package MouseListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == label) {
            System.out.println("You Clicked The Mouse");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == label) {
            System.out.println("You Pressed The Mouse");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == label) {
            System.out.println("You Released The Mouse");
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == label) {
            System.out.println("You entered The Mouse");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == label) {
            System.out.println("You exited The Mouse");
        }
    }
}
