public class Funcion_mcd {
  public Funcion_mcd() {
  }

  public int mcd(int m, int n) {
    if (n <= m && m % n == 0)
      return n;
    else if (m < n)
      return mcd(n, m);
    else
      return mcd(n, m % n);
  }
}