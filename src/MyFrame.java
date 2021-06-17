import javax.swing.*;

public class MyFrame extends JFrame {

    DragDropPanel dragDropPanel = new DragDropPanel();

    MyFrame() {
        this.add(dragDropPanel);
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Drag & Drop demo");
        this.setVisible(true);
    }
}
