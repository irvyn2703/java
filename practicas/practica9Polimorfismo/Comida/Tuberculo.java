import java.io.*;
import java.util.*;
public class Tuberculo extends Comida
{
	double grsFibra;
	String temporada;
    public Tuberculo()
    {
    }
    public Tuberculo(double pre, double cal, double pes,double fibra,String tem)
    {
	super.precio=pre;
	super.calorias=cal;
	super.peso=pes;
	grsFibra=fibra;
	temporada=tem;
    }
    public Tuberculo Obtener_Informacion()
    {
	Scanner Leer=new Scanner(System.in);

	System.out.println("Dame temporada del tuberculo: ");
	temporada=Leer.nextLine();
	System.out.println("Dame precio: ");
	super.precio=Leer.nextDouble();
	System.out.println("Dame calorias: ");
	super.calorias=Leer.nextDouble();
	System.out.println("Dame peso: ");
	super.peso=Leer.nextDouble();
	System.out.println("Dame los gramos de fibra: ");
	grsFibra=Leer.nextDouble();

	Tuberculo objeto2=new Tuberculo(precio,calorias,peso,grsFibra,temporada);

	return objeto2;
    }
    public void comer()
    {
	System.out.println("Comiendo tuberculo");
    }
    public void pelar()
    {
 	System.out.println("Pelando tuberculo");
    }
    public void cortar()
    {
 	System.out.println("Cortando tuberculo");
    }
    public void Mostrar_Informacion()
    {
	System.out.println();
	System.out.println("Informacion del tuberculo");
	super.Mostrar_Informacion();
	System.out.println("Gramos de fibra: "+grsFibra);
	System.out.println("Temporada: "+temporada);
    }
}
