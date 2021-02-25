public class instrumento{
    String nombre;

    public instrumento(String nombre){
        this.nombre = nombre;
    }
    public void descrip(){
        System.out.println("nombre: " + nombre);
    }
    public void tocar(){
        System.out.println("suena muy bien");
    }
    public void tocarD(){
        System.out.println("suena muy desafinado");
    }
}