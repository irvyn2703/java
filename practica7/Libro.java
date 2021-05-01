import java.io.*;
import java.util.Scanner;

public class Libro 
{
	public Libro() 
	{	
	}
    String nombre;
    int isbn;
    double precio;
    int numpag;
	int pos=0;
    String editorial;
    public Libro(String nom,int isbn1,double prec, int pag, String edit)
    {
    	nombre=nom;
    	isbn=isbn1;
    	precio=prec;
    	numpag=pag;
    	editorial=edit;
    }
    public void ingresalectura(int tam,Libro libros[ ])
    {
    	int i,is,num;
    	double prize;
    	String name;
    	String edi;
    	Scanner lec=new Scanner(System.in);
    	System.out.println("Ingrese la informaci�n de los libros");
    		for(i=0;i<tam;i++)
    		{
    			System.out.println("libro "+(i+1)+" de "+tam);
    			System.out.print("Nombre:");
    			name=lec.next();
    			System.out.print("Editorial:");
    			edi=lec.next();
    			System.out.print("Numero de Paginas:");
    			num=lec.nextInt();
    			//datoEntrada = flujoEntrada.readLine();
    			//name=datoEntrada;
    			System.out.print("ISBN:");
    			is=lec.nextInt();
    			//datoEntrada = flujoEntrada.readLine();
    			//is = Integer.parseInt(datoEntrada);
    			System.out.print("precio:");
    			//datoEntrada = flujoEntrada.readLine();
    			//prize=Double.parseDouble(datoEntrada);
    			prize=lec.nextDouble();
    			libros[pos]= new Libro(name,is,prize,num,edi);
				pos++;
    		}// fin de for
    }// fin de metodo
    public void  mostrarinformacion(int tam,Libro libros[])
    {
    	int i;
    	double may=0,men=10000; // variables inicializadoras
    	for(i=0;i<pos;i++)
    	{
			int j=i+1;
			System.out.println("libro " + j);
    		System.out.println("Libro:"+libros[i].nombre);
    		System.out.println("Editorial:"+libros[i].editorial);
    		System.out.println("Numero de paginas:"+libros[i].numpag);
    		System.out.println("ISBN:"+libros[i].isbn);
    		System.out.println("PRECIO:"+libros[i].precio);
			System.out.println("");
    		if(libros[i].precio>may)
    			may=libros[i].precio;
    		if(libros[i].precio<men)
    			men=libros[i].precio;
    	}
    	System.out.println("El libro de mayor precio cuesta:"+may);
    	System.out.println("El libro de menor precio cuesta:"+men);
    }
 }

