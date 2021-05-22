/**
 * @(#)DocenteMedioTiempo.java
 *
 *
 * @author 
 * @version 1.00 2015/10/9
 */
import java.util.Scanner;


public class DocenteMedioTiempo extends Docente {
	
	String Turno;

	Scanner leer=new Scanner(System.in);

    public DocenteMedioTiempo() 
    {
    super();
	System.out.println("Ingresar el turno del Catedratico");
	Turno=leer.next();
    }
    
    
      public void Mostrar_Datos()
	{
        
    super.Mostrar_Datos();
    System.out.println("Turno"+Turno);
           
	}
	
  public double PagoSalario()
  {
  
  	double total=0.0;
  	int dias=0;
  	System.out.println (" Dame los dias trabajados 1-7");
  	dias=leer.nextInt();
    return total=(super.salario*dias);
    
  }

}