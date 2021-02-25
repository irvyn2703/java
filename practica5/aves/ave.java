public class ave {
    int plumas;
	int alas;
    int numAve;
	String pico;
	String sonido;
	String nombre;
	static int cont=0;
    public ave(int plumas,int alas, String pico, String sonido, String nombre)
    {
        this.plumas=plumas;
        this.alas=alas;
        this.pico=pico;
        this.sonido=sonido;
        this.nombre=nombre;
        cont++;
        // numAve=cont;
    }
    public ave()
    { }
    public void comerAve()
    {
        System.out.println("");
        System.out.println("Toda ave come semillas ");
    }
    public void caracteristicasAve()
    {
        System.out.println("Ave "+cont);
        System.out.println("Nombre:"+nombre);
        System.out.println("Tam del pico:"+pico);
        System.out.println("Tipo de sonido:"+sonido);
        System.out.println("");
    }
}
