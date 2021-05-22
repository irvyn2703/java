import java.io.*;

public class Libreria {
    public static void main(String[] a) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tipo = "";
        File mf = new File("libreria.dat");
        ObjectOutputStream fobj = null;
        Libro libro = new Libro();
        Disco disco = new Disco();
        Revista revista = new Revista();
        boolean mas = true;
        try {
            fobj = new ObjectOutputStream(new FileOutputStream(mf));
            do {
                System.out.println("Seleccione la opcion:");
                System.out.println("L-libro");
                System.out.println("D-disco");
                System.out.println("R-revista");
                System.out.println("F-finalizar)");
                tipo = br.readLine();
                switch (tipo) {
                    case "L":
                    case "l":
                        libro = new Libro();
                        libro.entrada(br);
                        fobj.writeObject(libro);
                        break;
                    case "D":
                    case "d":
                        disco = new Disco();
                        disco.entrada(br);
                        fobj.writeObject(disco);
                        break;
                        case "R":
                        case "r":
                            revista = new Revista();
                            revista.entrada(br);
                            fobj.writeObject(revista);
                            break;
                    case "F":
                    case "f":
                        fobj.close();
                        mas = false;
                }
            } while (mas != false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
