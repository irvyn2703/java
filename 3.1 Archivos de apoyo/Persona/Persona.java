import java.util.Scanner;
public class Persona {
        private String nombre;
        private int edad;
        private Celular cell;

        public Persona() {
                nombre = "";
                edad = 0;
                cell = new Celular();
        }

        public Persona(String nom, int ed, Celular ce) {
                nombre = nom;
                edad = ed;
                cell = ce;
        }

        public void printPersona() {
                System.out.println("La Persona: " + nombre + " de Edad: " + edad + " Años" + "\n" + " TIENE Modelo de Celular: " + cell.getModelo() + " de Precio: $" + cell.getPrecio());
        }

        public static void main(String[] args) {
                Scanner teclado1 = new Scanner(System.in);
                System.out.println("ingresa el nombre del dueño");
                String n = teclado1.nextLine();
                System.out.println("ingresa la edad de " + n);
                int e = teclado1.nextInt();
                Celular celular = new Celular();
                celular.DatosCelular();
                Persona persona = new Persona(n, e, celular);
                persona.printPersona();
        }
}
