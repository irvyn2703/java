import java.util.Scanner;
public class Documento {
    private String texto;

    public Documento(){ 
        texto = "no hay nada en el documento";
    }

    public void getTexto(){
        System.out.println("escribe lo que quieres imprimir");
        Scanner teclado = new Scanner(System.in);
        texto = teclado.nextLine();
    }

    public String contenido() {
        return texto;
    }
}
