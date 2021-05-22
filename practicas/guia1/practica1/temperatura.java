public class temperatura {
    double gradosF;
    double gradosC;

    public temperatura(double F){
        gradosF = F;
    }

    public double convertir() {
        gradosC = gradosF-32;
        gradosC = gradosC*5/9;
        return gradosC;
    }
    public void mostrar() {
        System.out.println("los grados farenheit son: " + gradosF);
        System.out.println("los grados celsius: " + gradosC + "\n");
    }
}
