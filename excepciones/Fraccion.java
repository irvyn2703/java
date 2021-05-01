import java.io.*;
public class Fraccion {
    int numerador,denominador=0;
    boolean existeNumerador=false, existeDenominador=false;

    // lectura
    InputStreamReader entrada=new InputStreamReader (System.in);
	BufferedReader flujoEntrada=new BufferedReader(entrada);
    String datoEntrada;
    

    public void ingresarDenominador(){
        System.out.println("Ingresa el denominador");
        do{
            try{
                datoEntrada = flujoEntrada.readLine();
                denominador=Integer.parseInt(datoEntrada);
                existeDenominador=true;
            }catch(Exception e){
                System.out.println("Error " + e.getMessage());
            }
            try{
                if (denominador == 0){
                    throw new DenominadorCeroExcepcion();
                }
            } catch (DenominadorCeroExcepcion e){
                System.out.println("Error " + e.getMessage());
                e.printStackTrace();
            } finally{
                System.out.println("Intentalo otra vez");
            }
        }while(denominador==0);
    }

    public void ingresarNumerador(){
        try{
            System.out.println("Ingresar el Numerador");
            datoEntrada= flujoEntrada.readLine();
            numerador= Integer.parseInt(datoEntrada);
            existeNumerador=true;
        }catch(Exception e){
            System.out.println("ERROR " + e.getMessage());
        }
    }


    public void verFraccion(){
        if(existeNumerador==true && existeDenominador == true){
            System.out.println(numerador + " / " + denominador);
        }
    }
}