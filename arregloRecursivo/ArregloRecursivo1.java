import java.io.*;

public class ArregloRecursivo1 {
    int suma=0;

    public ArregloRecursivo1() {
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

    public void imprimir2(int[] A, int i, int n) {
        if (n == 0) {
            System.out.println(A[i]);
        } else {
            System.out.println(A[i]);
            imprimir2(A, i + 1, n - 1);
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

    public int producto (int[] arreglo, int[] arreglo2,int n){
        
        if(n != 0){
            return arreglo[n] * arreglo2[n] + producto(arreglo, arreglo2,n-1);
        }  else {
            return arreglo[n] * arreglo2[n];
        }
    }
    
    public static void main(String[] args) throws IOException {

        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);
        String datoEntrada;

        int n, i, num;
        System.out.println("Ingresa el numero de elementos para el arreglo: ");
        try {
            datoEntrada = flujoEntrada.readLine();
            n = Integer.parseInt(datoEntrada);

            int[] lista = new int[n];
            int[] lista2 = new int[n];

            ArregloRecursivo1 sum = new ArregloRecursivo1();

            System.out.println("Ingresa los Valores: ");

            for (i = 0; i < n; i++) {
                datoEntrada = flujoEntrada.readLine();
                num = Integer.parseInt(datoEntrada);
                System.out.println("Dato insertado: " + num);
                lista[i] = num;
            }

            System.out.println("ingresar el segundo arreglo:");
            for (i = 0; i < n; i++) {
                datoEntrada = flujoEntrada.readLine();
                num = Integer.parseInt(datoEntrada);
                System.out.println("Dato insertado: " + num);
                lista2[i] = num;
            }
            System.out.println("El resultado de la sumatoria:" + sum.suma(lista, n - 1));
            System.out.println("Inverso del arreglo");
            sum.imprimir(lista, n - 1);
            System.out.println("Los numeros del arreglo");
            sum.imprimir2(lista, 0, n - 1);

            System.out.println("El menor:" + sum.minimo(lista, n - 1, lista[0]));
            System.out.println("El mayor:" + sum.mayor(lista, n - 1, lista[0]));

            System.out.println("el producto es: " + sum.producto(lista, lista2, lista.length-1));

        } catch (IOException error) {
            System.err.println("Error " + error.getMessage());
        }
    }

}