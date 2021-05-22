public class gallina extends ave implements vuela {
    public gallina(int plumas, int alas, String pico, String sonido, String nombre) 
    {
    	super(plumas,alas,pico,sonido,nombre);
    	super.comerAve();
    	super.caracteristicasAve();
    }
    public void volarAve() 
    {
    	System.out.println("La gallina " + super.nombre + " esta volando");
    }
    public void poderDelAve(){
        System.out.println("la gallina " + super.nombre + " tiene superfuerza y destroza todo a su paso >:( \n");
    }
}
