import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

public class Pantalla extends JFrame implements KeyListener {
    int[][] fondoMatriz = {{1,1,1,1,1,1,1,1,1,1},
                           {1,0,0,0,1,0,0,0,0,1},
                           {1,0,0,0,1,0,0,0,0,1},
                           {1,0,1,1,1,1,1,0,0,1},
                           {1,0,0,0,0,0,0,0,0,1},
                           {1,0,0,1,0,0,1,0,0,1},
                           {1,0,0,1,1,1,1,0,0,1},
                           {1,0,0,0,0,0,0,0,0,1},
                           {1,0,0,1,1,1,1,0,0,1},
                           {1,1,1,1,1,1,1,1,1,1}};
    Obstaculo obst = new Obstaculo();
    Esfera esf = new Esfera();

    @Override
    public void paint(Graphics g){
        obst.paint(g);
        esf.paint(g);
    }

    public Pantalla(){
        this.setLayout(null);
        this.setTitle("pruebas");
        this.setSize(600, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }

    public static void main(String[] args) {
        Pantalla gui = new Pantalla();
    }


    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
