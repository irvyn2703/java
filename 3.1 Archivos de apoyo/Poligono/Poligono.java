import java.util.Scanner;
public class Poligono {
    protected int base;
    protected int altura;

    public void setValores() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa la base de la figura");
        base = teclado.nextInt();
        System.out.println("ingresa la altura de la figura");
        altura = teclado.nextInt();
    }

    public int calcArea() {
        return 0;
    }

}
