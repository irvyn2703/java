/**
 * @(#)Automovil2.java
 *
 *
 * @author 
 * @version 1.00 2021/2/23
 */


//Fecha
//Objetivo
//Autor
import java.io.*;
public class Automovil2{
String Modelo;
String Colorcarro;
int NumPasajeros;
String Marca;
int Amo;

public Automovil2()
{
Modelo="";
Colorcarro="";
NumPasajeros=0;
Marca="";
Amo=0;	
}

public Automovil2(String Modelo1,String Colorcarro1, int NumPasajeros1, String Marca1, int Amo1)
{
Modelo=Modelo1;
Colorcarro=Colorcarro1;
NumPasajeros=NumPasajeros1;
Marca=Marca1;
Amo=Amo1;
}
public void Asignar_Modelo(String Modelo1 )
{
Modelo=Modelo1;
}
public void Asignar_Color(String Colorcarro1 )
{
Colorcarro=Colorcarro1;
}
public void Asignar_NumPasajeros(int NumPasajeros1 )
{
NumPasajeros=NumPasajeros1;
}
public void Asignar_Marca(String Marca1 )
{
Marca=Marca1;
}
public void Asignar_Amo(int Amo1 )
{
Amo=Amo1;
}
public void Obtener_Datos()
{
System.out.println("");
System.out.println("Modelo: " +Modelo);
System.out.println("Color: " +Colorcarro);
System.out.println("Numero de Pasajeros: " +NumPasajeros);
System.out.println("Marca: " +Marca);
System.out.println("Año: " +Amo);
}
}