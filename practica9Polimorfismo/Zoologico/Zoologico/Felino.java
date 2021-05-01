/**
 * @(#)Felino.java
 *
 *
 * @author
 * @version 1.00 2015/10/3
 */


public class Felino extends Mamiferos{

   protected int bigotes;

    public Felino()
    {
    }

     public Felino (String Nombre1, String Especie1,double Peso1, int Huesos1, int tiempolact, int bigotes )
    {

    	super.Nombre=Nombre1;
    	super.Especie=Especie1;
    	super.Peso=Peso1;
    	super.Huesos=Huesos1;
    	super.tiempolactancia=tiempolact;
    	this.bigotes=bigotes;

    }

        public void Mostrar()
    {
    	super.Mostrar();
    	System.out.println ("No de bigotes = "+ bigotes);

    }


     public void Alimentacion()
    {
    	super.Alimentacion();
    	System.out.println ("Todos los Felinos comen pescado y wiskas");

    }

     public void TiempoVida()

     {
   		super.TiempoVida();
    	System.out.println ("Todos los felinos viven entre 15-20 a�os");

     }



}