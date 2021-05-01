import javax.swing.*;

public class GUIPresentacion extends JFrame{
    public GUIPresentacion(){
        JFrame frame = new JFrame();
        frame.setTitle("Barra de titulo");
        frame.setSize(300,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        GUIPresentacion gui = new GUIPresentacion();
    }
}