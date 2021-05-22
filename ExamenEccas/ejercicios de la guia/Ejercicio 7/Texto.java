//  Fecha: 07 / Mayo / 2021
//  Objetivo: Contar letras, numeros, caracteres, vocales...de un archivo.
//  Elaboro Equipo 4:
//      1) Flores Navarro Emmanuel
//      2) Ramírez Morales Erick Brian

//Inicio de la clase
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
public class Texto {
    //Método constructor
    public Texto() {}
    
    //Metódo definido por el programador
    public void leerTexto(String s) {
        //Iniciar excepcion
        try {
            //Variable de instancia
            BufferedReader br = new BufferedReader(new FileReader(s));
            //Atributos
            String texto = "";
            String lectura;
            
            //Ciclo
            while((lectura = br.readLine()) != null)
                //Guardar texto
                texto += lectura;
            //Acceder a un método
            contarPalabra(texto);
        } catch(FileNotFoundException fnfe) {
            //Capturar y mostrar error
            JOptionPane.showMessageDialog(null,"Fichero no encontrado","ERROR",JOptionPane.WARNING_MESSAGE);
        } catch(Exception e) {
            //Capturar y mostrar error
            JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //Metódo definido por el programador
    public void contarPalabra(String t) {
        //Atributos
        int mayusCont = 0, minusCont = 0, vocCont = 0, puntCont = 0, inexCont = 0, operCont = 0, espCont = 0, numCont = 0, otroCont = 0;
        char mayuscula, minuscula, numero;
        
        //Ciclo
        for(int i=0; i<t.length(); i++) {
            //Asignar datos
            mayuscula = 'A';
            minuscula = 'a';
            numero = '0';
            
            //Ciclo
            for(int j=0; j<26; j++) {
                //Validar dato
                if(mayuscula == t.charAt(i))
                    mayusCont++;
                if(minuscula == t.charAt(i))
                    minusCont++;
                //Asignar valor
                mayuscula++;
                minuscula++;
            }
            //Ciclo
            for(int j=0; j<10; j++) {
                //Validar dato
                if(numero == t.charAt(i))
                    numCont++;
                //Asignar valor
                numero++;
            }
            if(t.charAt(i)=='A' || t.charAt(i)=='E' || t.charAt(i)=='I' || t.charAt(i)=='O' || t.charAt(i)=='U' || t.charAt(i)=='a' || t.charAt(i)=='e' || t.charAt(i)=='i' || t.charAt(i)=='o' || t.charAt(i)=='u')
                vocCont++;
            if(t.charAt(i)==',' || t.charAt(i)==';' || t.charAt(i)==':' || t.charAt(i)=='.')
                puntCont++;
            if(t.charAt(i)=='?' || t.charAt(i)=='!')
                inexCont++;
            if(t.charAt(i)=='+' || t.charAt(i)=='-' || t.charAt(i)=='/' || t.charAt(i)=='*' || t.charAt(i)=='(' || t.charAt(i)==')' || t.charAt(i)=='[' || t.charAt(i)==']' || t.charAt(i)=='{' || t.charAt(i)=='}')
                operCont++;
            if(t.charAt(i)==' ')
                espCont++;
            otroCont++;
        }
        //Mostrar ventana
        JOptionPane.showMessageDialog(null,"Texto: "+t
            +"\n\nContenido total = "+otroCont
            +"\nLetras mayusculas = "+mayusCont
            +"\nLetras minusculas = "+minusCont
            +"\nAbecedario = "+(mayusCont+minusCont)
            +"\nVocales = "+vocCont
            +"\nSignos de puntuacion = "+puntCont
            +"\nSignos de interrogacion y exclamacion = "+inexCont
            +"\nSignos de operacion = "+operCont
            +"\nEspacios = "+espCont
            +"\nNumeros = "+numCont
            +"\nOtros = "+(otroCont-mayusCont-minusCont-puntCont-inexCont-operCont-espCont-numCont),"TEXTO",JOptionPane.INFORMATION_MESSAGE);
    }
}
//Fin de la clase