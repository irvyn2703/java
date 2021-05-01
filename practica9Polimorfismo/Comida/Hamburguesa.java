import java.io.*;
import java.util.*;
public class Hamburguesa extends Carne implements NoSaludable
{
	String tipo;
    public Hamburguesa()
    {
    }
    public Hamburguesa(double pre, double cal, double pes,double grasa,double coles,String tip)
    {
	super.precio=pre;
	super.calorias=cal;
	super.peso=pes;
	super.grsGrasa=grasa;
	super.colesterol=coles;
	tipo=tip;
    }
    public Hamburguesa Obtener_Informacion()
    {
	Scanner Leer=new Scanner(System.in);

	System.out.println("Dame tipo: ");
	tipo=Leer.nextLine();
	System.out.println("Dame precio: ");
	super.precio=Leer.nextDouble();
	System.out.println("Dame calorias: ");
	super.calorias=Leer.nextDouble();
	System.out.println("Dame peso: ");
	super.peso=Leer.nextDouble();
	System.out.println("Dame los gramos de grasa: ");
	super.grsGrasa=Leer.nextDouble();
	System.out.println("Dame cantidad de colesterol: ");
	super.colesterol=Leer.nextDouble();

	Hamburguesa objeto4=new Hamburguesa(precio,calorias,peso,grsGrasa,colesterol,tipo);

	return objeto4;
    }
    public void comer()
    {
	System.out.println("Comiendo hamburguesa");
    }
    public void empanizar()
    {
 	System.out.println("Empanizando carne para hamburguesa");
    }
    public void cortar()
    {
 	System.out.println("Cortando carne");
    }
    public void freir()
    {
	System.out.println("Friendo carne");
    }
    public void Mostrar_Informacion()
    {
	System.out.println();
	System.out.println("Informacion de hamburguesa");
	super.Mostrar_Informacion();
	System.out.println("tipo de hamburguesa: "+tipo);
    }

	public void Mensaje(){
		System.out.println("las hamburguesas son poco saludables");
	}
}
