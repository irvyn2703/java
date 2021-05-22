import java.io.*;
public class TextoS{
    public static void main(String[] args){
        FileInputStream entrada = null;
        OutputStream salida = null;
        try{
            entrada = new FileInputStream("origen.txt");
            salida = new FileOutputStream("destino.txt");
            int c;
            while ((c = entrada.read()) != -1){
                salida.write(c);
            }
        }catch(FileNotFoundException e){
            System.out.println("fichero no encontrado");
        }catch(IOException e){
            System.out.println("Error de E/S");
        }
        if(entrada != null)try{
            entrada.close();
        }catch(IOException e){}
        if (salida != null)try{
            salida.close();
        }catch(IOException e){}
    }
}