import java.io.*;
import java.util.Scanner;
public class EjecutaLibros {
	
	public static void main(String []args)
	{
		int num=20;
		int op=0;
		Scanner lec=new Scanner(System.in); 
		Libro a[]=new Libro[num];
		Libro a1=new Libro();
		do
		{
		//System.out.print("Ingresa el n�mero de libros:");
		//	num=lec.nextInt();
		System.out.println("******MENU******");
		System.out.println("1. Registrar libros");
		System.out.println("2. Consultar libros");
		System.out.println("3, Salir");
		System.out.println("Ingrese la opcion deseada: ");
		op=lec.nextInt();
		
			switch (op)
		{
			case 1:
				System.out.print("Ingresa el n�mero de libros:");
				num=lec.nextInt();
				a1.ingresalectura(num,a);
				break;
			case 2:
				a1.mostrarinformacion(num,a);
				break;
			default:
				System.out.println("Salir");
		}
		}
		while (op!=3);
		System.out.println("Despues de la seccion");
		
	}
    
}