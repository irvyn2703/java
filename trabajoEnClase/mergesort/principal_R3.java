import java.util.Scanner;

public class principal_R3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a[];
        int tam;
        F_mergesort funcion = new F_mergesort();
        System.out.print("Digite tamaño del arreglo: ");
        tam = entrada.nextInt();
        a = new double[tam];
        // pedir info
        for (int i = 0; i < tam; i++) {
            System.out.print(i + ". numero: ");
            a[i] = entrada.nextDouble();
        }
        funcion.mergesort(a, 0, a.length - 1);
        // mergesort(a,0,a.length-1)
        // mostrar
        for (int i = 0; i < tam; i++) {
            System.out.println(" " + a[i]);
        }
    }
}