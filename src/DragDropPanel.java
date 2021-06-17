import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public class DragDropPanel extends JPanel {
    //ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/elephant.png")));
    //ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/elephant.png")));
    //InputStream source1 = DragDropPanel.class.getResourceAsStream("elephant.png");
    ImageIcon icon = new ImageIcon(Objects.requireNonNull(DragDropPanel.class.getResource("images/elephant.png")));
    //ImageIcon icon = new ImageIcon("C:\\Users\\JIAN HE\\IdeaProjects\\DragDrop\\src\\resources\\images\\elephant.png");
    //ImageIcon icon = new ImageIcon.read (String.valueOf(new InputStreamReader(source1)));

    //ImageIcon icon = new ImageIcon("images/elephant.png");
    final int WIDTH = icon.getIconWidth();
    final int HEIGHT = icon.getIconHeight();
    Point ImageCorner;
    Point pervPt;

    DragDropPanel() {
        ImageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        icon.paintIcon(this, g,(int)ImageCorner.getX(),(int)ImageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent event) {
            pervPt = event.getPoint();
        }

    }
    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
            ImageCorner.translate(
                    (int) (currentPt.getX() - pervPt.getX()),
                    (int) (currentPt.getY() - pervPt.getY())
            );
            pervPt = currentPt;
            repaint();
        }
    }
}
