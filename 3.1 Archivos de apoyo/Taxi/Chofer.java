import java.util.Scanner;
public class Chofer {
    private String nombre;

    public Chofer() {
        nombre = "";
    }

    public void nomChofer() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa el nombre del conductor");
        nombre = teclado.nextLine();
    }

    public String obtenerNombre() {
        return nombre;
    }
}
