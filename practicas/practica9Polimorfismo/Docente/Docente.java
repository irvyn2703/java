/**
 * @(#)Docente.java
 *
 *
 * @author 
 * @version 1.00 2015/10/7
 */

import java.util.Scanner;


abstract public class Docente 
{

    protected String Nombre;
    protected String id;
    protected String Categoria;
    protected String Facultad; 
	protected double salario;	
	
	
	public Docente(String Nombre1,String id1,String Categoria1,String Facultad1, double salario1)
	{
		Nombre=Nombre1;
		id=id1;
		Categoria=Categoria1;
		Facultad=Facultad1;
		salario=salario1;
	}
		
	public Docente()
	{
	    String Nombre1,id1,Categoria1,Facultad1;
	    double salario1;
	    Scanner leer=new Scanner(System.in);
	    System.out.println("Ingresar Nombre");
     	Nombre1=leer.next();
		System.out.println("Ingresa No_ trabajador");
		id1=leer.next();
	    System.out.println("Ingresar Categoria");
		Categoria1=leer.next();
		System.out.println("Ingresa Facultad");
		Facultad1 =leer.next();
	    System.out.println("Ingresar Salario");
		salario1=leer.nextDouble();
		Nombre=Nombre1;
		id=id1;
		Categoria=Categoria1;
		Facultad=Facultad1;
		salario=salario1;
	}
        
	public void Mostrar_Datos()
	{
        
    
    System.out.println("Nombre"+Nombre);
    System.out.println("Numero de Trabajador"+id);
    System.out.println("Categoria"+Categoria);
    System.out.println("Facultad"+Facultad); 
	System.out.println("Salario"+ salario);	    
        
	}
	
	abstract public double PagoSalario();
        
}
    