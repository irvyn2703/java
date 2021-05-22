
// Copia el contenido de un archive en otro.
import java.io.*;

class CopyFile {
    public static void main(String args[]) throws IOException {
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        try {
            fin = new FileInputStream("ejem1.txt");
            fout = new FileOutputStream("ejem2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.....");
            return;
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo de salida");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Formato: CopyFile falta alguno Origen Destino");
            return;
        }
        // copya el archivo
        try {
            do {
                i = fin.read();
                if (i != -1)
                    fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error...");
        }
        fin.close();
        fout.close();
    }
}