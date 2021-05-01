import java.io.*;
public class Menu {
    int op;
    Fraccion f = new Fraccion();

    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;

    public void menu(){
        try {
            do{
                System.out.println("\tMenu\n0.-salir\n1.-Ingresar numerador\n2.-Ingresar denominador\n3.-ver fraccion");
                datoEntrada = flujoEntrada.readLine();
                op = Integer.parseInt(datoEntrada);
                switch(op){
                    case 0:
                    System.out.println("adios");
                    break;
                    case 1:
                        f.ingresarNumerador();
                    break;
                    case 2:
                        f.ingresarDenominador();
                    break;
                    case 3:
                        f.verFraccion();
                    break;
                    default: System.out.println("opcion invalida");
                }
    
            }while(op!=0);
        }catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        }
}
