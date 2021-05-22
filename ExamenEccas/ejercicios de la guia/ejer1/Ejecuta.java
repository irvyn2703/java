public class Ejecuta {
    
    public static void main(String[] args){
        CrearNumero numero = new CrearNumero();
        numero.numeroAleatorio();
        System.out.println("numeros generados:");
        System.out.println(numero.verNumeros());
        numero.burbuja();
        System.out.println("numeros ordenados");
        System.out.println(numero.verNumeros());
        numero.guardar();
    }
}
