import java.io.*;

public class Arreglo {
    private double[] arreglo; // declaración arreglo
    private int nElementos; // número de elementos del arreglo
    // Crear un arreglo con 10 elementos por omisión

    public Arreglo() // número de elementos por omisión: 10
    {
        nElementos = 10;
        arreglo = new double[nElementos];
    }

    // Crear un arreglo de ne elementos del usuario
    public Arreglo(int ne) // ne elementos
    {
        if (ne < 1 || ne>10) {
            System.out.println("Nº de elementos no válido: " + ne);
            System.out.println("Se asignan 10 elementos");
            ne = 10;
        }
        nElementos = ne;
        arreglo = new double[nElementos];
    }

    // leer datos
    public void ponerValorEn(int i) {
        int valor;
        String datoEntrada;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);
        if (i >= 0 || i < nElementos) {
            for (i = 0; i < arreglo.length; i++)
            {
                try
                {
                    System.out.println("Dar elementos");
                    datoEntrada = flujoEntrada.readLine();
                    valor = Integer.parseInt(datoEntrada);
                    arreglo[i] = valor;
                } catch (IOException error)
                {
                    System.err.println("Error " + error.getMessage());
                }
            }
        } else
            System.out.println("Indice fuera de limites");
    }

    // valida datos
    public double valorEn(int i)
    {
        if (i >= 0 && i < nElementos)
            return arreglo[i];
        else
        {
            System.out.println("Indice fuera de limites");
            return Double.NaN;
        }
    }

    public int longitud() {
        return nElementos;
    }

    public void visualizarVector(Arreglo v)
    {
        int ne = v.longitud();
        for (int i = 0; i < ne; i++)
            System.out.print(v.valorEn(i) + " ");
        System.out.println();
    }

    public double calcula_promedio(int num) {
        int i;
        double promedio = 0;
        double suma = 0;
        for (i = 0; i < arreglo.length; i++)
            suma = (suma + arreglo[i]);
        System.out.println("la suma de los numeros es " + suma);
        promedio = suma / num;
        return (promedio);
    }

    public double mayor(){
        double mayor = arreglo[0];
        for(int i=0; i<arreglo.length; i++){
            if(mayor<arreglo[i]){
                mayor=arreglo[i];
            }
        }
        return mayor;
    }

    public double menor(){
        double menor = arreglo[0];
        for(int i=0; i<arreglo.length; i++){
            if(menor>arreglo[i]){
                menor=arreglo[i];
            }
        }
        return menor;
    }

}