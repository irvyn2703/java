import java.io.*;
import java.util.*;
public abstract class Carne extends Comida
{
	double grsGrasa;
	double colesterol;
    public Carne()
    {
    }
    public Carne(double pre, double cal, double pes,double grasa,double coles)
    {
	super.precio=pre;
	super.calorias=cal;
	super.peso=pes;
	grsGrasa=grasa;
	colesterol=coles;
    }
    abstract public void comer();
    abstract public void empanizar();
    public void cortar()
    {
 	System.out.println("Cortando carne");
    }
    public void Mostrar_Informacion()
    {
	System.out.println();
	super.Mostrar_Informacion();
	System.out.println("Gramos de grasa: "+grsGrasa);
	System.out.println("Colesterol: "+colesterol);
    }
}
