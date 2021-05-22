import java.io.*;
public class Revista implements Serializable {
    private String titulo;
    private String autor;
    private String editorial;
    private int pagina;

    public Revista() {
        titulo = autor = editorial = null;
    }

    public Revista(String t, String a, String e, int pg) {
        titulo = t;
        autor = a;
        editorial = e;
        pagina = pg;
    }

    public void entrada(BufferedReader ent) throws IOException {
        System.out.print("Titulo: ");
        titulo = ent.readLine();
        System.out.print("Autor: ");
        autor = ent.readLine();
        System.out.print("Editorial: ");
        editorial = ent.readLine();
        System.out.print("Páginas: ");
        pagina = Integer.parseInt(ent.readLine());
    }
}