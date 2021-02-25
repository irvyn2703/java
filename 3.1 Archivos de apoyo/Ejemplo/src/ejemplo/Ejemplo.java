package ejemplo;
import java.util.Scanner;
public class Ejemplo {
    //declara una constante
    public static final int NUMERO = 12;
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
       int Num=0; 
       int Res; 
      System.out.println("Ingresa un número: "); 
      Num = entrada.nextInt();
      System.out.println(Num+"^2 = "+ Num*Num);
      System.out.println(NUMERO+"*3 = "+NUMERO*3);
     }
    }
    
