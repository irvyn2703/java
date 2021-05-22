import java.io.Serializable;

public class Marcador implements Serializable {
    // 10 mejores
    String[] nombres = new String[11];
    int[] minutos = new int[11];
    int[] segundos = new int[11];
    int[] segundosTotales = new int[11];

    // ultimo jugador
    String nombreU;
    int minuto, segundo;

    int minutoMinimo = 0, segundoMinimo = 0;

    // contador
    int cont = 0;

    public void agregar(String nom, int min, int seg) {
        nombreU = nom;
        minuto = min;
        segundo = seg;
    }

    public void quicksort(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int pivoteM = minutos[izq];
        int pivoteS = segundos[izq];
        String pivoteSt = nombres[izq];
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;
        String aux1;

        while (i < j) { // mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j)
                i++; // busca elemento mayor que pivote
            while (A[j] > pivote)
                j--; // busca elemento menor que pivote
            if (i < j) { // si no se han cruzado
                aux = A[i]; // los intercambia
                A[i] = A[j];
                A[j] = aux;

                aux1 = nombres[i];
                nombres[i] = nombres[j];
                nombres[j] = aux1;

                aux = minutos[i];
                minutos[i] = minutos[j];
                minutos[j] = aux;

                aux = segundos[i];
                segundos[i] = segundos[j];
                segundos[j] = aux;
            }
        }

        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        nombres[izq] = nombres[j];
        minutos[izq] = minutos[j];
        segundos[izq] = segundos[j];

        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        nombres[j] = pivoteSt;
        minutos[j] = pivoteM;
        segundos[j] = pivoteS;

        if (izq < j - 1)
            quicksort(A, izq, j - 1); // ordenamos subarray izquierdo
        if (j + 1 < der)
            quicksort(A, j + 1, der); // ordenamos subarray derecho

    }

    public void obtenerMinimo(){
        if(cont == 0){
            minutoMinimo = 0;
            segundoMinimo = 0;
        }else{
            minutoMinimo = minutos[cont-1];
            segundoMinimo = segundos[cont-1];
        }
    }

    public void ingresarMejores() {
        // comprueba si hay lugares y si no hay comprueba si es major que el ultimo
        // lugar
        if (cont <= 9) {
            nombres[cont] = nombreU;
            minutos[cont] = minuto;
            segundos[cont] = segundo;
            segundosTotales[cont] = segundo + (minuto * 60);

            cont++;
        } else {
            if (minuto <= minutoMinimo) {
                if (minuto == minutoMinimo) {
                    if (segundo < segundoMinimo) {
                        nombres[cont - 1] = nombreU;
                        minutos[cont - 1] = minuto;
                        segundos[cont - 1] = segundo;
                        segundosTotales[cont - 1] = segundo + (minuto * 60);
                    }
                }
            }
        }
    }

}
