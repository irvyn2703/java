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

	public class ProductoVentas
	{
		// atributos
		int i=0,num,ren,fila, col, totProd, toTotProd,j=0,k=0,pos=0,produc[] = new int[100];
		boolean ingresar=false,ventas=false;
		int[][] matriz= new int[100][4];
		int[][] matriz2= new int[100][4];
		int[][] matriz3= new int[100][4];

		// lectura
		InputStreamReader entrada = new InputStreamReader(System.in);
	    BufferedReader flujoEntrada = new BufferedReader(entrada);
	    String datoEntrada;


		// ingresar
		public void ingresarProducto(){
			try
	        {
	           System.out.println("-------------- Entrada de datos --------------");
	           System.out.print("Cuantos productos desea registar: ");
	           datoEntrada = flujoEntrada.readLine();  
	           num= Integer.parseInt(datoEntrada);
	           for (i = pos; i<(pos+num); i++)
	           {
	        	  System.out.println("*********************************************************************+");      
	               for (j= 0; j<= 3; j++)
	               {
	                  System.out.print("Teclee precios del producto " + (i+1)+ " en la sucursal " + (j+1) + ": ");
	                  datoEntrada = flujoEntrada.readLine();           
	                  matriz[i][j] = Integer.parseInt(datoEntrada);
	               }
				}
				pos=pos+num;
			}catch (IOException error)
			   {
				  System.err.println("Error " + error.getMessage());
			   }
			   ingresar=true;
			   ventas=false;
		}

		// ventas
		public void ingresarVentas(){
			if(ingresar==true){
			try
	        {
				for (i = 0; i<pos; i++)
				{
					System.out.println("*********************************************************************+");      
					for (j= 0; j<= 3; j++)
					{
						System.out.print("Teclee ventas totales del producto " + (i+1)+ " en la sucursal " + (j+1) + ": ");
						datoEntrada = flujoEntrada.readLine();           
						matriz2[i][j] = Integer.parseInt(datoEntrada);
					}
				}
			}catch (IOException error)
			{
			   System.err.println("Error " + error.getMessage());
			}
			ventas=true;
			}else
			System.out.println("ingresa productos primero");
		}

		public void verReporte(){ 
			if(ingresar == true && ventas == true){
                  int horizontal[]= new int [4];
                   for (i=0;i<pos;i++)
                   { for (j=0;j<=3;j++)
                       {
                        matriz3[i][j]=0;
 
                   matriz3[i][j]=matriz[i][j]*matriz2[i][j];
                   }
                  }

            	System.out.println("               REPORTE VENTAS TOTALES DE PRODUCTOS");
	            System.out.print("NO.PRODUCTO----------------------PUEBLA----GUADALAJARA----DF----MONTERREY---TOTAL VENTA PRODUCTO\n");
	            System.out.print("--------------------------------------------------------------------------------------------------\n");
	            System.out.print("--------------------------------------------------------------------------------------------------\n");
                  toTotProd = 0;
                  for (i=0;i<pos;i++)
                  {
                   
                   System.out.print("Ventas totales producto[" + (i+1) + "]: ");
                   toTotProd = 0;
                   for (j=0;j<=3;j++)
                  {
                   System.out.print("      $"+ matriz3[i][j] + "   ");
                  toTotProd = toTotProd + matriz3[i][j];
                  }
                   System.out.println("        $"+toTotProd);
                   System.out.print("\n");
                  }
                  for(i=0;i<=3;i++)
                  {
                   
                   }
	          System.out.print("Ventas Totales por Estado :");
                   for(j=0;j<=3;j++)
                  {
                  totProd=0;
                  for(i=0;i<pos;i++)
                  {
                  totProd+=matriz3[i][j];
                   }
                  horizontal[j]=totProd;
                   }
                  for(j=0;j<=3;j++)
                   {
                    
                   System.out.print("       $"+horizontal[j]+"  ");
                    }
                  System.out.print("\n--------------------------------------------------------------------------------------------\n");
	          System.out.print("----------------------------------------------------------------------------------------------\n");
			}else
			System.out.println("ingrese productos y ventas primero");
		}

		public void sucursalVentas(){
			int mayor=matriz2[0][0] ,menor=matriz2[0][0],sucurM=0,sucurm=0;
			  String sucM="",sucm="";
			  for(i=0;i<pos;i++){
				  produc[i]=0;
			  }
			  for(i=0;i<pos;i++){
				mayor=matriz2[i][0];
				menor=matriz2[i][0];
				for(j=0;j<=3;j++){
					produc[i]+=matriz2[i][j];
						if(mayor < matriz2[i][j]){
							mayor = matriz2[i][j];
							sucurM=j;
						}
						if(menor > matriz2[i][j]){
							menor = matriz2[i][j];
							sucurm=j;
						}
					}
					switch(sucurM){
						case 0:sucM="Puebla";
						break;
						case 1:sucM="Guadalajara";
						break;
						case 2:sucM="DF";
						break;
						case 3:sucM="Monterey";
						break;
					}
					switch(sucurm){
						case 0:sucm="Puebla";
						break;
						case 1:sucm="Guadalajara";
						break;
						case 2:sucm="DF";
						break;
						case 3:sucm="Monterey";
						break;
					}
					System.out.println("la sucursal con mayor ventas en el producto" + (i+1) + " es " + sucM + " con " + mayor + " ventas");
					System.out.println("la sucursal con menor ventas en el producto" + (i+1) + " es " + sucm + " con " + menor + " ventas");
				}
		}

		public void productoVendido(){
			int M=0,m=0;
			for(i=1; i<num;i++){
								if(produc[M]<produc[i]){
									M=i;
								}
								if(produc[m]>produc[i]){
									M=i;
								}
							}
							System.out.println("el producto mas vendido es el producto " + (M+1) + " con " + produc[M]);
							System.out.println("el producto menos vendido es el producto " + (m+1) + " con " + produc[m]);
		}


		public void guardar() {
			FileWriter fichero = null;
			PrintWriter inicio = null;
			try {
				fichero = new FileWriter("Reporte.txt");
				inicio = new PrintWriter(fichero);
				if(ingresar == true && ventas == true){
					int horizontal[]= new int [4];
					 for (i=0;i<pos;i++)
					 { for (j=0;j<=3;j++)
						 {
						  matriz3[i][j]=0;
   
					 matriz3[i][j]=matriz[i][j]*matriz2[i][j];
					 }
					}
  
				  inicio.println("               REPORTE VENTAS TOTALES DE PRODUCTOS");
				  inicio.print("NO.PRODUCTO----------------------PUEBLA----GUADALAJARA----DF----MONTERREY---TOTAL VENTA PRODUCTO\n");
				  inicio.print("--------------------------------------------------------------------------------------------------\n");
				  inicio.print("--------------------------------------------------------------------------------------------------\n");
					toTotProd = 0;
					for (i=0;i<pos;i++)
					{
					 
					 inicio.print("Ventas totales producto[" + (i+1) + "]: ");
					 toTotProd = 0;
					 for (j=0;j<=3;j++)
					{
					 inicio.print("      $"+ matriz3[i][j] + "   ");
					toTotProd = toTotProd + matriz3[i][j];
					}
					 inicio.println("        $"+toTotProd);
					 inicio.print("\n");
					}
					for(i=0;i<=3;i++)
					{
					 
					 }
				inicio.print("Ventas Totales por Estado :");
					 for(j=0;j<=3;j++)
					{
					totProd=0;
					for(i=0;i<pos;i++)
					{
					totProd+=matriz3[i][j];
					 }
					horizontal[j]=totProd;
					 }
					for(j=0;j<=3;j++)
					 {
					  
					 inicio.print("       $"+horizontal[j]+"  ");
					  }
					inicio.print("\n--------------------------------------------------------------------------------------------\n");
				inicio.print("----------------------------------------------------------------------------------------------\n");
			  }else
			  inicio.println("ingrese productos y ventas primero");
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

