//  Fecha: 07 / Mayo / 2021
//  Objetivo: Calcular un exponente.
//  Elaboro Equipo 4:
//      1) Flores Navarro Emmanuel
//      2) Ramírez Morales Erick Brian

//Inicio de la clase
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
public class Exponente implements ActionListener {
    //Atributos
    private JTextField jf1;
    private JTextField jf2;
    private JTextArea jr;
    private JButton jb;
    private JLabel ja1;
    private JLabel ja2;
    private JLabel ja3;
    private JMenuBar jmb;
    private JMenu jm1;
    private JMenu jm2;
    private JMenuItem ji1;
    private JMenuItem ji2;
    private JMenuItem ji3;
    private JMenuItem ji4;
    private JMenuItem ji5;
    private String texto;
    private int cont = 0;
    //Arreglo
    private String historial[] = new String[100];
    
    //Método constructor
    public Exponente() {}
    
    //Metódo definido por el programador
    public void construirVentana() {
        //Variables de instancia
        JPanel jp = new JPanel();
        JFrame jf = new JFrame();
        
        //Barra de herramientas
        jmb = new JMenuBar();
        jmb.setBounds(0, 0, 110, 20);
        jf.add(jmb);
        //Herramienta 1
        jm1 = new JMenu("Historial");
        jmb.add(jm1);
        //Opcion 1
        ji1 = new JMenuItem("Ver");
        jm1.add(ji1);
        ji1.addActionListener(this);
        //Opcion 2
        ji2 = new JMenuItem("Borrar");
        jm1.add(ji2);
        ji2.addActionListener(this);
        jm1.addSeparator();
        //Opcion 3
        ji3 = new JMenuItem("Guardar");
        jm1.add(ji3);
        ji3.addActionListener(this);
        
        //Herramienta 2
        jm2 = new JMenu("Ayuda");
        jmb.add(jm2);
        //Opcion 1
        ji4 = new JMenuItem("Tutorial");
        jm2.add(ji4);
        ji4.addActionListener(this);
        jm2.addSeparator();
        //Opcion 2
        ji5 = new JMenuItem("Acerca de...");
        jm2.add(ji5);
        ji5.addActionListener(this);
        
        //Etiqueta 1
        ja1 = new JLabel("Ingrese la base:");
        ja1.setBounds(10,30,150,30);
        jf.add(ja1);
        //Etiqueta 2
        ja2 = new JLabel("Ingrese el exponente:");
        ja2.setBounds(10,70,150,30);
        jf.add(ja2);
        //Etiqueta 3
        ja3 = new JLabel("Resultado:");
        ja3.setBounds(10,110,150,30);
        jf.add(ja3);
        
        //Campo de texto 1
        jf1 = new JTextField();
        jf1.setBounds(160,30,160,30);
        jf.add(jf1);
        //Campo de texto 2
        jf2 = new JTextField();
        jf2.setBounds(160,70,160,30);
        jf.add(jf2);
        //Area de texto
        jr = new JTextArea();
        jr.setBounds(160,110,160,30);
        jf.add(jr);
        jr.setEditable(false);
        
        //Boton
        jb = new JButton("Resultado");
        jb.setBounds(120,160,100,30);
        jf.add(jb);
        //Presionar
        jb.addActionListener(this);
        
        //Ventana
        jp.setBounds(20,20,350,250);
        jp.setLayout(null);
        jf.setLayout(null);
        jf.setSize(350,250);
        jf.add(jp);
        jf.setVisible(true);
        jf.setTitle("EXPONENTE");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //Metódo definido por el programador
    @Override
    public void actionPerformed(ActionEvent ae) {
        //Atributos
        int x, y, r;
        
        //Iniciar excepcion
        try {
            //Validar boton presionado
            if(ae.getSource() == jb) {
                //Ingresar valores
                x = Integer.parseInt(jf1.getText());
                y = Integer.parseInt(jf2.getText());
                //Acceder a los métodos
                r = Pot(x,y);
                jr.setText(r+"");
                ingresarHistorial();
            }
            if(ae.getSource() == ji1) {
                //Ciclo
                texto = "Historial:";
                for(int i=0; i<cont; i++)
                    texto += "\n"+historial[i];
                //Mostrar ventana
                JOptionPane.showMessageDialog(null,texto);
            }
            if(ae.getSource() == ji2) {
                //Mostrar ventana
                JOptionPane.showMessageDialog(null,"Historial borrado");
                cont = 0;
            }
            if(ae.getSource() == ji3)
                guardarHistorial();
            if(ae.getSource() == ji4) {
                //Mostrar ventana
                JOptionPane.showMessageDialog(null,"Pasos a seguir:"
                +"\n1) Ingrese un valor en los primeros dos campos de texto."
                +"\n2) Presione el boton Resultado."
                +"\n\nNota:"
                +"\n  - Si no hay un valor numerico en los primeros dos campos de texto, el resultado sera un aviso de error.");
            }
            if(ae.getSource() == ji5) {
                //Acceder a un método
                JOptionPane.showMessageDialog(null,"Ejercicio 8 - Exponente:"
                    +"\n  - Equipo 4:"
                    +"\n    + Autor 1: Flores Navarro Emmanuel.......201929142"
                    +"\n    + Autor 2: Ramírez Morales Erick Brian...201955520"
                    +"\n  - Fecha: 07 / Mayo / 2021"
                    +"\n  - Derechos Reservados");
            }
        } catch(NumberFormatException nfe) {
            //Capturar e imprimir error
            jr.setText("Faltan valores numericos");
        } catch(Exception e) {
            //Capturar e imprimir error
            jr.setText("Error");
        }
    }
    
    //Metódo definido por el programador
    public static int Pot(int x, int n) {
        //Validar valor
        if(n==0)
            //Retorno
            return 1;
        else
            //Retorno
            return(x*Pot(x,n-1));
    }
    
    //Metódo definido por el programador
    public void ingresarHistorial() {
        historial[cont] = jf1.getText()+"^"+jf2.getText()+" = "+jr.getText();
        cont++;
    }
    
    //Metódo definido por el programador
    public void guardarHistorial() {
        //Variables de instancia
        FileWriter fw = null;
        PrintWriter pw = null;
        //Atributo
        texto = "";
        
        //Iniciar excepcion
        try {
            //Variables de instancia
            fw = new FileWriter("Exponente.txt");
            pw = new PrintWriter(fw);
            
            //Ciclo
            for(int i=0; i<cont; i++)
                texto += "\n    "+historial[i];
            
            //Guardar mensajes y resultado
            pw.println("\n  ========== EXPONENTE ==========");
            pw.println(texto);
            pw.println("\n  ===============================\n");
        } catch(Exception e1) {
            //Capturar e imprimir error
            JOptionPane.showMessageDialog(null,"ERROR..."+e1.getMessage()+"...","ERROR",JOptionPane.WARNING_MESSAGE);
        } finally {
            //Iniciar excepcion
            try {
                //Validar dato
                if (null != fw)
                    fw.close();
                //Mostrar ventana
                JOptionPane.showMessageDialog(null,"Historial guardado");
            } catch(Exception e2) {
                //Capturar e imprimir error
                JOptionPane.showMessageDialog(null,"ERROR..."+e2.getMessage()+"...","ERROR",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
//Fin de la clase