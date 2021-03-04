import java.util.Scanner;
public class menu {
    private int op;

    public menu(){
        Scanner teclado = new Scanner(System.in);
        Rectangulo rect = new Rectangulo();
        Triangulo trian = new Triangulo();
        do{
            System.out.println("MENU\n1.-crear rectangulo\n2.-crear triangulo\n3.-mostrar rectangulo\n4.-mostrar triangulo\n5.-salir");
            op= teclado.nextInt();
            switch (op){
                case 1:
                    System.out.println("--------RECTANGULO---------");
                    rect.setValores();
                    break;
                case 2:
                    System.out.println("--------TRIANGULO----------");
                    trian.setValores();
                    break;
                case 3:
                    System.out.println("--------RECTANGULO---------");
                    System.out.println("base: " + rect.base + "     altura: " + rect.altura);
                    System.out.println("el area del rectangulo es: " + rect.calcArea());
                    break;
                case 4:
                    System.out.println("--------TRIANGULO---------");
                    System.out.println("base: " + trian.base + "     altura: " + trian.altura);
                    System.out.println("el area del triangulo es: " + trian.calcArea());
                    break;
                case 5:
                    System.out.println("gracias por usar este programa");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        } while(op!=5);
        teclado.close();
    }
}
