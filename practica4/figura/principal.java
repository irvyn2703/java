public class principal {
    public static void main(String[] args){
        cuadrado c = new cuadrado();
        c.cambiaAncho(10);
        rectangulo r = new rectangulo();
        r.cambiaAncho(20);
        r.cambiaAlto(30);
        rombo rombo = new rombo();
        rombo.cambiaAncho(30);
        rombo.cambiaDiagm(10);
        rombo.cambiaDiagM(20);

        System.out.println("Perimetro del cuadrado = " + c.obtenPerimetro());
        System.out.println("Area del cuadrado = " + c.obtenArea());
        System.out.println("Perimetro del rectangulo = " + r.obtenPerimetro());
        System.out.println("Area del rectangulo = " + r.obtenArea());
        System.out.println("Perimetro del rombo = " + rombo.obtenPerimetro());
        System.out.println("Area del rombo = " + rombo.obtenArea());
    }
}
