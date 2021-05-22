import java.io.*;
public class ArchivoTexto {
    public static void main(String[] args){
        try {
            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("prueba.txt")));
            salida.println("Ejemplo de escritura a un archivo");
            salida.println("Segunda linea");
            salida.close();
            BufferedReader entradas = new BufferedReader(new FileReader("prueba.txt"));
            String s1,s2 = new String();
            while((s1 = entradas.readLine()) != null)
                s2 += s1 + "\n";
                System.out.println("Archivo: " + "\n" + s2);
                entradas.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
