//Fecha:
//Objetivo:
//Autor:
import java.io.*;
import java.util.Scanner;

public class automovil{//variables instancia
 String Marca;
 String Modelo;
 String Colores;
 int Numpas;
 int amo;
 // variable de clase
 static int num=0;
   
//constructor   
public automovil()
 {
 	
 }
 
 public automovil(String Marca1,String Modelo1,String Color1,int numpas1,int amo1)
 	
 {
 	Marca=Marca1;
 	Modelo=Modelo1;
 	Colores=Color1;
 	Numpas=numpas1;
 	amo=amo1;
 }	
 
 public automovil AsignarInformacion()
 {
 	Scanner leer= new Scanner(System.in);
 	System.out.println("Dame la Marca");
 	Marca=leer.nextLine();
 	System.out.println("Dame el Modelo");
 	Modelo=leer.nextLine();
 	System.out.println("Dame el Color");
 	Colores=leer.nextLine();
 	System.out.println("Numero de pasajeros");
 	Numpas=leer.nextInt();
 	System.out.println("Dame el año del modelo");
 	amo=leer.nextInt();
 	automovil objeto= new automovil(Marca,Modelo,Colores,Numpas,amo);
	leer.close();
 	return objeto; 
 }
 	
 public void MostrarInformacion()
 {
 	System.out.println ("=====AUTOMOVIL===========");
 	System.out.println ("La Marca es: " +Marca);
 	System.out.println ("El Modeloes: " +Modelo);
 	System.out.println ("El Color  es: " + Colores);
 	System.out.println ("Numero de pasajeros  es: " +Numpas);
 	System.out.println ("Año del automovil: " + amo);
 	
 }	
   
    
}