import java.util.*;
public class Ejecuta_Comida
{

    public static void main(String ar[])
    {
	int op,i;
	//declaracion de arreglo
	Comida[] mesa=new Comida[10];
	Scanner leer=new Scanner(System.in);
	
	for(i=0;i<10;i++)
	{

	    System.out.println("Escoja el tipo de comida: \n1.-Fruta \n2.-Tuberculo \n3.-Hamburguesa \n4.-Bistec \n5.-Pizza");
	    op=leer.nextInt();
	    switch (op)
	    {

		case 1: Fruta frut=new Fruta();
			mesa[i]=new Fruta();
	    		frut=(Fruta) mesa[i]; 
	    		frut.Obtener_Informacion();
			mesa[i].Mostrar_Informacion();
			mesa[i].comer();
	    		frut.pelar();
		break;
		
		case 2: Tuberculo tuber=new Tuberculo();
			mesa[i]=new Tuberculo();
	    		tuber=(Tuberculo) mesa[i];
	    		tuber.Obtener_Informacion();
			mesa[i].Mostrar_Informacion();
			mesa[i].comer();
	    		tuber.pelar();
	    		tuber.cortar();
		break;
	
		case 3:Hamburguesa hambu=new Hamburguesa();
			mesa[i]=new Hamburguesa();
	    		hambu=(Hamburguesa) mesa[i];
	    		hambu.Obtener_Informacion();
			mesa[i].Mostrar_Informacion();
			hambu.empanizar();
			hambu.cortar();
			hambu.freir();
			hambu.Mensaje();
			mesa[i].comer();
		break;

		case 4: Bistec bis=new Bistec();
			mesa[i]=new Bistec();
	    		bis=(Bistec) mesa[i];
	    		bis.Obtener_Informacion();
				bis.Mensaje();
			mesa[i].Mostrar_Informacion();
			mesa[i].comer();
	    		bis.empanizar();
	    		bis.cortar();
	    		bis.condimentar();
		break;

		case 5: Pizza pizza=new Pizza();
			mesa[i]=new Pizza();
	    		pizza=(Pizza) mesa[i]; 
	    		pizza.Obtener_Informacion();
				pizza.Mensaje();
			mesa[i].Mostrar_Informacion();
			mesa[i].comer();
		break;

		default: System.out.println("opcion invalida");
	    }
	}
    }
}
