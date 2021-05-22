public class motocicleta extends vehiculo{
    // variables
    private double tamMoto;

    public motocicleta(String marcaModelo,int precioDia,int numllantas, double tam){
        super(marcaModelo,precioDia,numllantas);
        tamMoto = tam;
        System.out.println("ha creado un auto");
    }
    public void mostrarDatos(){
        super.mostrarCaracteristicas();
        System.out.println( "Tamaño de la moto: " + tamMoto + "cm");
    }
    public void pruebaDelMotor(){
        super.encenderMotor();
        super.apagarMotor();
        super.funciona();
    }
}
