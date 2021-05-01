import java.awt.*;
import javax.swing.*;
public class Ejemplo1 extends JFrame{
    private JLabel etqContador;
    private JTextField tfContador;
    private JButton btnContador;

    public Ejemplo1() {
        this.setLayout(new FlowLayout());

        etqContador = new JLabel("Número: ");
        tfContador = new JTextField("0",10);
        btnContador = new JButton("Contar");

        tfContador.setEditable(false);

        this.add(etqContador);
        this.add(tfContador);
        this.add(btnContador);

        this.setTitle("Contador");
        this.setSize(300,100);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Ejemplo1 ejem = new Ejemplo1();
    }
}
