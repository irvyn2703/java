//  Fecha: 07 / Mayo / 2021
//  Objetivo: Copiar un archivo en otro.
//  Elaboro Equipo 4:
//      1) Flores Navarro Emmanuel
//      2) Ramírez Morales Erick Brian

//Inicio de la clase
import javax.swing.JOptionPane;
import java.io.*;
public class Archivo {
    //Método constructor
    public Archivo() {}
    
    //Metódo definido por el programador
    public void copiarArchivo() {
        //Variables de instancia
        InputStream is = null;
        OutputStream os = null;
        //Atributos
        String nombre1, nombre2;
        int c;
        
        //Iniciar excepcion
        try {
            //Mostrar ventana
            nombre1 = JOptionPane.showInputDialog(null,"Ingrese el nombre del archivo a copiar:","ARCHIVO",JOptionPane.QUESTION_MESSAGE);
            nombre1 += ".txt";
            //Variable de instancia
            is = new FileInputStream(nombre1);
            
            //Mostrar ventana
            nombre2 = JOptionPane.showInputDialog(null,"Ingrese el nombre del nuevo archivo:","ARCHIVO",JOptionPane.QUESTION_MESSAGE);
            nombre2 += ".txt";
            //Variable de instancia
            os = new FileOutputStream(nombre2);
            
            //Mostrar ventana
            JOptionPane.showMessageDialog(null,"Archivo copiado y guardado");
            
            //Ciclo
            while((c = is.read()) != -1) {
                os.write(c);
            }
        } catch(FileNotFoundException fnfe) {
            //Capturar y mostrar error
            JOptionPane.showMessageDialog(null,"Archivo no encontrado","ERROR",JOptionPane.WARNING_MESSAGE);
        } catch(IOException ioe) {
            //Capturar y mostrar error
            JOptionPane.showMessageDialog(null,"Error de E/S","ERROR",JOptionPane.WARNING_MESSAGE);
        }
        
        //Validar dato
        if(is != null)
            //Iniciar excepcion
            try {
                //Acceder a un método
                is.close();
            } catch(IOException ioe) {}
        if(os != null)
            //Iniciar excepcion
            try {
                //Acceder a un método
                os.close();
            } catch(IOException ioe) {}
    }
}
//Fin de la clase