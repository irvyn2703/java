import java.util.Scanner;
public class Perro {
    String nombre;
    int edad;
    void printPerro(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    public Perro(){
        nombre=""; 
        edad=0;
    }
    public void leerPerro(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa el nombre del perro");
        nombre= teclado.nextLine(); 
        System.out.println("ingresa la edad de " + nombre);
        edad= teclado.nextInt();
    }
    public void ladrar(){
        System.out.println("Uauu, Uauu");
    }
    public void dormir(){
        System.out.println("Zzzz...Zzzz");
    }
    
    public static void main(String[] args) {
        Perro perrito=new Perro();
        perrito.leerPerro();
        perrito.printPerro();
        perrito.ladrar();
        perrito.dormir();
    } 
}
