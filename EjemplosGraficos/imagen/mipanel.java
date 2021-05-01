import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.*;

public class mipanel extends JPanel {
    public mipanel() {
        this.setSize(400, 280);
    }

    public void paint(Graphics g) {
        Dimension tam = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("../../baby yoda.jpg"));
        g.drawImage(imagenFondo.getImage(), 0, 0, tam.width, tam.height, null);
        // imagen, posicion xy, ancho,altura
        setOpaque(false);
        super.paintComponent(g);
    }

}