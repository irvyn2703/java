public class Ejecuta {
    public static void main(String[] args){
        Convertir c = new Convertir();
        c.leerArchivo();
        System.out.println(c.contenido);
        c.procesarArchivo();
        c.imprimirArchivo();
    }
}
