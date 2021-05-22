public class Ejecuta {
    public static void main(String[] args){
        Archivo archivo = new Archivo();
        archivo.verNombres();
        archivo.quicksort(archivo.nombres, 0, archivo.nom-1);
        System.out.println("\n\tnombres ordenados");
        archivo.verNombres();
    }
}
