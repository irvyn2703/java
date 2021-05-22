//  Fecha: 07 / Mayo / 2021
//  Objetivo: Crear una matriz y realizar algunos ejercicios.
//  Elaboro Equipo 4:
//      1) Flores Navarro Emmanuel
//      2) Ramírez Morales Erick Brian

//Inicio de la clase
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
public class Matriz implements ActionListener {
    //Variables de instancia
    private JButton jb1;
    private JButton jb2;
    private JButton jb3;
    private JButton jb4;
    private JButton jb5;
    private JButton jb6;
    private JButton jb7;
    private JLabel ja1;
    private JMenuBar jb;
    private JMenu jm1;
    private JMenu jm2;
    private JMenuItem ji1;
    private JMenuItem ji2;
    private JMenuItem ji3;
    private JMenuItem ji4;
    //Atributos
    private int opc = 0;
    private int fc = 0;
    //Matrices
    private int matriz1[][] = new int[100][100];
    private int matriz2[][] = new int[100][100];
    private int ver1[][] = new int[100][100];
    private int ver2[][] = new int[100][100];
    private int ver[][] = new int[100][100];
    
    //Método constructor
    public Matriz() {}
    
    //Metódo definido por el programador
    public void crearMatriz() {
        //Atributo
        String panel;
        int salir;
        
        //Ciclo
        do {
            //Ingresar un dato
            panel = JOptionPane.showInputDialog(null,"Ingrese el numero de filas y columnas de las matrices:","MATRIZ",JOptionPane.QUESTION_MESSAGE);
            
            //Iniciar excepcion
            try {
                //Asignar valores
                fc = Integer.parseInt(panel);
                salir = 1;
                
                if(fc <= 0)
                    //Lanzar error
                    throw new NegativeNumberException();
            } catch(NumberFormatException nfe) {
                //Capturar y mostrar error
                JOptionPane.showMessageDialog(null,"ERROR..."+nfe.getMessage()
                    +"\nNo leiste dato numerico.","ERROR",JOptionPane.WARNING_MESSAGE);
                salir = 0;
            } catch(NegativeNumberException nne) {
                //Capturar y mostrar error
                JOptionPane.showMessageDialog(null,"ERROR..."+nne.getMessage()
                    +"\nEl numero de filas y columnas debe ser mayor que cero.","ERROR",JOptionPane.WARNING_MESSAGE);
                salir = 0;
            }
        } while(salir != 1);
        
        //Ciclo
        for(int i=0; i<fc; i++) 
            for(int j=0; j<fc; j++) {
                //Ciclo
                do {
                    //Iniciar excepcion
                    try {
                        //Ingresar un dato
                        panel = JOptionPane.showInputDialog(null,"Ingrese un valor para Elemento["+(i+1)+"]["+(j+1)+"]:","MATRIZ 1",JOptionPane.QUESTION_MESSAGE);
                        matriz1[i][j] = Integer.parseInt(panel);
                        ver1[i][j] = Integer.parseInt(panel);
                        salir = 1;
                    } catch(NumberFormatException nfe) {
                        //Capturar y mostrar error
                        JOptionPane.showMessageDialog(null,"ERROR..."+nfe.getMessage()
                            +"\nNo leiste dato numerico.","ERROR",JOptionPane.WARNING_MESSAGE);
                        salir = 0;
                    }
                } while(salir != 1);
            }
        
        //Ciclo
        for(int i=0; i<fc; i++) 
            for(int j=0; j<fc; j++) {
                //Ciclo
                do {
                    //Iniciar excepcion
                    try {
                        //Ingresar un dato
                        panel = JOptionPane.showInputDialog(null,"Ingrese un valor para Elemento["+(i+1)+"]["+(j+1)+"]:","MATRIZ 2",JOptionPane.QUESTION_MESSAGE);
                        matriz2[i][j] = Integer.parseInt(panel);
                        ver2[i][j] = Integer.parseInt(panel);
                        salir = 1;
                    } catch(NumberFormatException nfe) {
                        //Capturar y mostrar error
                        JOptionPane.showMessageDialog(null,"ERROR..."+nfe.getMessage()
                            +"\nNo leiste dato numerico.","ERROR",JOptionPane.WARNING_MESSAGE);
                        salir = 0;
                    }
                } while(salir != 1);
            }
        //Acceder a un método
        construirVentana();
    }
    
    //Metódo definido por el programador
    public void construirVentana() {
        //Variables de instancia
        JPanel jp = new JPanel();
        JFrame jf = new JFrame();
        
        //Barra de herramientas
        jb = new JMenuBar();
        jb.setBounds(0,0,100,20);
        jf.add(jb);
        //Herramienta 1
        jm1 = new JMenu("Matriz");
        jb.add(jm1);
        //Opcion 1
        ji1 = new JMenuItem("Ver");
        jm1.add(ji1);
        ji1.addActionListener(this);
        jm1.addSeparator();
        //Opcion 2
        ji2 = new JMenuItem("Guardar");
        jm1.add(ji2);
        ji2.addActionListener(this);
        
        //Herramienta 2
        jm2 = new JMenu("Ayuda");
        jb.add(jm2);
        //Opcion 1
        ji3 = new JMenuItem("Tutorial");
        jm2.add(ji3);
        ji3.addActionListener(this);
        jm2.addSeparator();
        //Opcion 2
        ji4 = new JMenuItem("Acerca de...");
        jm2.add(ji4);
        ji4.addActionListener(this);
        
        //Etiqueta 1
        ja1 = new JLabel("Ingrese el numero de la opcion a ejecutar:");
        ja1.setBounds(20,30,240,30);
        jf.add(ja1);
        
        //Boton 1
        jb1 = new JButton("Matrices originales");
        jb1.setBounds(20,70,240,30);
        jf.add(jb1);
        //Presionar
        jb1.addActionListener(this);
        
        //Boton 2
        jb2 = new JButton("Sumar");
        jb2.setBounds(20,110,240,30);
        jf.add(jb2);
        //Presionar
        jb2.addActionListener(this);
        
        //Boton 3
        jb3 = new JButton("Restar");
        jb3.setBounds(20,150,240,30);
        jf.add(jb3);
        //Presionar
        jb3.addActionListener(this);
        
        //Boton 4
        jb4 = new JButton("Multiplicar");
        jb4.setBounds(20,190,240,30);
        jf.add(jb4);
        //Presionar
        jb4.addActionListener(this);
        
        //Boton 5
        jb5 = new JButton("Transpuesta");
        jb5.setBounds(20,230,240,30);
        jf.add(jb5);
        //Presionar
        jb5.addActionListener(this);
        
        //Boton 6
        jb6 = new JButton("Triangular superior");
        jb6.setBounds(20,270,240,30);
        jf.add(jb6);
        //Presionar
        jb6.addActionListener(this);
        
        //Boton 7
        jb7 = new JButton("Triangular inferior");
        jb7.setBounds(20,310,240,30);
        jf.add(jb7);
        //Presionar
        jb7.addActionListener(this);
        
        //Ventana
        jp.setBounds(0,0,300,400);
        jp.setLayout(null);
        jf.setLayout(null);
        jf.setSize(300,400);
        jf.add(jp);
        jf.setVisible(true);
        jf.setTitle("MATRIZ");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //Metódo definido por el programador
    @Override
    public void actionPerformed(ActionEvent ae) {
        //Validar boton presionado
        if(ae.getSource() == jb1)
            //Acceder a un método
            mostrarMatriz();
        if(ae.getSource() == jb2)
            //Acceder a un método
            sumarMatriz();
        if(ae.getSource() == jb3)
            //Acceder a un método
            restarMatriz();
        if(ae.getSource() == jb4)
            //Acceder a un método
            multiplicarMatriz();
        if(ae.getSource() == jb5)
            //Acceder a un método
            voltearMatriz();
        if(ae.getSource() == jb6)
            //Acceder a un método
            superiorMatriz();
        if(ae.getSource() == jb7)
            //Acceder a un método
            inferiorMatriz();
        if(ae.getSource() == ji1)
            //Acceder a un método
            verMatriz();
        if(ae.getSource() == ji2)
            //Acceder a un método
            guardarMatriz();
        if(ae.getSource() == ji3)
            //Mostrar ventana
            JOptionPane.showMessageDialog(null,"Pasos a seguir:"
                +"\n1) Lea cada una de las opciones en pantalla."
                +"\n2) Presione el botón a ejecutar."
                +"\n\nNota:"
                +"\n  - La herramienta Matriz mostrara y/o guardara la ultima matriz modificada.");
        if(ae.getSource() == ji4)
            //Acceder a un método
            JOptionPane.showMessageDialog(null,"Ejercicio 6 - Matriz:"
                +"\n  - Equipo 4:"
                +"\n    + Autor 1: Flores Navarro Emmanuel.......201929142"
                +"\n    + Autor 2: Ramírez Morales Erick Brian...201955520"
                +"\n  - Fecha: 07 / Mayo / 2021"
                +"\n  - Derechos Reservados");
    }
    
    //Metódo definido por el programador
    public void verMatriz() {
        //Atributo
        String texto = "";
        
        if(opc == 0) {
            //Ciclo
            texto += "MATRIZ 1:\n";
            for(int i=0; i<fc; i++) {
                texto += "|";
                for(int j=0; j<fc; j++) {
                    texto += " "+ver1[i][j]+" |";
                }
                texto += "\n";
            }
            //Ciclo
            texto += "\n\nMATRIZ 2:\n";
            for(int i=0; i<fc; i++) {
                texto += "|";
                for(int j=0; j<fc; j++) {
                    texto += " "+ver2[i][j]+" |";
                }
                texto += "\n";
            }
        } else {
            //Ciclo
            texto += "MATRIZ:\n";
            for(int i=0; i<fc; i++) {
                texto += "|";
                for(int j=0; j<fc; j++) {
                    texto += " "+ver[i][j]+" |";
                }
                texto += "\n";
            }
        }
        
        //Mostrar ventana
        JOptionPane.showMessageDialog(null,texto,"MATRIZ",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Metódo definido por el programador
    public void mostrarMatriz() {
        //Atributos
        String texto = "";
        opc = 0;
        
        //Ciclo
        texto += "MATRIZ 1:\n";
        for(int i=0; i<fc; i++) {
            texto += "|";
            for(int j=0; j<fc; j++) {
                texto += " "+matriz1[i][j]+" |";
                ver1[i][j] = matriz1[i][j];
            }
            texto += "\n";
        }
        //Ciclo
        texto += "\n\nMATRIZ 2:\n";
        for(int i=0; i<fc; i++) {
            texto += "|";
            for(int j=0; j<fc; j++) {
                texto += " "+matriz2[i][j]+" |";
                ver2[i][j] = matriz2[i][j];
            }
            texto += "\n";
        }
        //Mostrar ventana
        JOptionPane.showMessageDialog(null,texto,"MATRIZ",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Metódo definido por el programador
    public void sumarMatriz() {
        //Atributos
        String texto = "";
        opc = 1;
        
        //Ciclo
        texto += "SUMA:\n";
        for(int i=0; i<fc; i++) {
            texto += "|";
            for(int j=0; j<fc; j++) {
                //Sumar valores
                ver[i][j] = matriz1[i][j] + matriz2[i][j];
                texto += " "+ver[i][j]+" |";
            }
            texto += "\n";
        }
        //Mostrar ventana
        JOptionPane.showMessageDialog(null,texto,"MATRIZ",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Metódo definido por el programador
    public void restarMatriz() {
        //Atributos
        String texto = "";
        opc = 1;
        
        //Ciclo
        texto += "RESTA:\n";
        for(int i=0; i<fc; i++) {
            texto += "|";
            for(int j=0; j<fc; j++) {
                //Sumar valores
                ver[i][j] = matriz1[i][j] - matriz2[i][j];
                texto += " "+ver[i][j]+" |";
            }
            texto += "\n";
        }
        //Mostrar ventana
        JOptionPane.showMessageDialog(null,texto,"MATRIZ",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Metódo definido por el programador
    public void multiplicarMatriz() {
        //Arreglos
        int fila[] = new int[fc*fc];
        int columna[] = new int[fc*fc];
        //Atributos
        int e1,e2,k,y,z,mul;
        String texto = "";
        opc = 1;
        
        //Ciclo
        k = 0;
        for(int j=0; j<fc; j++) {
            for(int i=0; i<fc; i++) {
                //Asignar valores
                fila[k] = matriz2[i][j];
                k++;
            }
        }
        //Ciclo
        k = 0;
        for(int i=0; i<fc; i++) {
            for(int j=0; j<fc; j++) {
                //Asignar valores
                columna[k] = matriz1[i][j];
                k++;
            }       
        }
        
        //Asignar valores
        e1 = 0;
        z = 0;
        for(int x=0; x<fc; x++) {
            //Asignar valores
            y = 0;
            e2 = 0;
            for(int i=0; i<fc; i++) {
                //Asignar valor
                mul = 0;
                for(int j=0; j<fc; j++) {
                    mul = mul + (fila[j+z]*columna[j+y]);
                }
                //Asignar valores
                y = y+fc;
                ver[e1][e2] = mul;
                e2++;
            }
            //Asignar valores
            z = z+fc;
            e1++;
        }
        
        //Ciclo
        texto += "MULTIPLICACION:\n";
        for(int i=0; i<fc; i++) {
            texto += "|";
            for(int j=0; j<fc; j++) {
                //Asignar valor
                texto += " "+ver[j][i]+" |";
            }
            texto += "\n";
        }
        //Mostrar ventana
        JOptionPane.showMessageDialog(null,texto,"MATRIZ",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Metódo definido por el programador
    public void voltearMatriz() {
        //Atributos
        String texto = "";
        opc = 0;
        
        //Ciclo
        texto += "MATRIZ 1:\n";
        for(int i=0; i<fc; i++) {
            texto += "|";
            for(int j=0; j<fc; j++) {
                texto += " "+matriz1[j][i]+" |";
                ver1[j][i] = matriz1[j][i];
            }
            texto += "\n";
        }
        //Ciclo
        texto += "\n\nMATRIZ 2:\n";
        for(int i=0; i<fc; i++) {
            texto += "|";
            for(int j=0; j<fc; j++) {
                texto += " "+matriz2[j][i]+" |";
                ver2[j][i] = matriz2[j][i];
            }
            texto += "\n";
        }
        //Mostrar ventana
        JOptionPane.showMessageDialog(null,texto,"MATRIZ",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Metódo definido por el programador
    public void superiorMatriz() {
        //Atributos
        int t1 = 0, t2 = 0;
        
        //Ciclo
        for(int i=1; i<fc; i++) {
            for(int j=0; j<i; j++) {
                //Validar valor
                if(matriz1[i][j] != 0) {
                    t1++;
                }
            }
        }
        //Ciclo
        for(int i=1; i<fc; i++) {
            for(int j=0; j<i; j++) {
                //Validar valor
                if(matriz2[i][j] != 0) {
                    t2++;
                }
            }
        }
        //Validar valores
        if(t1 == 0 && t2 == 0)
            //Mostrar ventana
            JOptionPane.showMessageDialog(null,"MATRIZ 1 es triangular superior."
                +"\nMATRIZ 2 es triangular superior.","MATRIZ",JOptionPane.INFORMATION_MESSAGE);
        if(t1 > 0 && t2 == 0)
            //Mostrar ventana
            JOptionPane.showMessageDialog(null,"MATRIZ 1 no es triangular superior."
                +"\nMATRIZ 2 es triangular superior.","MATRIZ",JOptionPane.INFORMATION_MESSAGE);
        if(t1 == 0 && t2 > 0)
            //Mostrar ventana
            JOptionPane.showMessageDialog(null,"MATRIZ 1 es triangular superior."
                +"\nMATRIZ 2 no es triangular superior.","MATRIZ",JOptionPane.INFORMATION_MESSAGE);
        if(t1 > 0 && t2 > 0)
            //Mostrar ventana
            JOptionPane.showMessageDialog(null,"MATRIZ 1 no es triangular superior."
                +"\nMATRIZ 2 no es triangular superior.","MATRIZ",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Metódo definido por el programador
    public void inferiorMatriz() {
        //Atributos
        int t1 = 0, t2 = 0;
        
        //Ciclo
        for(int i=0; i<fc; i++) {
            for(int j=i+1; j<fc; j++) {
                //Validar valor
                if(matriz1[i][j] != 0) {
                    t1++;
                }
            }
        }
        //Ciclo
        for(int i=0; i<fc; i++) {
            for(int j=i+1; j<fc; j++) {
                //Validar valor
                if(matriz2[i][j] != 0) {
                    t1++;
                }
            }
        }
        //Validar valores
        if(t1 == 0 && t2 == 0)
            //Mostrar ventana
            JOptionPane.showMessageDialog(null,"MATRIZ 1 es triangular inferior."
                +"\nMATRIZ 2 es triangular inferior.","MATRIZ",JOptionPane.INFORMATION_MESSAGE);
        if(t1 > 0 && t2 == 0)
            //Mostrar ventana
            JOptionPane.showMessageDialog(null,"MATRIZ 1 no es triangular inferior."
                +"\nMATRIZ 2 es triangular inferior.","MATRIZ",JOptionPane.INFORMATION_MESSAGE);
        if(t1 == 0 && t2 > 0)
            //Mostrar ventana
            JOptionPane.showMessageDialog(null,"MATRIZ 1 es triangular inferior."
                +"\nMATRIZ 2 no es triangular inferior.","MATRIZ",JOptionPane.INFORMATION_MESSAGE);
        if(t1 > 0 && t2 > 0)
            //Mostrar ventana
            JOptionPane.showMessageDialog(null,"MATRIZ 1 no es triangular inferior."
                +"\nMATRIZ 2 no es triangular inferior.","MATRIZ",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Metódo definido por el programador
    public void guardarMatriz() {
        //Variables de instancia
        FileWriter fw = null;
        PrintWriter pw = null;
        //Atributo
        String texto = "";
        
        if(opc == 0) {
            //Ciclo
            texto += "MATRIZ 1:\n";
            for(int i=0; i<fc; i++) {
                texto += "|";
                for(int j=0; j<fc; j++) {
                    texto += " "+ver1[i][j]+" |";
                }
                texto += "\n";
            }
            //Ciclo
            texto += "\n\nMATRIZ 2:\n";
            for(int i=0; i<fc; i++) {
                texto += "|";
                for(int j=0; j<fc; j++) {
                    texto += " "+ver2[i][j]+" |";
                }
                texto += "\n";
            }
        } else {
            //Ciclo
            texto += "MATRIZ:\n";
            for(int i=0; i<fc; i++) {
                texto += "|";
                for(int j=0; j<fc; j++) {
                    texto += " "+ver[i][j]+" |";
                }
                texto += "\n";
            }
        }
        
        //Iniciar excepcion
        try {
            //Variables de instancia
            fw = new FileWriter("Matriz.txt");
            pw = new PrintWriter(fw);
            
            //Guardar mensajes y resultado
            pw.println("\n=============== MATRIZ ===============\n");
            pw.println(texto);
            pw.println("\n======================================\n");
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
                JOptionPane.showMessageDialog(null,"Matriz guardada","MATRIZ",JOptionPane.INFORMATION_MESSAGE);
            } catch(Exception e2) {
                //Capturar e imprimir error
                JOptionPane.showMessageDialog(null,"ERROR..."+e2.getMessage()+"...","ERROR",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
//Fin de la clase