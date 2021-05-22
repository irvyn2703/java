import java.util.Scanner;
import java.io.*;

public class principa_R0 {
    public static void main(String[] args) {
        int num=0;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);
        String datoEntrada;
        operacion funcion = new operacion();
        System.out.println("Programa que calcula la suma de lo primeros n numeros\nPor recursividad");
        System.out.print("Digite la cantidad de numeros a sumar: ");
        try{
            datoEntrada = flujoEntrada.readLine();
            num = Integer.parseInt(datoEntrada);
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        long Resultado = funcion.sumaNenteros(num);
        for (int i = 0; i < num; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.print("\nResultado: " + Resultado + "\n");
    }
}