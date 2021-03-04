import java.util.Scanner;
public class punto2 {
    private float x;
    private float y;

    public punto2(){
        x=0;
        y=0;
    }
    public punto2(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }

    public void setXY(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa X: ");
        x = teclado.nextFloat();
        System.out.println("ingresa Y: ");
        y = teclado.nextFloat();
    }
    public void mostrar(){
        System.out.println("origen: (" + x + "," + y + ")");
    }
}
