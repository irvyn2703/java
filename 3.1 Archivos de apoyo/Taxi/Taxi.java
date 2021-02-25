import java.util.Scanner;
public class Taxi {
        private String matricula;
        private Chofer chofer;

        public Taxi() {
                matricula = "";
                chofer = null;
        }

        public Taxi(String mat, Chofer chfr) {
                matricula = mat;
                chofer = chfr;
        }

        public String mostrarChofer() {
                return chofer.obtenerNombre();
        }

        public String mostrarMatricula() {
                return matricula;
        }

        public static void main(String[] args) {
                Scanner teclado1 = new Scanner(System.in);
                Chofer chofer = new Chofer();
                chofer.nomChofer();
                System.out.println("ingresa las placas del taxi:");
                String taxi=teclado1.nextLine();
                Taxi TaxiYaris = new Taxi(taxi, chofer);
                TaxiYaris.mostrarMatricula();
                System.out.println(" el conductor es " + TaxiYaris.mostrarChofer() + " con placas: " + TaxiYaris.mostrarMatricula());
                TaxiYaris.mostrarChofer();
        }
}
