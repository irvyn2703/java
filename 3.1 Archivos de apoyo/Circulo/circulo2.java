import java.util.Scanner;
public class circulo2 {
    public static final float pi=3.141596f;
    private float radio;
    private punto2 origen;
    private int op=1;

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

    public void menu(){
        Scanner menu = new Scanner(System.in);
        do{
            System.out.println("MENU\n1.-ingresar circulo\n2.-mostrar circulo\n3.-salir");
            op = menu.nextInt();
            switch(op){
                case 1: 
                origen.setXY();
                setRadio();
                break;
                case 2:
                System.out.println("El area del circulo: " + calcArea() + "  Origen: " + "(" + origen.getX() + "," + origen.getY() + ")");
                break;
                case 3:
                System.out.println("gracias por usar este programa :)");
                break;
            }
        } while(op!=3);
        menu.close();
    }
}
