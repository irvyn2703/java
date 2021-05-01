/**
 * @(#)Obrero.java
 *
 *
 * @author 
 * @version 1.00 2020/10/23
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Obrero 
	{
	  // Datos de la clase
	     protected String nombreEmp;
	     protected String deptoEmp;
	     protected String puestoEmp;

	     
	  public Obrero()
	  {
	  }
	  
	  public Obrero(String nom, String depto, String puesto)
	  {
		  nombreEmp=nom;
		  deptoEmp=depto;
		  puestoEmp=puesto;
	  }
	  
	  // Metodos de entrada de datos -setters-

	     public void establecerNombreEmp(String nom)
	     {
	        nombreEmp = nom;    
	     }

	     public void establecerDeptoEmp(String dep)
	     {
	        deptoEmp = dep;    
	     }

	     public void establecerPuestoEmp(String pue)
	     {
	        puestoEmp = pue;    
	     }
	 
	  // Metodos de acceso a los datos -getters-

	     public String obtenerNombreEmp()
	     {
	        return nombreEmp;
	     }

	     public String obtenerDeptoEmp()
	     {
	        return deptoEmp;
	     }

	     public String obtenerPuestoEmp()
	     {
	        return puestoEmp;
	     }
	     
	    public Obrero lecturaDatos()throws IOException
	     {
	    	 
	    	// Variables
	         String datoEntrada;
	         String nomEmp, depto, puesto;
	         
	    
	    	 // Declaraciones
		     // Definicion de objetos para entrada de datos por el teclado
		        InputStreamReader entrada = new InputStreamReader(System.in);
		        BufferedReader flujoEntrada = new BufferedReader(entrada);

		     
		        System.out.println("\nRegistro de DATOS OBREROS\n");

		        
		        // Leer datos
		          
		        	System.out.println("------------ Lectura de datos ------------");
		            System.out.print("Teclee nombre: ");
		            datoEntrada = flujoEntrada.readLine();           
		            nomEmp = datoEntrada;

		            System.out.print("Teclee departamento: ");
		            datoEntrada = flujoEntrada.readLine();           
		            depto = datoEntrada;

		            System.out.print("Teclee puesto: ");
		            datoEntrada = flujoEntrada.readLine();           
		            puesto = datoEntrada;
                    Obrero objeto1=new Obrero(nomEmp,depto,puesto);   
                  return objeto1;     
                
	     }
	     
	}
		      
		        
		      
		      
	    