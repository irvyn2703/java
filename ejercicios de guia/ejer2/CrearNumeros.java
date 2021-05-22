import java.io.*;

public class CrearNumeros{
    InputStreamReader entrada = new InputStreamReader (System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;

    int[] nums;
    int n;
    boolean cumple = true;

    public CrearNumeros(){
        System.out.println("ingresa el tamaño del arreglo");
        do{
            try{
                datoEntrada = flujoEntrada.readLine();
                n = Integer.parseInt(datoEntrada);
            }catch(Exception e){
                System.out.println("Error " + e.getMessage());
                cumple = false;
            }

        }while (cumple == false);
        nums = new int[n];
    }

    public void ingresarNumeros(){
        int numAleatorio;
        boolean repite = false;
        for (int i = 0; i < n; i++) {
            do {
                numAleatorio = (int) (Math.random() * 200);
                if(numAleatorio%2 != 0){
                    repite = true;
                }else{
                    repite = false;
                }
            } while (repite == true);
            nums[i] = numAleatorio;
        }
    }

    public String verNumeros() {
        String cadena = "";
        for (int i = 0; i < n; i++) {
            cadena = cadena + nums [i] + "\n";
        }
        return cadena;
    }

    public double promedio(){
        double promedio=0;
        for(int i=0; i<n ; i++){
            promedio = promedio + (double) nums[i];
        }
        promedio = promedio / (double) n;
        return promedio;
    }

    public void guardar(){
        String nombre = "";
        do{
            System.out.println("ingresa un nombre al archivo");
            try{
                datoEntrada = flujoEntrada.readLine();
                nombre = datoEntrada;
            }catch(Exception e){
                System.out.println("Error " + e.getMessage());
                cumple = false;
            }
        }while (cumple == false);
        try {
            FileWriter Registro = new FileWriter(nombre + ".txt");
            Registro.write(verNumeros());
            Registro.write("el promedio es: " + promedio());
            Registro.close();
        } catch (IOException er) {
            System.out.println("Error: " + er.getMessage());
        }
    }
}