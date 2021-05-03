import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

class SumaDatos extends JFrame implements ActionListener {
    private JTextField textfield1, textfield2;
    private JTextArea textarea1;
    private JButton boton1, boton2,multi,divi,raiz,potencia;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    // menu
    private JMenuBar menu;
    private JMenu historial,tipo,ayuda;
    private JMenuItem verHistorial,borrarHistorial,guardarHistorial,cientifica,normal,tutorial,acercaDe;

    public SumaDatos() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);;

        // crea la barra
        menu = new JMenuBar();
        menu.setBounds(0,0,400,30);
        add(menu);

        // crea las opciones principales
        historial = new JMenu("historial");
        menu.add(historial);
        tipo = new JMenu("tipo");
        menu.add(tipo);
        ayuda = new JMenu("ayuda");
        menu.add(ayuda);

        //  crea las opciones secundarias
        verHistorial = new JMenuItem("ver Historial");
        historial.add(verHistorial);
        borrarHistorial = new JMenuItem("borrar Historial");
        historial.add(borrarHistorial);
        guardarHistorial = new JMenuItem("guardar Historial");
        historial.add(guardarHistorial);
        cientifica = new JMenuItem("cientifica");
        tipo.add(cientifica);
        cientifica.addActionListener(this);
        normal = new JMenuItem("normal");
        tipo.add(normal);
        normal.addActionListener(this);
        tutorial = new JMenuItem("tutorial");
        ayuda.add(tutorial);
        acercaDe = new JMenuItem("acerca De...");
        ayuda.add(acercaDe);

        label1 = new JLabel("Primer dato");
        label1.setBounds(10, 30, 100, 20);
        add(label1);
        textfield1 = new JTextField();
        textfield1.setBounds(100, 30, 90, 20);
        add(textfield1);
        textfield2 = new JTextField();
        label2 = new JLabel("Segundo dato");
        label2.setBounds(10, 60, 100, 20);
        add(label2);
        textfield2.setBounds(100, 60, 90, 20);
        add(textfield2);
        label3 = new JLabel("Resultado");
        label3.setBounds(10, 90, 100, 20);
        add(label3);
        textarea1 = new JTextArea();
        textarea1.setBounds(100, 90, 80, 20);
        add(textarea1);
        boton1 = new JButton("+");
        boton1.setBounds(10, 150, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        boton2 = new JButton("-");
        boton2.setBounds(10, 200, 100, 30);
        add(boton2);
        multi = new JButton("x");
        multi.setBounds(120,150, 100, 30);
        add(multi);
        multi.addActionListener(this);
        divi = new JButton("/");
        divi.setBounds(120,200, 100, 30);
        add(divi);
        divi.addActionListener(this);
        raiz = new JButton("raiz");
        raiz.setBounds(230,150, 100, 30);
        raiz.setVisible(false);
        add(raiz);
        raiz.addActionListener(this);
        potencia = new JButton("potencia");
        potencia.setBounds(230,200,100,30);
        potencia.setVisible(false);
        add(potencia);
        potencia.addActionListener(this);
        

        boton2.addActionListener(this);
        setTitle("Sumar");

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String cad1 = textfield1.getText();
            String cad2 = textfield2.getText();
            int x1 = Integer.parseInt(cad1);
            int x2 = Integer.parseInt(cad2);
            int suma = x1 + x2;
            String total = String.valueOf(suma);
            textarea1.setText(total);
        }
        if (e.getSource() == boton2) {
            String cad11 = textfield1.getText();
            String cad22 = textfield2.getText();
            int x11 = Integer.parseInt(cad11);
            int x22 = Integer.parseInt(cad22);
            int resta = x11 - x22;
            String total1 = String.valueOf(resta);
            textarea1.setText(total1);
        }
        if (e.getSource() == multi){
            int x1 = Integer.parseInt(textfield1.getText());
            int x2 = Integer.parseInt(textfield2.getText());
            int mul=x1*x2;
            textarea1.setText(String.valueOf(mul));
        }
        if (e.getSource() == divi){
            double x1 = Double.parseDouble(textfield1.getText());
            double x2 = Double.parseDouble(textfield2.getText());
            double divi = x1/x2;
            textarea1.setText(""+divi);
        }
        if (e.getSource() == raiz){
            double x1 = Double.parseDouble(textfield1.getText());
            double x2 = Double.parseDouble(textfield2.getText());
            double raiz1 = Math.sqrt(x1);
            double raiz2 = Math.sqrt(x2);
            textarea1.setBounds(100, 90, 300, 20);
            textarea1.setText("num1 = " + raiz1 + " num2 = " + raiz2);
        }
        if (e.getSource() == potencia){
            int x1 = Integer.parseInt(textfield1.getText());
            int x2 = Integer.parseInt(textfield2.getText());
            int resul = 1;
            for (int i = 0; i < x2; i++){
                resul = resul * x1;
            }
            textarea1.setText(x1 + " a la " + x2 + " = " + resul);
        }
        if (e.getSource() == cientifica){
            potencia.setVisible(true);
            raiz.setVisible(true);
        }
        if (e.getSource() == normal){
            potencia.setVisible(false);
            raiz.setVisible(false);
        }
    }

    public static void main(String[] ar) {
        SumaDatos formulario1 = new SumaDatos();
        formulario1.setBounds(0, 0, 500, 500);
        formulario1.setVisible(true);
    }
}