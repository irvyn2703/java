public class Mamiferos extends Vertebrado {

	protected int tiempolactancia;

    public Mamiferos()

    {

    }

     public Mamiferos(String Nombre1, String Especie1,double Peso1, int Huesos1, int tiempolact )
    {

    	super.Nombre=Nombre1;
    	super.Especie=Especie1;
    	super.Peso=Peso1;
    	super. Huesos=Huesos1;
    	tiempolactancia=tiempolact;
    }


      public void Mostrar()
    {
    	super.Mostrar();
    	System.out.println ("Tiempo de lactancia = "+ tiempolactancia);

    }


     public void Alimentacion()
    {
    	super.Alimentacion();
    	System.out.println ("Todos los mamiferos toman leche");

    }

     public void TiempoVida()

     {
    	super.TiempoVida();
    	System.out.println ("Todos vivene entre 1-80");

     }


}