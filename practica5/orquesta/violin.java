public class violin extends instrumento implements afinando {
     public violin(String nombre) {
         super(nombre);
         System.out.println("el violinista " + nombre);
     }   
     public void afinar(){
         System.out.println("se esta afinando el instrumento de " + super.nombre);
         System.out.println("ya esta afinando");
     }
}
