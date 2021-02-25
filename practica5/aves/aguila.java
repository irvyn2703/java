public class aguila extends ave implements vuela {
    public aguila(int plumas, int alas, String pico, String sonido, String nombre) 
    {
    	super(plumas,alas,pico,sonido,nombre);
    	super.comerAve();
    	super.caracteristicasAve();
    }
    public void volarAve() 
    {
    	System.out.println("El aguila " + super.nombre + " esta volando");
    }
    public void poderDelAve(){
        System.out.println("El aguila " + super.nombre + " puede detener el tiempo y espacio a voluntad");
        System.out.println("mejor no la molestamos \n");
    }
}
