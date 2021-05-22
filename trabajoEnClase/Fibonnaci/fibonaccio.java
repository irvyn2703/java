import java.io.*;
import java.lang.*;
import java.util.*;

class fibonacci {
    int value_of(int n) {
        if (n < 0)
            return 1;
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return (value_of(n - 1) + value_of(n - 2));
    }

    public static void main(String args[]) throws IOException
    // nombre del objeto//
    {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int cont, n, a;
        a = 0;
        System.out.println("\n\n");
        System.out.println("Este programa es la serie Fibonnaci");
        a = Integer.parseInt(leer.readLine());
        cont = a;
        fibonacci f = new fibonacci();
        for (a = 0; a <= cont; a++) {
            System.out.println("El numero de Fibonnaci para " + a + " es " + f.value_of(a));
        }
    }
} // fin main
