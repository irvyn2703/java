
package poligono;
public class TestPoligono {
     public static void main(String[] args) {
        Rectangulo rect=new Rectangulo();
        Triangulo trian=new Triangulo();
        rect.setValores(7,4);// o tambien trian
        System.out.println("Area del Rectangulo: "+
                rect.calcArea());
        System.out.println("Area del Triangulo: "+
                trian.calcArea());
    }
}
