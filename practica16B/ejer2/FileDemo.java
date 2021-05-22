import java.io.File;

class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String args[]) {
        File f1 = new File("ejer1/ejer1.java");
        p("Archivo: " + f1.getName());
        p("Directorio: " + f1.getPath());
        p("Directorio Absoluto: " + f1.getAbsolutePath());
        p("Padre: " + f1.getParent());
        p(f1.exists() ? "Existe" : "No Existe");
        p(f1.canWrite() ? "Se Puede Escribir" : "No Se Puede Escribir");
        p(f1.canRead() ? "Se Puede Leer" : "No Se Puede Leer");
        p((f1.isDirectory() ? " " : "No") + "Es Un Directorio");
        p(f1.isFile() ? "Es Un Archivo Normal" : "Podria Ser Un Enlace Con Nombre");
        p("Ultima Modificacion " + f1.lastModified());
        p("Tamaño del Archivo " + f1.length() + " Bytes");
    }
}
