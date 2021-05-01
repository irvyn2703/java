public class FuncionF {
  public FuncionF() {
  }

  public int ffibonacci(int n) {
    if (n == 0 || n == 1)
      return n;
    else
      return ffibonacci(n - 1) + ffibonacci(n - 2);
  }
}