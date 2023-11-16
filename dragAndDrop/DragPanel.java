package dragAndDrop;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    final int WIDTH;
    final int HEIGHT;
    Point imageCorner;
    Point prevPt;
    ImageIcon image;

    DragPanel() throws MalformedURLException, IOException {
        image = new ImageIcon(ImageIO.read(new URL("https://avatars.githubusercontent.com/u/125995735?v=4")));
        WIDTH = image.getIconWidth();
        HEIGHT = image.getIconHeight();
        imageCorner = new Point(0, 0);

        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);;

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends java.awt.event.MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();

            imageCorner.translate(
               (int) (currentPt.getX() - prevPt.getX()),
               (int) (currentPt.getY() - prevPt.getY())
            );

            prevPt = currentPt;
            repaint();
        }
    }
}
