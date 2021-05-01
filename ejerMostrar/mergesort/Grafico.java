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
    private JButton ordenar;
    boolean tam=false;
    double a[];
    int pos=1;
    F_mergesort funcion = new F_mergesort();

    public Grafico() {
        this.setLayout(null);

        eti1 = new JLabel("digite el tamaño del Arreglo:");
        eti1.setBounds(20, 20, 175, 20);

        pedir = new JTextField("", 0);
        pedir.setColumns(8);
        pedir.setBounds(200, 20, 50, 20);

        eti2 = new JLabel("ingrese tamaño:");
        eti2.setBounds(20, 50, 175, 20);

        pedir2 = new JTextField("", 0);
        pedir2.setEditable(false);
        pedir2.setColumns(8);
        pedir2.setBounds(200, 50, 50, 20);

        boton = new JButton("ingresar dato");
        boton.setBounds(20, 100, 175, 20);

        reiniciar = new JButton("reiniciar");
        reiniciar.setBounds(20, 125, 175, 20);

        ordenar = new JButton("ordenar");
        ordenar.setBounds(20, 150, 175, 20);

        arreglo = new JLabel("");
        arreglo.setBounds(20, 200, 800, 20);


        this.add(eti1);
        this.add(pedir);
        this.add(eti2);
        this.add(pedir2);
        this.add(boton);
        this.add(reiniciar);
        this.add(ordenar);
        this.add(arreglo);

        boton.addActionListener(this);
        reiniciar.addActionListener(this);
        ordenar.addActionListener(this);

        this.setTitle("mergesort");
        this.setSize(600, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Grafico gui = new Grafico();
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton){
            if(tam==false){
                int x=0;
                x= Integer.parseInt(pedir.getText());
                a = new double[x];
                pedir.setEditable(false);
                pedir2.setEditable(true);
                eti2.setText("Ingresa el dato " + pos);
                tam=true;
            }else if(pos<=a.length){
                    String imprimir= "";
                    a[pos-1] =  Double.parseDouble(pedir2.getText());
                    for (int i = 0; i < pos; i++){
                        imprimir = imprimir +" " + a[i];
                    }
                    arreglo.setText("se agrego al arreglo: " + imprimir);
                    pos++;
                    eti2.setText("Ingresa el dato " + pos);
                }
        }else if(e.getSource()==reiniciar){
            tam=false;
            pedir2.setEditable(false);
            pedir2.setText("");
            pedir.setEditable(true);
            pedir.setText("");
            arreglo.setText("");
            pos=1;
        } else{
            String imprimir= "";
            funcion.mergesort(a, 0, a.length - 1);
            for (int i = 0; i < a.length; i++){
                imprimir = imprimir +" " + a[i];
            }
            arreglo.setText("se agrego al arreglo: " + imprimir);
        }

    }
}
