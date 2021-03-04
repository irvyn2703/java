import java.io.*;
public class Ejecuta {
    public static void main(String[] args) throws IOException {
        int numero = 0;
        double resultado = 0;
        String datoEntrada;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);
        try 
        {
            System.out.println("Dar numero de elementos en el arreglo");
            datoEntrada = flujoEntrada.readLine();
            numero = Integer.parseInt(datoEntrada);
        } catch (IOException error) {
            System.err.println("Error " + error.getMessage());
        }
        // Crear objeto
        Arreglo a1 = new Arreglo(numero);
        a1.ponerValorEn(numero);
        a1.visualizarVector(a1);
        resultado = a1.calcula_promedio(numero);
        System.out.println("el promedio de los numeros es " + resultado);
        System.out.println("el numero mayor es: " + a1.mayor());
        System.out.println("el numero menor es: " + a1.menor());
    }
}
