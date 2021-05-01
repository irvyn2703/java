import java.util.Scanner;
class EjecutaLibros {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.println("PROGRAMA DE REGISTRO DE LIBROS");
        System.out.print("Ingresa el número de libros :");
        int num = lec.nextInt();
        Libro a[] = new Libro[num]; // SE DECLARA EL ARREGLO DE OBJETOS LIBROS
        Libro a1 = new Libro();// Se crea un objeto de la clase libro para llamar a los métodos de clase libro
        a1.lectura(num, a);
        a1.mostrar(num, a);
    }
}
