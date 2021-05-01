/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brenda
 */
import java.io.*;

	public class Matriz
	{
		// atributos
		int escalar,i=0,filas,columnas,filas1,columnas1,j=0,menor,mayor,filaMayor, filaMenor, colMayor, colMenor;
		boolean ingresar=false;
	        int[][]matriz=new int[100][100];
                int [][]matriz1=new int[100][100];
                int esIdentidad = 1;
                int suma = 0;
		// lectura
		InputStreamReader entrada = new InputStreamReader(System.in);
	        BufferedReader flujoEntrada = new BufferedReader(entrada);
	        String datoEntrada;
		// ingresar
		public void GenerarMatriz(){
			try
	        {
	           System.out.println("-------------- Generar Matriz 1 --------------");
	           System.out.print("Ingrese el numero de filas de la matriz 1 : ");
	           datoEntrada = flujoEntrada.readLine();  
	           filas= Integer.parseInt(datoEntrada);
                    System.out.print("Ingrese el numero de columnas de la matriz 1: ");
	           datoEntrada = flujoEntrada.readLine();  
	           columnas= Integer.parseInt(datoEntrada);                                                  
                       for (i=0; i<filas; i++)
	           {
	        	  System.out.println("*********************************************************************+");      
	               for (j= 0; j< columnas; j++)
	               {
	                  System.out.print("Teclee el elemento " + (i+1)+ "," + (j+1) + ": ");
	                  datoEntrada = flujoEntrada.readLine();           
	                  matriz[i][j] = Integer.parseInt(datoEntrada);
                         
	               }
                   }
                     System.out.println("-------------- Generar Matriz 2 --------------");
	           System.out.print("Ingrese el numero de filas de la matriz 2 : ");
	           datoEntrada = flujoEntrada.readLine();  
	           filas1= Integer.parseInt(datoEntrada);
                    System.out.print("Ingrese el numero de columnas de la matriz 2: ");
	           datoEntrada = flujoEntrada.readLine();  
	           columnas1= Integer.parseInt(datoEntrada);                                                  
                       for (i=0; i<filas1; i++)
	           {
	        	  System.out.println("*********************************************************************+");      
	               for (j= 0; j< columnas1; j++)
	               {
	                  System.out.print("Teclee el elemento " + (i+1)+ "," + (j+1) + ": ");
	                  datoEntrada = flujoEntrada.readLine();           
	                  matriz1[i][j] = Integer.parseInt(datoEntrada);
                         
	               }
                   }	   
		    }catch (IOException error)
			   {
				  System.err.println("Error " + error.getMessage());
			   }
			   ingresar=true;
		    }
                public void MostrarMatriz(){    
                    System.out.println("-------------- Matriz 1 --------------");
                    for (i= 0; i < filas; i++)
	           {
	               for (j= 0; j< columnas; j++)
	               {
	                  System.out.print(" "+ matriz[i][j] + " ");
	               }
	           System.out.print("\n");
	           }
                    System.out.println("-------------- Matriz 2 --------------");
                    for (i= 0; i < filas1; i++)
	           {
	               for (j= 0; j< columnas1; j++)
	               {
	                  System.out.print(" "+ matriz1[i][j] + " ");
	               }
	           System.out.print("\n");
	           }
                }
                
		public void SumarMatrices(){
                 if ((columnas==columnas1)&&(filas==filas1)){
                    System.out.print("\nLa matriz resultado es:\n");
                      for (i= 0; i < filas; i++) {
	               for (j= 0; j< columnas; j++)
	               {
                          matriz[i][j]=matriz[i][j]+matriz1[i][j];
	                  System.out.print(" "+ matriz[i][j] + " ");
	               }
	           System.out.print("\n");
	           }}
                 else {
                     System.out.print("\n*NO SE PUEDE REALIZAR LA SUMA*LAS MATRICES DEBEN TENER EL MISMO TAMAÑO");
                 }
                }
                 
                public void MultiplicacionMatrices(){ 
                    if (columnas==filas1){
              for (j = 0; j < columnas1; j++) {
        // Dentro recorremos las filas de la primera (A)
        for (i = 0; i < filas; i++) {
            suma = 0;
            // Y cada columna de la primera (A)
            for (j = 0; j < columnas; j++) {
                // Multiplicamos y sumamos resultado
                suma += matriz[i][j] * matriz1[i][j];
            }
            // Lo acomodamos dentro del producto
            matriz[i][j] = suma;
        }
    }

    // Recorrer producto
    System.out.print("Imprimiendo producto\n");
    for (i = 0; i < filas1; i++) {
        for (j = 0; j < columnas1; j++) {
            System.out.print(" "+ suma+ " ");
        }
       System.out.print("\n");
    }	}
                    else{
                         System.out.print("*NO SE PUEDE REALIZAR LA MULTIPLICACION* La filas deben ser igual a las columnas");
                    }}
		public void RestarMatrices()
                {
                   if ((columnas==columnas1)&&(filas==filas1)){
                    System.out.print("\nLa matriz resultado es:\n");
                      for (i= 0; i < filas; i++) {
	               for (j= 0; j< columnas; j++)
	               {
                          matriz[i][j]=matriz[i][j]-matriz1[i][j];
	                  System.out.print(" "+ matriz[i][j] + " ");
	               }
	           System.out.print("\n");
	           }}
                 else {
                     System.out.print("\n*NO SE PUEDE REALIZAR LA RESTA*LAS MATRICES DEBEN TENER EL MISMO TAMAÑO");
                 }
                
                }         
                
                public void MatrizCuadrada(){
                    
		  System.out.println("-------------- Matriz 1 --------------");
                    for (i= 0; i < filas; i++)
	           {
	               for (j= 0; j< columnas; j++)
	               {
	                  System.out.print(" "+ matriz[i][j] + " ");
	               }
	           System.out.print("\n");
	           }
                  if (filas==columnas){
                      System.out.print("\nLA MATRIZ 1 ES CUADRADA");
                  }
                  else 
                  {
                       System.out.print("\nLA MATRIZ 1 NO ES CUADRADA");
                  }
                    System.out.println("\n-------------- Matriz 2 --------------");
                    for (i= 0; i < filas1; i++)
	           {
	               for (j= 0; j< columnas1; j++)
	               {
	                  System.out.print(" "+ matriz1[i][j] + " ");
	               }
	           System.out.print("\n");
	           }
                
                 if (filas1==columnas1){
                      System.out.print("\nLA MATRIZ 2 ES CUADRADA");
                  }
                  else 
                  {
                       System.out.print("\nLA MATRIZ 2 NO ES CUADRADA");
                  }
                }
		public void TriangularSuperior(){
                    if ((filas==columnas)&&(filas1==columnas1)){
                        int sum=0;
                        for(int i=1;i<filas;i++){
                            for(int j=0;j<columnas;j++){
                                if(j<i){
                                        sum+=matriz[i][j];      
                                }
                            }
                        }
                
                        if(sum==0){
                                System.out.print("\nLa matriz 1 es triagular superior");
                        }
                        else{
                               System.out.print("\nLa matriz 1, no es una matriz triangular superior");
                        }
                    
                    
                          for(int i=1;i<filas1;i++){
                            for(int j=0;j<columnas1;j++){
                                if(j<i){
                                        sum+=matriz1[i][j];      
                                }
                            }
                        }
                
                        if(sum==0){
                                System.out.print("\nLa matriz 2 es triangular superior");
                        }
                        else{
                               System.out.print("\nLa matriz 2, no es una matriz triagular superior");
                        }
                    
                } else{
                        System.out.print("\nDebe ser una matriz cuadrada para verificar si es triangular superior");
                    }
                }
                public void Identidad(){
               if ((filas==columnas)&&(filas1==columnas1)){
                for(i =0; i <filas; i++)
                for(j =0; j <columnas; j++)
                {
                if( (matriz[i][j] != 0 && i != j) ||
                (matriz[i][j] != 1 && i == j))
                 esIdentidad = 0;
                 }
                  if(esIdentidad==1){
              System.out.print( "\n MATRIZ 1 ES IDENTIDAD.\n");}
                else{
              System.out.print( "\nMATRIZ 1 NO ES  IDENTIDAD.\n");}
                  for(i =0; i <filas1; i++)
                for(j =0; j <columnas1; j++)
                {
                if( (matriz1[i][j] != 0 && i != j) ||
                (matriz1[i][j] != 1 && i == j))
                 esIdentidad = 0;
                 }
                  if(esIdentidad==1){
              System.out.print( "\n MATRIZ 2 ES IDENTIDAD.\n");}
                else{
              System.out.print( "\nMATRIZ 2 NO ES  IDENTIDAD.\n");}}
                  else{
                        System.out.print("Debe ser una matriz cuadrada para verificar si es triangular superior");
                    }
}
                                     
		public void Escalar() {
                    try
	        {
                     System.out.print("Ingrese el escalar por el que va a multiplicar las matrices: ");
	           datoEntrada = flujoEntrada.readLine();  
	           escalar= Integer.parseInt(datoEntrada);
			
 for(i=0;i<filas;i++){//filas
for(j=0;j<columnas;j++)//columnas
{
matriz[i][j]=matriz[i][j]*escalar;
}}
System.out.print("\nRESULTADO DE LA MATRIZ 1 x "+ escalar + ":\n");

for(i=0;i<filas;i++)//filas
{
for(j=0;j<columnas;j++)
{//columnas
System.out.print(" "+ matriz[i][j]);}
System.out.print("\n");
}
 for(i=0;i<filas1;i++){//filas
for(j=0;j<columnas1;j++)//columnas
{
matriz1[i][j]=matriz1[i][j]*escalar;
}}
System.out.print("\nRESULTADO DE LA MATRIZ 2 x "+ escalar + ":\n");

for(i=0;i<filas1;i++)//filas
{
for(j=0;j<columnas1;j++)
{//columnas
System.out.print(" "+ matriz1[i][j]);}
System.out.print("\n");
}

                   
		}catch (IOException error)
			   {
				  System.err.println("Error " + error.getMessage());
			   }
			   ingresar=true;
                }
	}