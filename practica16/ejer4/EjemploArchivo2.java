import java.io.*;
public class EjemploArchivo2 {
    static DataOutputStream ap; 
    static DataInputStream ap2; 

    public static void abreArchivoEscribir(String s){
        try{
            ap = new DataOutputStream(new FileOutputStream(s));
        }catch (IOException e){
            System.err.println("no se abrio el archivo " + e.toString());
            System.exit(1);
        }
    }

    public static void abreArchivoLeer(String s){
        try{
            ap2= new DataInputStream(new FileInputStream(s));
        }catch (IOException e){
            System.err.println("no se abrio el archivo " + e.toString());
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        abreArchivoEscribir("otroArchivo.dat");
        try{
            ap.writeInt(5);
            ap.writeInt(7);
            ap.writeUTF("hola");
            ap.writeDouble(4.56);
            ap.flush();
            ap.close();
        }catch (IOException e){
            abreArchivoLeer("otroArchivo.dat");
            try{
                System.out.println(ap2.readInt());
                System.out.println(ap2.readInt());
                System.out.println(ap2.readUTF());
                System.out.println(ap2.readDouble());
                ap2.close();
            }catch (IOException er){}
        }
    }
}
