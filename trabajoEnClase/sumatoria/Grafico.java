import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grafico extends JFrame implements ActionListener{
    private JLabel eti1;
    private JTextField pedir;
    private JTextField resul;
    private JButton boton;
    operacion op = new operacion();

    public Grafico() {
        this.setLayout(new FlowLayout());

        eti1 = new JLabel("Numeros a sumar");
        eti1.setLocation(0, 50);
        pedir = new JTextField("",0);
        pedir.setColumns(8);
        resul = new JTextField("resultado",0);
        resul.setColumns(8);
        boton = new JButton("resultado");

        resul.setEditable(false);

        this.add(eti1);
        this.add(pedir);
        this.add(resul);
        this.add(boton);

        boton.addActionListener(this);

        this.setTitle("sumatoria");
	    this.setSize(600, 300);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) 
	    {
	        Grafico gui = new  Grafico();
	    }  

        @Override
	    
	    public void actionPerformed(ActionEvent e)
	    {
            int n=10000;
            n = Integer.parseInt(pedir.getText());
                resul.setText(" "+op.sumaNenteros(n));
        }
}
