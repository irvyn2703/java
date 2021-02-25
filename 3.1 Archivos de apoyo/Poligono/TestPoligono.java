public class TestPoligono {
        public static void main(String[] args) {
                Rectangulo rect = new Rectangulo();
                Triangulo trian = new Triangulo();
                System.out.println("RECTANGULO");
                rect.setValores();
                System.out.println("TRIANGULO");
                trian.setValores();
                System.out.println("Area del Rectangulo: " + rect.calcArea());
                System.out.println("Area del Triangulo: " + trian.calcArea());
        }
}
