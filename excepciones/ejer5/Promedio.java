package ejer5;
import java.io.*;

public class Promedio {
    InputStreamReader entrada = new InputStreamReader (System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;

    int[] N;
    int suma=0,comprobar;
    double promedio;

    public Promedio (int n){
        N = new int[n];
    }

    public void ingresarN(int n ){
            for(int i=0;i<n;i++){
                System.out.println("ingresa el numero " + (i+1));
                do{
                    try{
                        datoEntrada = flujoEntrada.readLine();
                        comprobar= Integer.parseInt(datoEntrada);
                    }catch(Exception e){
                        System.out.println("Error " + e.getMessage());
                    }
                    try{
                        if(comprobar<0){
                            throw new numeroNegativo();
                        }
                    } catch (numeroNegativo e){
                        System.out.println("Error " + e.getMessage());
                    }
                }while(comprobar<0);
                N[i]= Integer.parseInt(datoEntrada);
                suma=suma+N[i];
            }
        }

    public double promedio(){
        promedio=suma/N.length;
        return promedio;
    }
}
