import java.util.*;
public class Pizza extends Comida implements NoSaludable{
    String nombre;
    public Pizza()
    {
    }
    public Pizza(double pre, double cal, double pes,String nom)
    {
	super.precio=pre;
	super.calorias=cal;
	super.peso=pes;
	nombre=nom;
    }
    public Pizza Obtener_Informacion()
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

	Pizza objeto=new Pizza(precio,calorias,peso,nombre);

	return objeto;
    }
    public void comer()
    {
	System.out.println("Comiendo Pizza");
    }
    public void Mostrar_Informacion()
    {
	System.out.println();
	System.out.println("Informacion de la Pizza");
	super.Mostrar_Informacion();
	System.out.println("Nombre de la Pizza: "+nombre);
    }

    public void Mensaje(){
        System.out.println("la pizza puede dañar tu salud");
    }
}
