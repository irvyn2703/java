import java.util.Scanner;

public class Libro {
    public String nombre;
    public int isn;
    public double precio;

    ///////// CONSTRUCTORES//////////////
    public Libro() {
    }

    public Libro(String nom, int i, double prec) {
        this.nombre = nom;
        this.isn = i;
        this.precio = prec;
    }

    public void lectura(int tam, Libro libros[]) {
        int i, is;
        double prize;
        String name;
        Scanner lec = new Scanner(System.in);
        System.out.println("Ingrese la información de los libros");
        for (i = 0; i < tam; i++) {
            System.out.println("libro " + (i + 1) + " de " + tam);
            System.out.print("Nombre:");
            name = lec.next();
            System.out.print("ISBN:");
            is = lec.nextInt();
            System.out.print("precio:");
            prize = lec.nextDouble();
            libros[i] = new Libro(name, is, prize);
        }
    }

public void mostrar(int tam,Libro libros[])
{
int i;
double may=‐10000,men=10000; // variables inicializadoras
for(i=0;i<tam;i++)
{
System.out.println("Libro:"+libros[i].nombre);
System.out.println("ISBN:"+libros[i].isbn);
System.out.println("PRECIO:"+librosmetodo[i].precio);
if(librosmetodo[i].precio>may)
may=librosmetodo[i].precio;
if(librosmetodo[i].precio<men)
men=librosmetodo[i].precio;
}
System.out.println("El libro de mayor precio cuesta:"+may);
System.out.println("El libro de menor precio cuesta:"+men);
}