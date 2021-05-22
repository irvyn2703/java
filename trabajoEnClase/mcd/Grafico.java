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
    Funcion_mcd funcion = new Funcion_mcd();

    public Grafico() {
        this.setLayout(null);

        eti1 = new JLabel("Ingrese el primer numero:");
        eti1.setBounds(20, 20, 175, 20);

        pedir = new JTextField("", 0);
        pedir.setColumns(8);
        pedir.setBounds(200, 20, 50, 20);

        eti2 = new JLabel("ingrese el segundo numero:");
        eti2.setBounds(275, 20, 175, 20);

        pedir2 = new JTextField("", 0);
        pedir2.setColumns(8);
        pedir2.setBounds(460, 20, 50, 20);

        boton = new JButton("calcular");
        boton.setBounds(170, 50, 175, 20);

        arreglo = new JLabel("");
        arreglo.setVerticalTextPosition(1);
        arreglo.setBounds(170, 150, 800, 20);


        this.add(eti1);
        this.add(pedir);
        this.add(eti2);
        this.add(pedir2);
        this.add(boton);
        this.add(arreglo);

        boton.addActionListener(this);

        this.setTitle("calcular el minimo comun multiplo");
        this.setSize(600, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Grafico gui = new Grafico();
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        arreglo.setText("El minimo comun multiplo es " + funcion.mcd(Integer.parseInt(pedir.getText()), Integer.parseInt(pedir2.getText())));

    }
}