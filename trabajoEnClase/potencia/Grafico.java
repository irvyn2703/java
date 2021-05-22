import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grafico extends JFrame implements ActionListener {
    private JLabel eti1;
    private JLabel eti2;
    private JTextField pedir;
    private JTextField pedir2;
    private JLabel arreglo;
    private JButton boton;
    private JButton reiniciar;
    boolean tam=false;
    double a[];
    int pos=1;
    potencia funcion = new potencia();

    public Grafico() {
        this.setLayout(null);

        eti1 = new JLabel("numero:");
        eti1.setBounds(20, 20, 50, 20);

        pedir = new JTextField("", 0);
        pedir.setColumns(8);
        pedir.setBounds(80, 20, 50, 20);

        eti2 = new JLabel("potencia:");
        eti2.setBounds(275, 20, 75, 20);

        pedir2 = new JTextField("", 0);
        pedir2.setColumns(8);
        pedir2.setBounds(360, 20, 50, 20);

        boton = new JButton("calcular");
        boton.setBounds(170, 70, 175, 20);

        arreglo = new JLabel("");
        arreglo.setVerticalTextPosition(1);
        arreglo.setBounds(170, 100, 800, 20);


        this.add(eti1);
        this.add(pedir);
        this.add(eti2);
        this.add(pedir2);
        this.add(boton);
        this.add(arreglo);

        boton.addActionListener(this);

        this.setTitle("calcular la potencia de un numero");
        this.setSize(600, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Grafico gui = new Grafico();
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        int m=Integer.parseInt(pedir.getText()) , n=Integer.parseInt(pedir2.getText());
        arreglo.setText("la potencia del numero " + pedir.getText() + " es " + funcion.potenciaRecursion(m , n));
    }
}