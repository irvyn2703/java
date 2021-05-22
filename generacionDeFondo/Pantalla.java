import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

public class Pantalla extends JFrame {
   
    Obstaculo obst = new Obstaculo();
    // Esfera esf = new Esfera();

    @Override
    public void paint(Graphics g){
        obst.paint(g);
        // esf.paint(g);
    }

    public Pantalla(){
        JButton[] btn = new JButton[25];
        btn[0] = new JButton();
        btn[0].setBounds(0, 50, 50, 50);

        btn[1] = new JButton();
        btn[1].setBounds(50, 50, 50, 50);

        btn[2] = new JButton();
        btn[2].setBounds(100, 50, 50, 50);

        btn[3] = new JButton();
        btn[3].setBounds(150, 50, 50, 50);

        btn[4] = new JButton();
        btn[4].setBounds(200, 50, 50, 50);

        btn[5] = new JButton();
        btn[5].setBounds(250, 50, 50, 50);

        add(btn[0]);
        add(btn[1]);
        add(btn[2]);
        add(btn[3]);
        add(btn[4]);
        this.setLayout(null);
        this.setTitle("pruebas");
        this.setSize(600, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }

    public static void main(String[] args) {
        // pantallitas


        // juego
        Pantalla gui = new Pantalla();

        // puntajes

        // guarda archivo

    }

}
