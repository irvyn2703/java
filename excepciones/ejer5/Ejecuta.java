package ejer5;
import java.io.*;
public class Ejecuta {
    
    public static void main (String[] args){
        InputStreamReader entrada = new InputStreamReader (System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);
        String datoEntrada;
        int n=-200;


        System.out.println("ingresa N:");
        
            do{
                try {
                datoEntrada = flujoEntrada.readLine();
                n = Integer.parseInt(datoEntrada);
            }catch(Exception e){
                System.out.println("Error " + e.getMessage());
            }
            try{
                if(n<0){
                    throw new numeroNegativo(); 
                }
            }catch (numeroNegativo e){
                System.out.println("Error " + e.getMessage());
            }
            }while(n<0);
            Promedio promedio = new Promedio(n);
            promedio.ingresarN(n);
            System.out.println("el promedio es " + promedio.promedio());
       
    }

}
