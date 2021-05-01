import java.io.*;

public class principal_R1 {
    public static void main(String[] args) {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);
        String datoEntrada;
        int n=0;
        FuncionF serie = new FuncionF();
        System.out.println(".::Sucesion de Fibonacci::.");
        System.out.print("Digite el tamaño de l arreglo de fibonacci que desea ingresar: ");
        try{
            datoEntrada = flujoEntrada.readLine();
            n = Integer.parseInt(datoEntrada);
        }catch(Exception e ){
            System.out.println("Error " + e.getMessage());
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + serie.ffibonacci(i));
        }
    }
}
