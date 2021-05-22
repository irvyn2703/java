public class piano extends instrumento implements afinando{
    public piano(String nombre){
        super(nombre);
        System.out.println("el pianista " + nombre);
    }
    public void afinar(){
        System.out.println("se esta afinando el piano de " + super.nombre);
         System.out.println("ya esta afinando");
    }
}
