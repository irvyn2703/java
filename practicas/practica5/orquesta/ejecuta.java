import java.io.*;
public class ejecuta {
    public static void main(String[] args){
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);
        String datoEntrada = null;

        System.out.print("ingresa el nombre de la orquesta:");
        try{
            datoEntrada = flujoEntrada.readLine();
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
        orquesta objeto1 = new orquesta(datoEntrada);
        objeto1.CrearOrquesta();
        objeto1.guardarOrquesta();
    }
}
