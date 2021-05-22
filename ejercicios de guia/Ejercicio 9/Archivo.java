//  Fecha: 07 / Mayo / 2021
//  Objetivo: Mostrar la extension de un archivo.
//  Elaboro Equipo 4:
//      1) Flores Navarro Emmanuel
//      2) Ramírez Morales Erick Brian

//Inicio de la clase
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.io.*;
public class Archivo {
    //Método constructor
    public Archivo() {}
    
    //Metódo definido por el programador
    public void leerArchivo() {
        //Variables de instancia
        File f = new File("Archivo.txt");
        Date d = new Date(f.lastModified());
        Calendar c = new GregorianCalendar();
        
        //Acceder a un método
        c.setTime(d);
        //Mostrar ventana
        JOptionPane.showMessageDialog(null,"Nombre: "+f.getName()
            +"\nFecha: "+Integer.toString(c.get(Calendar.DATE))+"/"
                        +Integer.toString(c.get(Calendar.MONTH))+"/"
                        +Integer.toString(c.get(Calendar.YEAR))+" - "
                        +Integer.toString(c.get(Calendar.HOUR_OF_DAY))+":"
                        +Integer.toString(c.get(Calendar.MINUTE))
            +"\nLongitud: "+f.length()
            +"\nRuta: "+f.getAbsolutePath(),"ARCHIVO",JOptionPane.INFORMATION_MESSAGE);
    }
}
//Fin de la clase