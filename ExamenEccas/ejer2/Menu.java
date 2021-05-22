// Irvyn Xicale Cabrera
import javax.swing.JOptionPane;
public class Menu {
    public static void main(String[] args){
         ArregloGrafico Menu = new ArregloGrafico();
             String datos;       
        do{
        datos = (JOptionPane.showInputDialog(null,"Selecciona la opcion deseada","Ejercicio 2", 
                JOptionPane.PLAIN_MESSAGE,null,new Object[] { "Selecciona","Leer el tamaño de un arreglo", "Ingrese los valores del vector ", 
                    "Sumar el arreglo ", "Imprimir el arreglo", "Obtener el mayor elemento", "Obtener el menor elemento",
                    "Guardar el archivo de texto","Salir" },"Selecciona")).toString();
              switch(datos){
                  case "Leer el tamaño de un arreglo":
                      Menu.LeerTamano();
                  break;
                  case "Ingrese los valores del vector ":
                      Menu.ElementosAregglo();
                  break;
                  case "Sumar el arreglo ":
                      Menu.ImprimirSuma();
                  break;    
                  case "Imprimir el arreglo":
                      Menu.ImprimirElementos();
                  break;
                  case "Obtener el mayor elemento":
                      Menu.ImprimirMayor();
                  break;
                  case  "Obtener el menor elemento":
                      Menu.ImprimirMenor();
                  break;
                  case "Guardar el archivo de texto":
                      Menu.Archivo();    
              }
       //    JOptionPane.showMessageDialog(null, "Tu animal favorito es:  "+datos, "Animales", JOptionPane.PLAIN_MESSAGE);
        } while (datos!="Salir");
}}
