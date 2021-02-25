public class gallina {
    static int numGallina=1;
    pluma plumas;
    ala ala1, ala2;
    pico pico;
    pata patas;
    Double cAla1, cAla2;

    // constructor
    public gallina(String colPluma, int numPluma,Double tamAla,Double tamAla1,String larPico,String colPico,String colPata){
        plumas = new pluma(colPluma,numPluma);
        ala1 = new ala(tamAla);
        ala2 = new ala(tamAla1);
        pico = new pico(larPico,colPico);
        patas = new pata(colPata);
    }

    // metodos
    public void verInfo() {
        System.out.println("informacion de la gallina " + numGallina);
        System.out.println("numero de plumas: " + plumas.verCantidad());
        System.out.println("color de las plumas " + plumas.verColor());
        System.out.println("el tamaño de la ala 1 es: " + ala1.verTama());
        System.out.println("el tamaño de la ala 2 es: " + ala2.verTama());
        System.out.println("el largo de su pico es: " + pico.verLargo());
        System.out.println("el color de su pico es: " + pico.verColor());
        System.out.println("el color de sus patas es: " + patas.verColor());
        System.out.println("");
        numGallina++;
    }
}
