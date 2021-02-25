package taxi;
/**
Progrmación II online
 */
public class Taxi {
private String matricula;
private Chofer chofer;
public Taxi(){matricula=""; chofer=null;}
public Taxi(String mat,Chofer chfr){matricula=mat;
chofer=chfr;}
public void mostrarChofer(){
        System.out.println("Nombre Chofer:"+
                chofer.obtenerNombre());
    }
    public void mostrarMatricula(){
        System.out.println("Matricula del Taxi:"+
                matricula);
    }
    public static void main(String[] args) {
    Chofer chofer=new Chofer("Anastacio Pérez");    
    Taxi TaxiYaris= new Taxi("ATM5379",chofer);
    TaxiYaris.mostrarMatricula();
    System.out.println(" lo maneja el Operador ...");
    TaxiYaris.mostrarChofer();
    }
}
