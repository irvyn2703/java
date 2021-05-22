/**
 * @(#)DocenteTiempoCompleto.java
 *
 *
 * @author 
 * @version 1.00 2015/10/7
 */
import java.util.Scanner;

public class DocenteTiempoCompleto extends Docente 
{
    int cubiculo;

    Scanner leer=new Scanner(System.in);
    
    public DocenteTiempoCompleto()
	{
	
	super();
	Scanner leer=new Scanner(System.in);
	System.out.println("Ingresar No de cubiculo del Catedratico");
	cubiculo=leer.nextInt();
    }
    public void Mostrar_Datos()
	{
        
    super.Mostrar_Datos();
    System.out.println("Cubiculo"+cubiculo);
           
	}
	
  public double PagoSalario()
  {
  
  	double total=0.0;
  	int dias=0;
  	System.out.println (" Dame los dias trabajados 1-15");
  	dias=leer.nextInt();
    return total=(super.salario*dias);
    
  }
         
}