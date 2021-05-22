import java.io.*;

public class Convertir {
    String contenido = "";
    String convertido = "";

    public void leerArchivo(){
        // lee archivo
        try {
            BufferedReader bf = new BufferedReader(new FileReader("archivo.txt"));
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                contenido = bfRead;
            }
        } catch (IOException er) {
            System.out.println("Error: " + er.getMessage());
        }
    }

    public void procesarArchivo(){
        int espacios = 0;
        for(int i=0; i<contenido.length(); i++){
            if(contenido.charAt(i) == ' '){
                espacios++;
                if(espacios < 2){
                    convertido+=contenido.charAt(i);
                }
            } else
            espacios = 0;
            if(contenido.charAt(i)>='a' && contenido.charAt(i)<='z' || contenido.charAt(i)>='A' && contenido.charAt(i)<='Z'){
                convertido+=contenido.charAt(i);
            }
        }
        System.out.println(convertido);
    }

    public void imprimirArchivo(){
        // imprime archivo
        try {
            FileWriter Registro = new FileWriter("archivo_Final.txt");
            Registro.write(convertido);
            Registro.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
