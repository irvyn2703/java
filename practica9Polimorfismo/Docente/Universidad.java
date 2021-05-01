import java.util.Scanner;

public class Universidad 
{
  
  
   
    public static void main(String a[])
    {
    	
    	int op,i;
    	double total=0;
    	Docente maestros[]=new Docente[2];
    	Scanner leer=new Scanner(System.in);
    	for(i=0;i<2;i++){
    	
    	System.out.println("Escoja el tipo de docente: \n1.-Tiempo completo\n2.-Medio tiempo\n3.-Suplente");
    	op=leer.nextInt();
    	switch (op)
    	{
    		case 1:	maestros[i]=new DocenteTiempoCompleto();
    				maestros[i].Mostrar_Datos();
    				System.out.println("Pago Total"+maestros[i].PagoSalario());
    				break;
    		case 2:	maestros[i]=new DocenteMedioTiempo();
    				maestros[i].Mostrar_Datos();
    				System.out.println("Pago Total"+maestros[i].PagoSalario());
    				break;
			case 3:	maestros[i]=new Suplente();
    				maestros[i].Mostrar_Datos();
    				System.out.println("Pago Total"+maestros[i].PagoSalario());
    				break;
    		default: System.out.println("opcion invalida");
    	}
    	}
    	for(i=0;i<2;i++){
    		total+=maestros[i].PagoSalario();
    	}
    	System.out.println("Pago Total"+total);

    }
    
    
}