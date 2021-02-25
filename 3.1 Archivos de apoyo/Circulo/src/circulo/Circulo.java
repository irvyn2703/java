package circulo;

/*Programación II online*/
public class Circulo {
    public static final float miPi = 3.141596f;
    private float radio;
    private Punto Origen; 

    public Circulo() {
        radio = 0.0f;
        Origen = new Punto();
    }

    public Circulo(float rad, Punto orig) {
        radio = rad;
        Origen = orig;
    }

    public float calcArea() {
        return miPi * radio * radio;
    }

    public void setRadio(float r) {
        radio = r;
    }

    public float getRadio() {
        return radio;
    }

    public static void main(String[] args) {
        Punto origen = new Punto(-3, 7);
        Circulo circ1 = new Circulo(2.56f, origen);
        Circulo circ2 = new Circulo(5.6f, new Punto(0, 0));
        System.out.println("El area del circulo: " + circ1.calcArea() + "  Origen: " + "(" + origen.getX() + "," + origen.getY() + ")");
    }
}
