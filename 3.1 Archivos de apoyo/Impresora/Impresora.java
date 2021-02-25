import java.util.Scanner;
public class Impresora {
    private String modelo;
   
    public Impresora(){
        System.out.println("ingresa el modelo de la impresora:");
        Scanner teclado1 = new Scanner(System.in);
        modelo = teclado1.nextLine();
    }

    public String getModelo(){
        return modelo;
    }

    public void imprimir(Documento documento){
        System.out.println("la impresora " + getModelo());
        System.out.println("imprimiendo el documento");
        System.out.println(documento.contenido());
    }

    public static void main(String[] args) {
        Impresora impresora =new Impresora();
        Documento documento = new Documento();
        documento.getTexto();
        impresora.imprimir(documento);
    }
}
