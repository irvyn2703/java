/**
 * @(#)EjecutaAutomovil2.java
 *
 *
 * @author 
 * @version 1.00 2021/2/23
 */

import java.io.*;

public class EjecutaAutomovil2 {

  

public static void main(String args[])
{
//Crear un objeto de entrada
InputStreamReader entrada=new InputStreamReader (System.in);
//Crea el espacio de almacenamiento para el objeto
BufferedReader flujoEntrada=new BufferedReader(entrada);
String datoEntrada;
String Modelo1;
String Color1;
int NumPasajeros1;
String Marca1;
int Amo1;

try
{
//pasos a intanciar la clase
//se declara, crea e instancia el objeto de la clase
//pasos a intanciar la clase
//se declara, crea e instancia el objeto de la clase


System.out.println("------------ Lectura de datos por teclado ------------");
System.out.print("Teclee modelo: ");
datoEntrada = flujoEntrada.readLine();
Modelo1 = datoEntrada;
System.out.print("Teclee color: ");
datoEntrada = flujoEntrada.readLine();
Color1 = datoEntrada;
System.out.print("Teclee numero de pasajeros: ");
datoEntrada = flujoEntrada.readLine();
NumPasajeros1 = Integer.parseInt(datoEntrada);
System.out.print("Tecle marca: ");
datoEntrada = flujoEntrada.readLine();
Marca1 = datoEntrada;
System.out.print("Tecle año: ");
datoEntrada = flujoEntrada.readLine();
Amo1 = Integer.parseInt(datoEntrada);

Automovil2 objAutomovil = new Automovil2(Modelo1,Color1,NumPasajeros1,Marca1,Amo1);

objAutomovil.Obtener_Datos();
}
catch(IOException error)
{
System.err.println("Error " + error.getMessage());
}
}
}