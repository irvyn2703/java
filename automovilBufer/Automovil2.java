//Fecha:
//Objetivo:
//Autor:
import java.io.*;
import java.util.Scanner;

public class Automovil2{

//variables instancia
 String Marca;
 String datoEntrada;
 String Modelo;
 String Colores;
 String Placa;
 int Numpas;
 int amo;
 // variable de clase
 static int num=0;
   
//constructor   
public Automovil2 ()
 {
 	
 }
 
 public Automovil2 (String Marca1,String Modelo1,String Color1,String Placa1,int numpas1,int amo1)
 	
 {
 	Marca=Marca1;
 	Modelo=Modelo1;
 	Colores=Color1;
	Placa=Placa1;
 	Numpas=numpas1;
 	amo=amo1;
 }	
 
 public Automovil2 AsignarInformacion()
 {
	 //Crear un objeto de entrada
	InputStreamReader entrada=new InputStreamReader (System.in);
	//Crea el espacio de almacenamiento para el objeto
	BufferedReader flujoEntrada=new BufferedReader(entrada);
	try
	{
 	System.out.println("Dame la Marca");
    datoEntrada = flujoEntrada.readLine();
 	Marca=datoEntrada;
 	System.out.println("Dame el Modelo");
    datoEntrada = flujoEntrada.readLine();
 	Modelo=datoEntrada;
 	System.out.println("Dame el Color");
     datoEntrada = flujoEntrada.readLine();
 	Colores=datoEntrada;
	System.out.println ("ingresa placas");
    datoEntrada = flujoEntrada.readLine();
	Placa=datoEntrada;
 	System.out.println("Numero de pasajeros");
     datoEntrada = flujoEntrada.readLine();
 	Numpas=Integer.parseInt(datoEntrada);
 	System.out.println("Dame el año del modelo");
     datoEntrada = flujoEntrada.readLine();
 	amo=Integer.parseInt(datoEntrada);
	}
	catch(IOException error)
	{
	System.err.println("Error " + error.getMessage());
	}
 	Automovil2 objeto= new Automovil2(Marca,Modelo,Colores,Placa,Numpas,amo);
 	return objeto; 
 }
 	
 public void MostrarInformacion()
 {
 	System.out.println ("=====AUTOMOVIL===========");
 	System.out.println ("La Marca es: " +Marca);
 	System.out.println ("El Modeloes: " +Modelo);
 	System.out.println ("El Color  es: " + Colores);
	System.out.println ("las placas son: " + Placa);
 	System.out.println ("Numero de pasajeros  es: " +Numpas);
 	System.out.println ("Año del automovil: " + amo);
 	
 }	
   
   public void menu(){
	   int op=1;
	   Scanner teclado = new Scanner(System.in);
	    do{
			System.out.println ("MENU");
			System.out.println ("1.-agregar coche");
			System.out.println ("2.-mostrar coche");
			System.out.println ("3.-salir");
			op = teclado.nextInt();
			switch(op) {
				case 1: {
					AsignarInformacion();
				} break;
				case 2: {
					MostrarInformacion();
				} break;
				case 3: {
					System.out.println ("gracias por usar este programa :)");
					op = 4;
				} break;
				default:{
					System.out.println ("opcion invalida");
				}
			}
	    }while(op>=1 && op<=3);
		teclado.close();
   } 
}