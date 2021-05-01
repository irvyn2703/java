
/**
 * @(#)EjecutaPersonaExcepcion.java
 *
 *
 * @Miguel Carreon
 * @version 1.00 2021/4/13
 */

import java.util.*;
import java.io.*;

public class EjecutaPersonaExcepcion {
	public static void main(String args[]) throws IOException {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader flujoEntrada = new BufferedReader(entrada);
		String datoEntrada;
		int varedad = 0;
		String varnombre;
 		String varapellido;
		boolean lecturaNombreCompleto= false;

		Persona persona1 = new Persona();
		do{
			try
			 {
				 System.out.println("Ingrese el nombre: ");
				 varnombre = flujoEntrada.readLine();
				 System.out.println("Ingrese el apellido: ");
				 varapellido = flujoEntrada.readLine();
				 persona1 = new Persona(varnombre,varapellido);
				lecturaNombreCompleto=true;
			 }
			 catch(Exception e)
			 {
			 System.out.println("No se pudo crear el objeto y llama el mensaje de la Exception:"+ e.getMessage());
			 }
		}while(lecturaNombreCompleto==false);


		do{
			try {
				System.out.println("Dame la edad de la persona");
				datoEntrada = flujoEntrada.readLine();
				varedad = Integer.parseInt(datoEntrada);
				persona1.ponerEdad(varedad);
				
			} catch (NumberFormatException e1) // Excepci�n s�lo para ese tipo de error
			{
				System.out.println("Formato no valido deben ser numeros " + e1.getMessage());
				e1.printStackTrace();// siguimiento del error
			} catch (EdadFuera e2) {
				System.out.println("No es valida la edad:" + e2.getMessage());
			} 
		}while(varedad < 0 || varedad > 130);


		System.out.println("hola " + persona1.nombre + " " + persona1.apellidos + " de " + persona1.edad + " años");
		persona1.TipoPersona(varedad);

	}// fin main

}// fin clase