public class potencia{

    public int potenciaRecursion (int m, int n) {
        if (n==0) {
             return 1;
        } else  { 
            return m * potenciaRecursion (m, n-1); 
        }
    }

}