import java.io.*;
import java.util.Scanner;

public class Ejecuta{
public static void main(String[] args) throws IOException
	{

    		int n;
    		Scanner lec=new Scanner(System.in);
    		System.out.println("dar numero de elementos en el arreglo");
    		n=lec.nextInt();
        	int arreglo1[]=new int[n];
    		OrdenacionesBusqueda objeto=new OrdenacionesBusqueda();
    		objeto.aleatorios(arreglo1,n);
    		objeto.burbuja(arreglo1);
    		objeto.muestra(arreglo1,"Ordenado por Burbuja ");
    		objeto.guardar(arreglo1,n);
    		System.out.println("dar numero de elemento a buscar en el arreglo");
    		n=lec.nextInt();
    		int indice=objeto.busquedaBin(arreglo1,n);
    		if (indice!=-1)
    		{
    			System.out.println("El numero "+n+" se encuentra en posicion " + (indice+1)+ " en el arreglo");
    		}
    		else
    		{
    			System.out.println("El numero "+n+" no se encuentra en el arreglo");
    		}

	}

}