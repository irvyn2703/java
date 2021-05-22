import java.io.*;
public class orquesta {
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;

    String nombreOrquesta;
    public orquesta(String nombre) {
        nombreOrquesta = nombre;
    }
    public void CrearOrquesta(){
        System.out.println("ingresa EL nombre del pianista");
        try {
            datoEntrada = flujoEntrada.readLine();
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
        piano piano = new piano(datoEntrada);
        piano.tocarD();
        piano.afinar();
        piano.tocar();
        System.out.println("");

        System.out.println("ingresa EL nombre del flautista");
        try {
            datoEntrada = flujoEntrada.readLine();
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
        flauta flauta= new flauta(datoEntrada);
        flauta.tocar();
        System.out.println("");

        System.out.println("ingresa EL nombre del violinista");
        try {
            datoEntrada = flujoEntrada.readLine();
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
        violin violin= new violin(datoEntrada);
        violin.tocarD();
        violin.afinar();
        violin.tocar();
        System.out.println("");
    }

    public void guardarOrquesta(){
        System.out.println("se a guardado la orquesta " + nombreOrquesta);
    }
}
