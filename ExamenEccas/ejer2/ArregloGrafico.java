
// Irvyn Xicale Cabrera
import java.io.*;
import javax.swing.JOptionPane;

public class ArregloGrafico {

   InputStreamReader entrada = new InputStreamReader(System.in);
   BufferedReader flujoEntrada = new BufferedReader(entrada);
   String datoEntrada;
   String nString;
   int i, num, n;
   int lista[];
   int suma = 0;

   public ArregloGrafico() {
   }

   public int suma(int[] A, int n) {
      if (n == 0) {
         return A[n];
      } else {
         return A[n] + suma(A, n - 1);
      }
   }

   public void imprimir(int[] A, int n) {
      if (n == 0) {
         System.out.println(A[n]);
      } else {
         System.out.println(A[n]);
         imprimir(A, n - 1);
      }
   }

   public String imprimir2(int[] A, int i, int n) {
      String cadena = "";
      if (n == 0) {
         cadena = cadena + " " + Integer.toString(A[i]);
         System.out.println(A[i]);
         return cadena;
      } else {
         System.out.println(A[i]);
         cadena = cadena + " " + Integer.toString(A[i]);
         return cadena + imprimir2(A, i + 1, n - 1);
      }
   }

   public int minimo(int[] A, int n, int min) {
      if (n == 0)
         return min;
      else {
         if (A[n] < min) {

            min = minimo(A, n - 1, A[n]);
         } else
            min = minimo(A, n - 1, min);
      }
      return min;
   }

   public int mayor(int[] A, int n, int max) {
      if (n == 0) {
         return max;
      } else {

         if (A[n] > max) {
            max = mayor(A, n - 1, A[n]);
         } else
            max = mayor(A, n - 1, max);
      }
      return max;
   }

   public void LeerTamano() {
      nString = (JOptionPane.showInputDialog(null, "Ingresa el numero de elementos para el arreglo: ",
            JOptionPane.PLAIN_MESSAGE));
      n = Integer.parseInt(nString);

      lista = new int[n];
      ArregloGrafico sum = new ArregloGrafico();
   }

   public void ElementosAregglo() {
      System.out.println("Ingresa los Valores arreglo A: ");
      for (i = 0; i < n; i++) {
         datoEntrada = JOptionPane.showInputDialog(null, "Ingresa el elemento " + (i + 1) + ":",
               JOptionPane.PLAIN_MESSAGE);
         num = Integer.parseInt(datoEntrada);
         System.out.println("Dato insertado: " + num);
         lista[i] = num;

      }
   }

   public void ImprimirSuma() {
      ArregloGrafico sum = new ArregloGrafico();
      JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + sum.suma(lista, n - 1), "Resultado",
            JOptionPane.PLAIN_MESSAGE);
   }

   public void ImprimirMayor() {
      ArregloGrafico sum = new ArregloGrafico();
      JOptionPane.showMessageDialog(null, "\nEl numero mayor es: " + sum.mayor(lista, n - 1, lista[0]), "Resultado",
            JOptionPane.PLAIN_MESSAGE);
   }

   public void ImprimirMenor() {
      ArregloGrafico sum = new ArregloGrafico();
      JOptionPane.showMessageDialog(null, "El numero menor es: " + sum.minimo(lista, n - 1, lista[0]), "Resultado",
            JOptionPane.PLAIN_MESSAGE);
   }

   public void ImprimirElementos() {
      ArregloGrafico sum = new ArregloGrafico();
      JOptionPane.showMessageDialog(null, "Los numeros del arreglos son: " + sum.imprimir2(lista, 0, n - 1),
            "Resultado", JOptionPane.PLAIN_MESSAGE);
   }

   public void Archivo() {
      ArregloGrafico sum = new ArregloGrafico();
      try {
         FileWriter Registro = new FileWriter("Arreglo.txt");
         Registro.write("SUMA DEL ARREGLO: " + sum.suma(lista, n - 1) + "\nELEMENTO MINIMO: "
               + sum.minimo(lista, n - 1, lista[0]) + "\nELEMENTO MAXIMO: " + sum.mayor(lista, n - 1, lista[0])
               + "\nELEMENTOS DEL ARREGLO: " + sum.imprimir2(lista, 0, n - 1));
         Registro.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}