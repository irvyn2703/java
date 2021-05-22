/**
 * @(#)Vertebrado.java
 *
 *
 * @author
 * @version 1.00 2015/10/3
 */


public class Vertebrado extends Animal{

    protected int Huesos;

    public Vertebrado()
    {
    }

     public Vertebrado(String Nombre1, String Especie1,double Peso1, int Huesos1 )
    {

    	super.Nombre=Nombre1;
    	super.Especie=Especie1;
    	super.Peso=Peso1;
    	Huesos=Huesos1;
    }

    public void Mostrar()
    {
    	super.Mostrar();
    	System.out.println ("Huesos = "+ Huesos);

    }


     public void Alimentacion()
    	{
    	System.out.println ("Todos los Animales Vertebrados comen carne");

    }

     public void TiempoVida()
     {
    	System.out.println ("Todos viven entre 1-100 a�os");

     }


}