import java.io.*;
public class ArchivoTexto {
    public static void main(String[] args){
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("datos.txt"));
            out.write("Esta ");
            out.write("es ");
            out.write("la primera linea");
            out.newLine();
            out.write("Y esta ");
            out.write("es la segunda linea");
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
