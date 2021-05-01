import java.io.*;

public class Fraccion{
    InputStreamReader entrada=new InputStreamReader (System.in);
	BufferedReader flujoEntrada=new BufferedReader(entrada);

    String datoEntrada;
    int denominador,numerador;


    public void lecturaDeFraccion(){
        try{
            System.out.println("Ingresa el denominador:");

            datoEntrada = flujoEntrada.readLine();
            denominador=Integer.parseInt(datoEntrada);
            System.out.println("Ingresa el numerador:");
            datoEntrada = flujoEntrada.readLine();
            denominador=Integer.parseInt(datoEntrada);
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
}