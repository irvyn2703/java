import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class SumaDatos extends JFrame implements ActionListener {
    private JTextField textfield1, textfield2;
    private JTextArea textarea1;
    private JButton boton1, boton2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    // menu
    private JMenuBar menu;
    private JMenu historial,tipo,ayuda;
    private JMenuItem verHistorial,borrarHistorial,guardarHistorial,cientifica,normal,tutorial,acercaDe;

    public SumaDatos() {
        setLayout(null);

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
        normal = new JMenuItem("normal");
        tipo.add(normal);
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
    }

    public static void main(String[] ar) {
        SumaDatos formulario1 = new SumaDatos();
        formulario1.setBounds(0, 0, 500, 500);
        formulario1.setVisible(true);
    }
}