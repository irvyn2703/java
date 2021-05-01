import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Miframe2 extends JFrame {
    public Miframe2() {
        mipanel p = new mipanel();
        getContentPane().add(p, BorderLayout.CENTER);
        p.repaint();
        setSize(400, 400);
        setVisible(true);
        setTitle("Imagen de Fondo");
    }

    public static void main(String[] args) {
        Miframe2 Frame = new Miframe2();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
