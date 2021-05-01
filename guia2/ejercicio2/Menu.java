import java.io.*;
public class Menu {
    // lectura
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;


    // atributos
    int op;
    Distrito distrito = new Distrito();
    // metodos
    public void menu(){
        // espera la opcion
        do{
            do{
                try{
                    System.out.println("\tMENU\n0.-salir\n1.-ingresar candidatos\n2.-Imprimir la tabla\n3.-Calcular e imprimir el numero total de votos recibidos por cada candidato y el porcentaje del total de votos emitidos\n4.-imprimir el nombre de los dos candidatos más votados");
                    datoEntrada = flujoEntrada.readLine();
                    op = Integer.parseInt(datoEntrada);
                }catch(Exception e){
                    System.out.println("Error " + e.getMessage());
                }
            } while(op!=0 && op!=1 && op!=2 && op!=3 && op!=4);
    
    
            // empieza el switch segun la opcion
            switch(op) {
                // salir
                case 0:
                    System.out.println("Gracias por usar este programa");
                break;
    
    
                // ingresar candidatos
                case 1:
                    distrito.ingresarCandidatos();
                break;


                // Imprimir la tabla
                case 2:
                    distrito.imprimirTabla();
                break;
    
    
                // Calcular e imprimir el numero total de votos
                case 3:
                    distrito.votos();
                break;
    
    
                // imprimir el nombre de los dos candidatos más votados
                case 4:
                    distrito.muestraMejores();
                break;
    
                default: System.out.println("opcion invalida");
            }
        }while(op!=0);
    }
}
