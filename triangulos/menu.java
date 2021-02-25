import java.util.Scanner;

public class menu {
    public int op=1;
    public void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("ingresa el primer lado:");
            int lado1 = teclado.nextInt();
            System.out.println("ingresa el segundo lado:");
            int lado2 = teclado.nextInt();
            System.out.println("ingresa el tercer lado:");
            int lado3 = teclado.nextInt();
            triangulo triangulo = new triangulo(lado1, lado2, lado3);
            triangulo.mostrar();
            System.out.println("\n\t¿desea ingresar otro triangulo? (1=si 0=no)");
            op = teclado.nextInt();
        } while (op == 1);
        teclado.close();
    }
}