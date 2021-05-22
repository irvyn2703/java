/**
 * @(#)Alumno.java
 *
 *
 * @Miguel Carreon 
 * @version 1.00 2021/4/13
 */


public class Alumno 
{
	String nombre;
	String apellidos;
	
	public Alumno()
	{
		nombre=null;
		apellidos=null;
	}
	public Alumno(String nombre1, String apellidos1) throws Exception
 	{
 		if(nombre1 == null || apellidos1 == null  ||  "".equals(nombre1)  || "".equals(apellidos1))
 		throw new Exception("Argumentos no válidos");
 		//si el constructor no tiene los dos atributos lanza la excepción el objeto
 		//no se crea el objeto

 		else
 		System.out.println("Se construyó el objeto");
 		nombre=nombre1;
 		apellidos=apellidos1;
 	}

 	public void setDatos(String nombre1, String apellidos1)
	{
 		nombre=nombre1;
		apellidos=apellidos1;
 	}

 	public void getDatos()
 	{
		System.out.println ("======Los datos del objeto =====");
 		System.out.println ("Nombre: " +nombre);
 		System.out.println ("Apellido: " +apellidos);
 	}
}
