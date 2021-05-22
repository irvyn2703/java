import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class Grafico extends JFrame implements ActionListener {
    private JLabel eti1;
    private JLabel eti2;
    private JTextField numeroEntero;
    private JTextField numeroBinario;
    private JButton convertir;
    private JButton guardar;
    private JButton salir;

    Binario binario = new Binario();

    public Grafico() {
        this.setLayout(null);

        eti1 = new JLabel("Numero decimales:");
        eti1.setBounds(20, 20, 175, 20);

        numeroEntero = new JTextField();
        numeroEntero.setColumns(20);
        numeroEntero.setBounds(200, 20, 50, 20);

        eti2 = new JLabel("binario:");
        eti2.setBounds(20, 50, 70, 20);

        numeroBinario = new JTextField("numero en binario", 0);
        numeroBinario.setEditable(false);
        numeroBinario.setColumns(20);
        numeroBinario.setBounds(70, 50, 250, 20);

        convertir = new JButton("Convertir");
        convertir.setBounds(20, 100, 175, 20);

        guardar = new JButton("Guardar");
        guardar.setBounds(20, 125, 175, 20);

        salir = new JButton("salir");
        salir.setBounds(20, 150, 175, 20);

        this.add(eti1);
        this.add(numeroEntero);
        this.add(eti2);
        this.add(numeroBinario);
        this.add(convertir);
        this.add(guardar);
        this.add(salir);

        convertir.addActionListener(this);
        guardar.addActionListener(this);
        salir.addActionListener(this);

        this.setTitle("conversion de numeros");
        this.setSize(600, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        int datoEntero = 0;
        boolean negativo = false;
        if (e.getSource() == convertir) {
            try {
                datoEntero = Integer.parseInt(numeroEntero.getText());
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "El capo esta vacio o tiene un valor incorrecto", "Error",JOptionPane.ERROR_MESSAGE);
            }
            if (datoEntero < 0) {
                datoEntero = datoEntero * -1;
                negativo = true;
            }

            // conversion
            String resul = binario.convertir(datoEntero);
            numeroBinario.setText(resul);
        }
        if (e.getSource() == salir) {
            JOptionPane.showMessageDialog(null, "\t 201963582 Irvyn Xicale Cabrera");
            System.exit(0);
            ;
        }
        if (e.getSource() == guardar) {
            try {
                FileWriter Registro = new FileWriter("resultado.txt", true);
                Registro.write(numeroEntero.getText() + " = " + numeroBinario.getText() + "\n");
                Registro.close();
            } catch (IOException er) {
                JOptionPane.showMessageDialog(null, "no se pudo guardar el archivo \n" + er.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
