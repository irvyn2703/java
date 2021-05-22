/**
 * @(#)EjecutaAlumno.java
 *
 *
 * @Miguel Carreon
 * @version 1.00 2021/4/13
 */

import java.io.*;

public class EjecutaAlumno
{
	public static void main(String args[])
	{
		InputStreamReader entrada = new InputStreamReader(System.in);
 		BufferedReader flujoEntrada = new BufferedReader(entrada);
 		String varnombre;
 		String varapellido;

 		try
 		{
 			System.out.println("Ingrese el nombre: ");
 			varnombre = flujoEntrada.readLine();
 			System.out.println("Ingrese el apellido: ");
 			varapellido = flujoEntrada.readLine();
 			Alumno alum= new Alumno(varnombre,varapellido);
 			alum.getDatos();
 		}
 		catch(Exception e) 
 		{
 		System.out.println("No se pudo crear el objeto y llama el mensaje de la Exception:"+ e.getMessage());
 		}
 		finally 
 		{
 		System.out.println("Instrucciones a ejecutar finalmente tanto si se producen anomalias como si no");
 		}
 	}
}