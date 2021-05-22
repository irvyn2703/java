import java.util.Scanner;

public class principal_R4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Funcion_mcd operar = new Funcion_mcd();
        System.out.println("Programa que calcula el minimo comun dividor de 2 numeros");
        int num1, num2;
        System.out.print("Digite un numero: ");
        num1 = entrada.nextInt();
        System.out.print("Digite un segundo numero: ");
        num2 = entrada.nextInt();
        System.out.print("El minimo comun divisor es: " + operar.mcd(num1, num2) + "\n");
    }
}
