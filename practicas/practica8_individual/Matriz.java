import java.io.*;
public class Matriz {
    // lectura
    InputStreamReader entrada = new InputStreamReader(System.in);
	BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;

    // atributos
    int[][] matriz;
    boolean matrizCuadrada;

    // metodos
    public void lectura(){
        boolean validacion = false;
        int fila=0,columna=0;
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
        int fila, columna;
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


    public int mayor(){
        int mayor=matriz[0][0];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(mayor<matriz[i][j]){
                    mayor=matriz[i][j];
                }
            }
        }
        return mayor;
    }


    public int menor(){
        int menor=matriz[0][0];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(menor>matriz[i][j]){
                    menor=matriz[i][j];
                }
            }
        }
        return menor;
    }


    public int sumaFilas(boolean imprimir){
        int suma=0,sumaTotal=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                suma += matriz[i][j];
            }
            if(imprimir == true){
                System.out.println("la suma de la fila " + (i+1) + " es: " + suma);
            }
            sumaTotal += suma;
            suma = 0;
        }
        return sumaTotal;
    }


    public int sumaColumnas(boolean imprimir){
        int suma=0,sumaTotal=0;
        for(int j=0;j<matriz[0].length;j++){
            for(int i=0;i<matriz.length;i++){
                suma += matriz[i][j];
            }
            if(imprimir == true){
                System.out.println("la suma de la columna " + (j+1) + " es: " + suma);
            }
            sumaTotal += suma;
            suma = 0;
        }
        return sumaTotal;
    }

    
    public int[][] transpuesta(boolean imprimir){
        int[][] transpuesta= new int[matriz[0].length][matriz.length];
        for(int j=0;j<matriz[0].length;j++){
            for(int i=0;i<matriz.length;i++){
                transpuesta[j][i] = matriz[i][j];
            }
        }
        // imprime en consola
        if(imprimir == true){
            System.out.println("\tMATRIZ ORIGINAL");
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("****************************");
            System.out.println("");
            System.out.println("MATRIZ TRANSPUESTA");
            for(int i=0;i<transpuesta.length;i++){
                for(int j=0;j<transpuesta[i].length;j++){
                    System.out.print(transpuesta[i][j] + "\t");
                }
                System.out.println("");
            }
        }
        return transpuesta;
    }


    public void diagonal(){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if (i==j){
                    System.out.println("posicion [" + (i+1) + "][" + (j+1) + "]:" + matriz[i][j]);
                }
            }
        }
    }


    public void guardarArchivo(int[][] transpuesta){
        FileWriter fichero = null;
		PrintWriter inicio = null;
		try {
			fichero = new FileWriter("matriz.txt");
			inicio = new PrintWriter(fichero);

			inicio.println("\tMATRIZ ORIGINAL");
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    inicio.print(matriz[i][j] + "\t");
                }
                inicio.println("");
            }
            inicio.println("");
            inicio.println("****************************");
            inicio.println("");
            inicio.println("MATRIZ TRANSPUESTA");
            for(int i=0;i<transpuesta.length;i++){
                for(int j=0;j<transpuesta[i].length;j++){
                    inicio.print(transpuesta[i][j] + "\t");
                }
                inicio.println("");
            }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
    }
}
