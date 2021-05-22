import java.awt.*;
import java.awt.Graphics;

public class Obstaculo {
    // atributos
    int[][] fondoMatriz = {{0,0,1,0,1,},
                           {1,0,0,0,1,},
                           {1,0,0,0,1,},
                           {1,0,0,1,1,},
                           {1,0,0,0,0,},};
                        
    boolean hayObstaculo = false;

    // constructor
    public Obstaculo() {

    }

    // metodos
    public void paint(Graphics g) {
        for (int i=0;i<fondoMatriz.length;i++){
            for (int j=0;j<fondoMatriz[0].length;j++){
                if(fondoMatriz[i][j] == 1){
                    g.setColor(Color.black);
                    g.fillRect((j)*50+8,(i)*50+80, 50, 50);
                    // g.drawImage("kokun.jpg", (j)*50+8,(i)*50+80,);
                }
                if(fondoMatriz[i][j] == 0){
                    g.setColor(Color.green);
                    g.fillOval((j)*50+8,(i)*50+80, 50, 50);
                }
            }
        }
    }
}