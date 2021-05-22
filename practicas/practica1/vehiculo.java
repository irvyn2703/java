public class vehiculo{
    protected int precioDia;
    protected String marcaModelo;
    protected int numllantas;

    // constructor
    public vehiculo(String marcaModelo1, int precioDia1, int numllantas1) {
        marcaModelo = marcaModelo1;
        precioDia = precioDia1;
        numllantas = numllantas1;
        System.out.println("construyo el vehiculo");
    }

    // metodos
    public void mostrarCaracteristicas(){
        System.out.println("Marca: " + marcaModelo);
        System.out.println("Precio: " + precioDia);
        System.out.println("Numero de llantas: " + numllantas);
    }
    public void encenderMotor(){
        System.out.println("el motor se encendio");
    }
    public void apagarMotor(){
        System.out.println("el motor se apago");
    }
    public void funciona(){
        System.out.println("el motor de " + marcaModelo + " funciona correctamente");
    }
}