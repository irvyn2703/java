import java.io.*;

public class Menu {
    // lectura
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;

    // vaiables
    int op;
    String obreros[] = new String[3];
    // int produccion[][] = new int[3][6];
    int i = 0, num, ren, fila, col, totProd, toTotProd;
    Obrero objetoObrero = new Obrero();

    public void menu() {
        do {
            System.out.println("\tMenu\n1.-Ingresar obreros\n2.-Imprimir obreros\n3.-Salir");
            try {
                datoEntrada = flujoEntrada.readLine();
                op = Integer.parseInt(datoEntrada);
                switch (op) {
                case 1:
                    System.out.println("-------------- Entrada de datos --------------");
                    System.out.print("Cuantos empleados desea registar: ");
                    datoEntrada = flujoEntrada.readLine();
                    num = Integer.parseInt(datoEntrada);
                    Obrero obreros1[] = new Obrero[num];
                    do {
                        obreros1[i] = objetoObrero.lecturaDatos();
                        i++;
                    } while (i != num);

                    int produccion[][] = new int[num][6];

                    for (ren = 0; ren < i; ren++) {
                        System.out.println("Obrero[" + ren + "]: ");
                        System.out.println("Nombre: " + obreros1[ren].obtenerNombreEmp());
                        System.out.println("Departamento: " + obreros1[ren].obtenerDeptoEmp());
                        System.out.println("Puesto: " + obreros1[ren].obtenerPuestoEmp());
                        // }

                        // for (ren = 0; ren <num; ren++)
                        // {
                        for (col = 0; col <= 5; col++) {
                            System.out.print("Teclee produccion[" + ren + "," + col + "]: ");
                            datoEntrada = flujoEntrada.readLine();
                            produccion[ren][col] = Integer.parseInt(datoEntrada);
                        }
                    }

                }
            } catch (IOException error) {
                System.err.println("Error " + error.getMessage());
            }
        } while (op != 3);
    }
}
