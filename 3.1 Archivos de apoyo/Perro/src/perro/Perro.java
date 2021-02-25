/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro;
/*
 Programacion II online
 */
public class Perro {
    String nombre;
    int edad;
    void printPerro(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    public Perro(){nombre=""; edad=0;}
    public Perro(String n, int e){nombre=n; edad=e;}
    public void ladrar(){System.out.println("Uauu, Uauu");}
    public void dormir(){System.out.println("Zzzz...Zzzz");}
    
    public static void main(String[] args) {
        Perro perrito=new Perro("Coraje",3);
        perrito.printPerro();
        perrito.ladrar();
        perrito.dormir();
    } 
}
