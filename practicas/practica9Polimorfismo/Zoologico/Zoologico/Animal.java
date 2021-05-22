abstract public class Animal {
    protected String Nombre;
    protected String Especie; 
    protected double Peso;

    public Animal() {

    }

    public Animal(String Nombre, String Especie, double Peso){
        this.Nombre = Nombre;
        this.Especie = Especie;
        this.Peso = Peso;
    }

    public void Mostrar(){
        System.out.println("Nombre = " + Nombre);
        System.out.println("Especie = " + Especie);
        System.out.println("Peso = " + Peso);
    }

    abstract public void Alimentacion();

    abstract public void TiempoVida();
}
