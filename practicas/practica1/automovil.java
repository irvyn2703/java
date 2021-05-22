public class automovil extends vehiculo{
    // variables
    private int numAsientos = 5;
    private int numPuertas;

    public automovil(String marcaModelo,int precioDia,int numllantas, int asientos, int puertas){
        super(marcaModelo,precioDia,numllantas);
        numAsientos = asientos;
        numPuertas = puertas;
        System.out.println("ha creado un auto");
    }
    public void mostrarDatos(){
        super.mostrarCaracteristicas();
        System.out.println( "Asientos: " + numAsientos);
        System.out.println( "Puertas: " + numPuertas);
    }
    public void pruebaDelMotor(){
        super.encenderMotor();
        super.apagarMotor();
        super.funciona();
    }
}
