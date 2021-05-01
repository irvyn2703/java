/**
 * @(#)Ventas.java
 *
 *
 * @author
 * @version 1.00 2017/10/14
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ventas {

	String nombre;
	String modelo;
	int precio;

	public Ventas()
	{
	}

    public Ventas(String nombre1, String modelo1, int precio1)
    {
    	nombre=nombre1;
    	modelo=modelo1;
    	precio=precio1;

    }

   public void setNombre (String nombre1)
   {
     nombre=nombre1;

    }

     public void setModelo (String modelo1)
   {
     modelo=modelo1;

    }

    public void setPrecio (int precio1)
   {
     precio=precio1;

   }

   public static void main(String args[])

   {

   	ArrayList <Ventas> lista=new ArrayList<Ventas>();
    int   opc;
   	boolean uso=true;

   	while(uso)
   	{
   	 opc=Integer.parseInt(JOptionPane.showInputDialog("1. Introdcuir\n " +"2. Eliminar \n"+"3. Buscar\n"+"4. Mostrar\n" +"5. Modificar\n"+"6. Eliminar todos los elementos \n" +"7. Salir \n"));
   	 String  listado="";

   	 switch (opc)
   	 	{
   	 	case 1:
   	 		     String nombre=JOptionPane.showInputDialog ("Introducir el nombre del cliente");
   	 		     String modelo=JOptionPane.showInputDialog ("Introducir modelo del coche");
   	 		     int precio=Integer.parseInt(JOptionPane.showInputDialog ("Introducir el precio"));
   	 		     lista.add(new Ventas (nombre, modelo, precio));
   	 		     for (int i=0; i<lista.size();i++)
   	 		     {
   	 		     	listado+= (i+1)+ "Cliente" + lista.get(i).nombre
   	 		     		           + "\n"  + "Modelo" + lista.get(i).modelo
   	 		     		           + "\n"  + "Precio" + lista.get(i).precio + "\n\n";
   	 		     }JOptionPane.showMessageDialog(null, listado);
   	 		     break;
   	 	case 2:

   	 		     if (lista.isEmpty())
   	 			{
   	        	JOptionPane.showMessageDialog(null, "    Lista Vacia", "", JOptionPane.WARNING_MESSAGE);
   	             }
   	 	       else
   	 	       {

   	 	  	    String cliente_eliminar=JOptionPane.showInputDialog ("Introducir el nombre del cliente a eliminar");
   	 	  	    String resultado_eliminar="Cliente No existe";

   	 		     for (int i=0; i<lista.size();i++)
   	 		     {
   	 		     	if (lista.get(i).nombre.equals (cliente_eliminar))
   	 		     	{

   	 		     		lista.remove(i);
   	 		     		resultado_eliminar="Dato eliminado";
   	 		     		JOptionPane.showMessageDialog(null, resultado_eliminar);
   	 		     	}
   	 		     }
   	 		     if (resultado_eliminar.equals("Cliente No existe"))
   	 		           JOptionPane.showMessageDialog(null, "Cliente no existe en la lista");

   	 			}
   	 		     break;
   	 	case 3:

   	 		String resultado_busqueda="Nombre no encontrado";
   	 		if (lista.isEmpty())
   	 			{
   	        	JOptionPane.showMessageDialog(null, "    Lista Vacia", "", JOptionPane.WARNING_MESSAGE);
   	             }
   	 	  else
   	 			{
   	 				String cliente_buscar=JOptionPane.showInputDialog ("Introducir el nombre del cliente a buscar	");
   	 		        for (int i=0; i<lista.size();i++)
   	 		        {
   	 		         if (lista.get(i).nombre.equals(cliente_buscar))
   	 		         {
                    resultado_busqueda="Nombre encontrado";
   	 		     	resultado_busqueda += "\n"+ " Cliente" + lista.get(i).nombre+ "\n"  + "Modelo" + lista.get(i).modelo + "\n"  + "Precio" + lista.get(i).precio;
   	 		     	JOptionPane.showMessageDialog(null, resultado_busqueda);
   	 		         }
   	 		        }
   	 		        if (resultado_busqueda.equals("Nombre no encontrado"))
   	 		           JOptionPane.showMessageDialog(null, resultado_busqueda);
   	 		  }
   	 			break;
   	 		case 4:
   	 		// si esta vacia
   	 		if (!lista.isEmpty())
   	 		{

   	 		   for (int i=0; i<lista.size();i++)
   	 		     {
   	 		     	listado+= (i+1)+ "Cliente" + lista.get(i).nombre
   	 		     		           + "\n"  + "Modelo" + lista.get(i).modelo
   	 		     		           + "\n"  + "Precio" + lista.get(i).precio + "\n\n";
   	 		     }JOptionPane.showMessageDialog(null, listado);
   	        } else
   	        {
   	        	JOptionPane.showMessageDialog(null, "    Lista Vacia", "", JOptionPane.WARNING_MESSAGE);
   	        }
   	        	break;
   	       case 5:
   	            String cliente_modificar=JOptionPane.showInputDialog ("Introducir el nombre del cliente a modificar	");
   	            String nuevo_nombre=JOptionPane.showInputDialog ("Introducir el nombre nuevo del Cliente ");
   	            String nuevo_modelo=JOptionPane.showInputDialog ("Introducir el modelo nuevo ");
   	            int nuevo_precio=Integer.parseInt(JOptionPane.showInputDialog ("Introducir el precio nuevo"));
   	            for (int i=0; i<lista.size();i++)
   	 		     {
   	 		      	if (lista.get(i).nombre.equals (cliente_modificar))
   	 		     	{
   	                 lista.get(i).setNombre(nuevo_nombre);
   	                 lista.get(i).setModelo(nuevo_modelo);
   	                 lista.get(i).setPrecio(nuevo_precio);
   	               listado+=  "Cliente" + lista.get(i).nombre
   	 		     		      + "\n"  + "Modelo" + lista.get(i).modelo
   	 		     		       + "\n"  + "Precio" + lista.get(i).precio;
   	 		      JOptionPane.showMessageDialog(null, listado);
   	 		     	}
   	 		    }
   	 		break;
   	 		case 6:
   	 			lista.clear();
   		        JOptionPane.showMessageDialog(null, "    Lista Vacia", "", JOptionPane.WARNING_MESSAGE);
   		        break;
   		    case 7:
   		    	uso=false;
   		    	break;
   		    default:
   		    		JOptionPane.showMessageDialog(null, "Opcion novalida");
   		    		break;
   	    }
    }


   }

}