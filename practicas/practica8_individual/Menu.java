import java.io.*;
public class Menu {
    // lectura
    InputStreamReader entrada = new InputStreamReader(System.in);
	BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;

    // atributos
    int op=20;
    Matriz matriz = new Matriz();


    // metodos
    public void menu(){
        do{
            try{
                System.out.println("\tMenu\n0.Salir\n1.Leer los elementos de una Matriz\n2. Generar aleatoriamente los números en la matriz\n3. Visualizar elementos de la matriz\n4. Obtener el elemento mayor\n5. Obtener el elemento menor\n6. Sumar todas las filas de la matriz\n7. Sumar todas las columnas de la matriz\n8. Sumar toda la matriz\n9. Obtener la transpuesta de una matriz\n10. Obtener la diagonal de una matriz\n11. Guardar en un archivo");
                datoEntrada = flujoEntrada.readLine();
                op = Integer.parseInt(datoEntrada);
                switch(op){
                    case 0:
                    System.out.println("Gracias por usar este programa :)");
                    break;
                    case 1:
                    System.out.println("");
                    matriz.lectura();
                    System.out.println("");
                    break;
                    case 2:
                    System.out.println("");
                    matriz.lecturaAleatoria();
                    System.out.println("");
                    break;
                    case 3:
                    System.out.println("");
                    matriz.verMatriz();
                    System.out.println("");
                    break;
                    case 4:
                    System.out.println("");
                    System.out.println("el numero mayor es: " + matriz.mayor());
                    System.out.println("");
                    break;
                    case 5:
                    System.out.println("");
                    System.out.println("el numero menor es: " + matriz.menor());
                    System.out.println("");
                    break;
                    case 6:
                    System.out.println("");
                    matriz.sumaFilas(true);
                    System.out.println("");
                    break;
                    case 7:
                    System.out.println("");
                    matriz.sumaColumnas(true);
                    System.out.println("");
                    break;
                    case 8:
                    System.out.println("");
                    System.out.println("la suma de toda la matriz es " + matriz.sumaFilas(false));
                    System.out.println("");
                    break;
                    case 9:
                    System.out.println("");
                    matriz.transpuesta(true);
                    System.out.println("");
                    break;
                    case 10:
                    System.out.println("");
                    matriz.diagonal();
                    System.out.println("");
                    break;
                    case 11:
                    System.out.println("");
                    matriz.guardarArchivo(matriz.transpuesta(false));
                    System.out.println("");
                    break;
                    default: 
                    System.out.println("Opcion invalida");
                    op = 20;
                }
            }catch(IOException error)
            {
            System.err.println("Error " + error.getMessage());
            }
        }while(op!=0);
    }
}