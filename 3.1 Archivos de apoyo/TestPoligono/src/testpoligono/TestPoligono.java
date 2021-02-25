package testpoligono;
public class TestPoligono {
    public static void main(String[] args) {
        Rectangulo rect=new Rectangulo(8,4);
        Triangulo trian=new Triangulo(8,4);
        System.out.println("Area del Rectangulo: "+
                rect.calcArea());
        System.out.println("Area del Triangulo: "+
                trian.calcArea());
    }
}


    

