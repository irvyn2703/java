import java.io.*;
public class Matriz {
    // lectura
    InputStreamReader entrada = new InputStreamReader(System.in);
	BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;

    // atributos
    int[][] matriz;
    boolean matrizCuadrada;
    int fila,columna;

    // metodos
    public void lectura(){
        boolean validacion = false;
        fila=0;
        columna=0;
        do{
            try{
                System.out.print("Ingresa el numero de filas de la matriz:");
                datoEntrada = flujoEntrada.readLine();
                fila=Integer.parseInt(datoEntrada);
                System.out.print("Ingresa el numero de columnas de la matriz:");
                datoEntrada = flujoEntrada.readLine();
                columna=Integer.parseInt(datoEntrada);
                if(fila==columna){
                    matrizCuadrada=true;
                }else
                matrizCuadrada=false;
                matriz= new int[fila][columna];
                // si la lectura lee todo bien validacion cambia a verdadero
                validacion = true;
                // si los datos obtenidos son menores a 0 la validacion cambia a false
                if(fila<1 && columna<1){
                    validacion=false;
                    System.out.println("la matriz no permite numeros menores que 0");
                }
            }catch(IOException error){
                System.err.println("Error " + error.getMessage());
            }
        }while(validacion == false);
        try{
            for(int i=0; i<fila; i++){
                for(int j=0; j<columna; j++){
                    System.out.print("ingresa el dato [" + (i+1) + "] [" + (j+1) + "]:");
                    datoEntrada = flujoEntrada.readLine();
                    matriz[i][j] = Integer.parseInt(datoEntrada);
                }
            }
        }catch(IOException error){
            System.err.println("Error " + error.getMessage());
        }
        System.out.println("");
    }


    public void lecturaAleatoria(){
        fila=0; 
        columna=0;
        boolean validacion = false;
        do{
            try{
                System.out.print("Ingresa el numero de filas de la matriz:");
                datoEntrada = flujoEntrada.readLine();
                fila = Integer.parseInt(datoEntrada);
                System.out.print("Ingresa el numero de columnas de la matriz:");
                datoEntrada = flujoEntrada.readLine();
                columna = Integer.parseInt(datoEntrada);
                matriz = new int[fila][columna];
                for(int i=0; i<fila; i++){
                    for(int j=0; j<columna; j++){
                        matriz[i][j] = (int)(Math.random()*100+1);
                    }
                }
                if(fila == columna){
                    matrizCuadrada=true;
                }else
                matrizCuadrada = false;
                validacion=true;
            }catch(IOException error){
                System.err.println("Error " + error.getMessage());
            }
        }while(validacion==false);
        System.out.println("Matriz generada\n");
    }


    public void verMatriz(){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public int[][] obtenerMatriz(){
        return matriz;
    }

    
}
