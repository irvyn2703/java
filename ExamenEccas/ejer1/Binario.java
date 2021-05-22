// 201963582 irvyn xicale cabrera
public class Binario {
    public String convertir(int n) {
        if (n == 0) {
            return "" + n;
        } else {
            convertir(n / 2);
            System.out.print(n % 2);
            return "" + convertir(n/2) + n%2 ;
        }
    }
}
