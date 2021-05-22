public class ejecuta {
    public static void main(String[] args){
        temperatura temp1 = new temperatura(98.6);
        temp1.convertir();
        temp1.mostrar();
        temperatura temp2 = new temperatura(200);
        temp2.convertir();
        temp2.mostrar();
        temperatura temp3 = new temperatura(45.6);
        temp3.convertir();
        temp3.mostrar();
    }
}
