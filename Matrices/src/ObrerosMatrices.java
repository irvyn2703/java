	
	import java.io.*;

	public class ObrerosMatrices
	{
	   public static void main(String args[])throws IOException
	   {
	     // Declaraciones
	     // Definicion de objetos para entrada de datos por el teclado
	        InputStreamReader entrada = new InputStreamReader(System.in);
	        BufferedReader flujoEntrada = new BufferedReader(entrada);

	     // Variable para tomar los datos leidos del flujo de entrada
	        String datoEntrada;

	     // Variables
	       String obreros[] = new String[3];
	       // int produccion[][] = new int[3][6];
	        int i=0,num,ren,fila, col, totProd, toTotProd;
	        Obrero objetoObrero= new Obrero();
	        

	        System.out.println("\nPROCESA PRODUCCION DE OBREROS\n");

	        try
	        {
	        // Leer datos
	          
	           System.out.println("-------------- Entrada de datos --------------");
	           System.out.print("Cuantos empleados desea registar: ");
	           datoEntrada = flujoEntrada.readLine();  
	           num= Integer.parseInt(datoEntrada);
	           
	          Obrero obreros1[] = new Obrero[num];
	          do 
	          {
	          obreros1[i]=objetoObrero.lecturaDatos(); 
              i++;
	          } while (i!=num);
	          
	          int produccion[][] = new int[num][6];
	           
	          for (ren = 0; ren<i; ren++)
	           {
	        	  System.out.println("Obrero[" + ren + "]: ");
	        	  System.out.println("Nombre: "+ obreros1[ren].obtenerNombreEmp());
	        	  System.out.println ("Departamento: "+obreros1[ren].obtenerDeptoEmp());
	        	  System.out.println ("Puesto: "+obreros1[ren].obtenerPuestoEmp());
	         //  }
	          
	          //for (ren = 0; ren <num; ren++)
	          // {
	               for (col = 0; col <= 5; col++)
	               {
	                  System.out.print("Teclee produccion[" + ren + "," + col + "]: ");
	                  datoEntrada = flujoEntrada.readLine();           
	                  produccion[ren][col] = Integer.parseInt(datoEntrada);
	               }
	           }
	 
	        // Imprimir salida
	           System.out.println("               REPORTE SEMESTRAL DE PRODUCCION");
	           System.out.print("NO TRABAJADOR---NOMBRE--- DEPTO---PUESTO --------MES1-- MES2 ");
	           System.out.println("  MES3- -- - MES4- - MES5 -- MES6 --   TOT.PRODUCCION");
	           System.out.print("-----------------------------------------------------------------------");
	           System.out.println("----------------------------------------------------------------------");
	           toTotProd = 0;
	           for (ren = 0; ren < i; ren++)
	           {
	               //System.out.print(obreros[ren] + "   ");
	        	  System.out.print("Obrero[" + (ren+1) + "]: ");
		          System.out.print("     "+ obreros1[ren].obtenerNombreEmp());
		       	  System.out.print ("   "+ obreros1[ren].obtenerDeptoEmp());
		       	  System.out.print ("   "+obreros1[ren].obtenerPuestoEmp());
	               totProd = 0;
	               for (col = 0; col <= 5; col++)
	               {
	                  System.out.print("    "+ produccion[ren][col] + "  ");
	                  totProd = totProd + produccion[ren][col];
	               }
	               System.out.println(totProd);
	               toTotProd = toTotProd + totProd;
	           }
	           System.out.print("-----------------------------------------------------------------------");
	           System.out.println("----------------------------------------------------------------------");
	           System.out.println("Total                                                                                           =  " + toTotProd);
	        } 
	        catch (IOException error)
	        {
	           System.err.println("Error " + error.getMessage());
	        }
	   }
	

	}


