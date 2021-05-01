import java.io.*;
import java.util.*;
public class Bistec extends Carne implements NoSaludable
{
	String corte;
    public Bistec()
    {
    }
    public Bistec(double pre, double cal, double pes,double grasa,double coles,String cor)
    {
	super.precio=pre;
	super.calorias=cal;
	super.peso=pes;
	super.grsGrasa=grasa;
	super.colesterol=coles;
	corte=cor;
    }
    public Bistec Obtener_Informacion()
    {
	Scanner Leer=new Scanner(System.in);

	System.out.println("Dame corte: ");
	corte=Leer.nextLine();
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


	Bistec objeto5=new Bistec(precio,calorias,peso,grsGrasa,colesterol,corte);

	return objeto5;
    }
    public void comer()
    {
	System.out.println("Comiendo bistec");
    }
    public void empanizar()
    {
 	System.out.println("Empanizando bistec");
    }
    public void cortar()
    {
 	System.out.println("Cortando carne");
    }
    public void condimentar()
    {
	System.out.println("Condimentando carne");
    }
    public void Mostrar_Informacion()
    {
	System.out.println();
	System.out.println("Informacion de Bistec");
	super.Mostrar_Informacion();
	System.out.println("Corte de bistec: "+corte);
    }
	public void Mensaje(){
		System.out.println("el bistec contiene mucha grasa");
	}
}
