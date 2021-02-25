import java.util.Scanner;
public class Celular {
        private String modelo;
        private float precio;

        public Celular() {
                modelo = "";
                precio = 0.0f;
        }

        public void DatosCelular() {
                Scanner teclado = new Scanner(System.in);
                System.out.println("ingresa el modelo");
                modelo = teclado.nextLine();
                System.out.println("ingresa el precio");
                precio = teclado.nextFloat();
        }

        public String getModelo() {
                return modelo;
        }

        public float getPrecio() {
                return precio;
        }
}
