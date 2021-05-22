/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brenda
 */
import java.io.*;

public class Menu {
    // atributos
    int op=0;
    Matriz matriz = new Matriz();

    // lectura
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;

    // metodos
    public void menu() {
        try{
            do {
                System.out.println("\n*********************************************************************");
                System.out.println("MENU\n"
                        + "0.-Salir\n"
                        + "1.-Generar Matrices\n"
                        + "2.-Mostrar Matrices\n"
                        + "3.-Sumar Matrices\n"                      
                        + "4.-Multiplicar Matrices\n"
                        + "5.-Restar Matrices\n"                     
                        + "6.-Verificar si las matrices son cuadradas\n"
                        + "7.-Verificar si las matrices es triangular superior.\n"
                        + "8.-Verificar si la matriz es identidad.\n"
                        + "9.-Obtenga el producto de la matriz por un escalar.");
                datoEntrada = flujoEntrada.readLine();  
                op = Integer.parseInt(datoEntrada);
                switch(op){
                    case 0:
                    System.out.println("gracias por usar este programa :)");
                    break;
                    case 1:
                    matriz.GenerarMatriz();
                    break;
                    case 2:
                    matriz.MostrarMatriz();      
                    break;
                    case 3:
                    matriz.SumarMatrices();
                    break;
                    case 4:
                    matriz.MultiplicacionMatrices();
                    break;
                    case 5:              	                  
                    matriz.RestarMatrices();             
                    break;
                    case 6:                   
                    matriz.MatrizCuadrada();
                    break;
                    case 7:
                    matriz.TriangularSuperior();
                    break;
                    case 8:
                    matriz.Identidad();
                    break;
                    case 9:
                    matriz.Escalar();
                    break;
                    default: System.out.println("opcion invalida");
                }
            } while (op != 0);
        }catch (IOException error)
        {
           System.err.println("Error " + error.getMessage());
        }
    }
}
