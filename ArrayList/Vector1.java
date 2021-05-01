/**
 * @(#)Vector.java
 *
 *
 * @author
 * @version 1.00 2017/10/24
 */

import java.util.*;
import java. io.*;

public class Vector1 {
   public static void main(String[] args) {
        Vector v=new Vector();
        v.addElement("uno");
        v.addElement("dos");
        v.addElement("cuatro");
        v.addElement("cinco");
        v.addElement("seis");
        v.addElement("siete");
        v.addElement("ocho");
        v.addElement("nueve");
        v.addElement("diez");
        v.addElement("once");
        v.addElement("doce");
        v.insertElementAt("tres", 2);
        System.out.println("n� de elementos "+v.size());
        System.out.println("dimensi�n "+v.capacity());

        Enumeration enum1=v.elements();
        while(enum1.hasMoreElements()){
            System.out.print(enum1.nextElement()+"\t");
        }
        System.out.println();
        if(v.contains("tres")){
            System.out.println("Encontrado tres");
        }
        v.removeElement("tres");
        for(int i=0; i<v.size(); i++){
            System.out.print(v.elementAt(i)+"\t");
        }
        System.out.println();

        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
     }
}