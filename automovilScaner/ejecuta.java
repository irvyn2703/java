//Fecha:
//Objetivo:
//Autor:
import java.io.*;


public class ejecuta
{

 public static void main(String args[])
 {
 	automovil auto1=new automovil();
 	auto1=auto1.AsignarInformacion();
 	auto1.MostrarInformacion();
 	
 	automovil auto2=new automovil("VW","JETTA","NEGRO",5,2016);
 	auto2.MostrarInformacion();
 }   
    
}