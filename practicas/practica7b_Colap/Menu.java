import java.util.Scanner;

public class Menu {
    int num = 20;
    int op = 0;
    String buscar;
    boolean ascendente, titulo;
    Scanner lec = new Scanner(System.in);
    Pelicula a[] = new Pelicula[num];
    Pelicula a1 = new Pelicula();

    public void menu() {
        do {
            System.out.println("******MENU******");
            System.out.println("1. Registrar peliculas");
            System.out.println("2. Consultar peliculas");
            System.out.println("3. Ordenar Peliculas por id");
            System.out.println("4. Ordenar Peliculas por precio");
            System.out.println("5. Buscar Pelicula por titulo");
            System.out.println("6. Buscar Pelicula por actor");
            System.out.println("7. Guardar archivos");
            System.out.println("8. Salir");
            System.out.println("Ingrese la opcion deseada: ");
            op = lec.nextInt();

            switch (op) {
            case 1:
                System.out.print("Ingresa el numero de peliculas:");
                num = lec.nextInt();
                a1.ingresalectura(num, a);
                break;
            case 2:
                a1.mostrarinformacion(num, a);
                break;
            case 3:
                System.out.println("como desea ordenarlo:\n1.Mayor a menor\n2.Menor a mayor");
                do {
                    op = lec.nextInt();
                    switch (op) {
                    case 1:
                        ascendente = false;
                        a1.ordenarPorId(ascendente, a);
                        break;
                    case 2:
                        ascendente = true;
                        a1.ordenarPorId(ascendente, a);
                        break;
                    default:
                        System.out.println("opcion invalida. Prueba otra vez");
                    }
                } while (op < 1 && op > 2);
                break;
            case 4:
                System.out.println("como desea ordenarlo:\n1.Mayor a menor\n2.Menor a mayor");
                do {
                    op = lec.nextInt();
                    switch (op) {
                    case 1:
                        ascendente = false;
                        a1.ordenarPorPrecio(ascendente, a);
                        break;
                    case 2:
                        ascendente = true;
                        a1.ordenarPorPrecio(ascendente, a);
                        break;
                    default:
                        System.out.println("opcion invalida. Prueba otra vez");
                    }
                } while (op < 1 && op > 2);
                break;
            case 5:
                titulo = true;
                a1.buscar(titulo,a);
            break;
            case 6:
                titulo = false;
                a1.buscar(titulo,a);
            break;
            case 7:
                a1.guardar(a);
            break;
            case 8:
                System.out.println("gracias por ocupar este programa :)");
            break;
            default:
                System.out.println("opcion invalida");
            }
        } while (op != 8);
        lec.close();
    }
}