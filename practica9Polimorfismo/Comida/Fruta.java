import java.util.*;
public class Fruta extends Comida
{
	String nombre;
    public Fruta()
    {
    }
    public Fruta(double pre, double cal, double pes,String nom)
    {
	super.precio=pre;
	super.calorias=cal;
	super.peso=pes;
	nombre=nom;
    }
    public Fruta Obtener_Informacion()
    {
	//METODO	
	Scanner  Leer=new Scanner(System.in);

	System.out.println("Dame nombre: ");
	nombre=Leer.nextLine();
	System.out.println("Dame precio: ");
	super.precio=Leer.nextDouble();
	System.out.println("Dame calorias: ");
	super.calorias=Leer.nextDouble();
	System.out.println("Dame peso: ");
	super.peso=Leer.nextDouble();

	Fruta objeto=new Fruta(precio,calorias,peso,nombre);

	return objeto;
    }
    public void comer()
    {
	System.out.println("Comiendo fruta");
    }
    public void pelar()
    {
 	System.out.println("Pelando fruta");
    }
    public void Mostrar_Informacion()
    {
	System.out.println();
	System.out.println("Informacion de la fruta");
	super.Mostrar_Informacion();
	System.out.println("Nombre de la fruta: "+nombre);
    }
}
