public class ganzo extends ave implements vuela {
    public ganzo(int plumas, int alas, String pico, String sonido, String nombre) 
    {
    	super(plumas,alas,pico,sonido,nombre);
    	super.comerAve();
    	super.caracteristicasAve();
    }
    public void volarAve() 
    {
    	System.out.println("El ganzo " + super.nombre + " esta volando");
    }
    public void poderDelAve(){
        System.out.println("El ganzo " + super.nombre + " tiene supervelocidad por que tiene los tenis del rayo mcqueen \n");
    }
}
