import java.io.FileWriter;
import java.io.IOException;

public class CrearNumero {
    int tamano = 10;

    int[] nums = new int[tamano];
    int[] bloqueo = new int[tamano];
    boolean repite = false;
    int numAleatorio;

    public CrearNumero() {
        for (int i = 0; i < tamano; i++) {
            bloqueo[i] = -1;
        }
    }

    public void numeroAleatorio() {
        for (int i = 0; i < tamano; i++) {
            do {
                numAleatorio = (int) (Math.random() * 200);
                for (int j = 0; j < i; j++) {
                    if (numAleatorio == bloqueo[j]) {
                        repite = true;
                    }
                }
            } while (repite == true);
            nums[i] = numAleatorio;
            bloqueo[i] = numAleatorio;
        }
    }

    public String verNumeros() {
        String cadena = "";
        for (int i = 0; i < tamano; i++) {
            cadena = cadena + nums [i] + "\n";
        }
        return cadena;
    }

    public void burbuja() {
        int auxiliar;
        for (int i = 2; i < tamano; i++) {
            for (int j = 0; j < tamano - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    auxiliar = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = auxiliar;
                }
            }
        }
    }

    public void guardar(){
        try {
            FileWriter Registro = new FileWriter("resultado.txt");
                Registro.write(verNumeros());
            Registro.close();
        } catch (IOException er) {
            System.out.println("Error: " + er.getMessage());
        }
    }
}
