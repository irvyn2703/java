import java.util.*;
public class Suplente extends Docente{
    int diasSuplir;

	Scanner leer=new Scanner(System.in);

    public Suplente() 
    {
    super();
	System.out.println("Ingresar el numero de dias que va a suplir el docente");
	diasSuplir=leer.nextInt();
    }
    
    
      public void Mostrar_Datos()
	{
        
    super.Mostrar_Datos();
    System.out.println("Dias a suplir "+ diasSuplir);
           
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
