public class F_mergesort {

  public F_mergesort() {
  }

  static void mergesort(double[] a, int primero, int ultimo) {
    int central;
    if (primero < ultimo) {
      central = (primero + ultimo) / 2;
      mergesort(a, primero, central);
      mergesort(a, central + 1, ultimo);
      mezcla(a, primero, central, ultimo);
    }
  }

  // mezcla de dos sublistas ordenadas
  static void mezcla(double[] a, int izda, int medio, int drcha) {
    double[] tmp = new double[a.length];
    int i, k, z;
    i = z = izda;
    k = medio + 1;
    // bucle para la mezcla, utiliza tmp[] como arreglo auxiliar
    while (i <= medio && k <= drcha) {
      if (a[i] <= a[k])
        tmp[z++] = a[i++];
      else
        tmp[z++] = a[k++];
    }
    // se mueven elementos no mezclados de sublistas
    while (i <= medio)
      tmp[z++] = a[i++];
    while (k <= drcha)
      tmp[z++] = a[k++];
    // Copia de elementos de tmp[] al arreglo a[]
    System.arraycopy(tmp, izda, a, izda, drcha - izda + 1);
  }
}