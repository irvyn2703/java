import java.io.*;

class Libro implements Serializable {
    private String titulo;
    private String autor;
    private String editorial;
    private int pagina;

    public Libro() {
        titulo = autor = editorial = null;
    }

    public Libro(String t, String a, String e, int pg) {
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

class Disco implements Serializable {
    private String artista;
    private String titulo;
    private int numCancion, duracion;
    private transient double precio;

    public Disco() {
        artista = titulo = null;
    }

    public Disco(String a, String t, int n, int d, double p) {
        titulo = t;
        artista = a;
        numCancion = n;
        duracion = d;
        precio = p;
    }

    public void entrada(BufferedReader ent) throws IOException {
        System.out.print("Cantante: ");
        artista = ent.readLine();
        System.out.print("Titulo: ");
        titulo = ent.readLine();
        System.out.print("Canciones: ");
        numCancion = Integer.parseInt(ent.readLine());
        System.out.print("Duración(minutos): ");
        duracion = Integer.parseInt(ent.readLine());
        System.out.print("Precio: ");
        precio = Double.valueOf(ent.readLine()).doubleValue();
    }
}