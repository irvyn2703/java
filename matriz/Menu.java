import java.io.*;
import java.util.ArrayList;

public class Menu {
    
    // Definicion de objetos para entrada de datos por el teclado
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);

    // Variable para tomar los datos leidos del flujo de entrada
    String datoEntrada;

    // Variables
    ArrayList<String> obreros = new ArrayList<String>();
    int produccion[][] = new int[2][6];
    int ren, col, totProd, toTotProd;

    System.out.println("\nPROCESA PRODUCCION DE OBREROS\n");

    try
    {
        // Leer datos
        System.out.println("-------------- Entrada de datos --------------");
        for (ren = 0; ren <= 1; ren++) {
            System.out.print("Teclee obreros[" + ren + "]: ");
            datoEntrada = flujoEntrada.readLine();
            obreros[ren] = datoEntrada;
            for (col = 0; col <= 5; col++) {
                System.out.print("Teclee produccion[" + ren + "," + col + "]: ");
                datoEntrada = flujoEntrada.readLine();
                produccion[ren][col] = Integer.parseInt(datoEntrada);
            }
        }

        // Imprimir salida
        System.out.println("               REPORTE SEMESTRAL DE PRODUCCION");
        System.out.print("NOMBRE DEL OBRERO        MES1 MES2 ");
        System.out.println("MES3 MES4 MES5 MES6 TOT.PRODUCCION");
        System.out.print("-----------------------------------");
        System.out.println("----------------------------------");
        toTotProd = 0;
        for (ren = 0; ren <= 1; ren++) {
            System.out.print(obreros[ren] + "   ");
            totProd = 0;
            for (col = 0; col <= 5; col++) {
                System.out.print(produccion[ren][col] + " ");
                totProd = totProd + produccion[ren][col];
            }
            System.out.println(totProd);
            toTotProd = toTotProd + totProd;
        }
        System.out.println("--------------------------------------------");
        System.out.println("Total                     " + toTotProd);
    }catch(
    IOException error)
    {
        System.err.println("Error " + error.getMessage());
    }
}
