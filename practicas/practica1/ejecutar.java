public class ejecutar {
    public static void main(String[] args){
        // automovil
        automovil v1 = new automovil("volvo 550",120,4,5,4);
        v1.mostrarDatos();
        v1.pruebaDelMotor();

        // moto
        motocicleta m1 = new motocicleta("Italika",50,2,120);
        m1.mostrarDatos();
        m1.pruebaDelMotor();
    }
}
