import java.util.Scanner;
public class circulo2 {
    public static final float pi=3.141596f;
    private float radio;
    private punto2 origen;

    public circulo2(){
        radio = 0.0f;
        origen = new punto2();
    }
    public circulo2(float rad,punto2 orig){
        radio = rad;
        origen =orig;
    }

    public float calcArea() {
        return pi * radio * radio;
    }

    public void setRadio() {
        Scanner tecladoC = new Scanner(System.in);
        System.out.println("ingresa el radio:");
        radio = tecladoC.nextFloat();
        // tecladoC.close();
    }

    public float getRadio() {
        return radio;
    }


    public static void main(String[] args) {
        punto2 orig = new punto2();
        orig.setXY();
        circulo2 circ1 = new circulo2(0.0f, orig);
        circ1.setRadio();
        System.out.println("El area del circulo: " + circ1.calcArea() + "  Origen: " + "(" + orig.getX() + "," + orig.getY() + ")");
    }
}
