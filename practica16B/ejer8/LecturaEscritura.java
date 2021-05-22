import java.io.*;

//Clase LecturaEscritura main
public class LecturaEscritura {
    // método de escritura de un arreglo a un archivo de objetos
    public static void setEscritura() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tipo = "";
        String vrnombre, vrcurp = "";
        int vredad;
        int i = 0;
        File f = new File("datos2.obj");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("dame el número de Personas a ingresar");
        int num = Integer.parseInt(br.readLine());
        Personas arreglo[] = new Personas[num];
        try {
            for (i = 0; i < num; i++) {
                System.out.println("**************************");
                System.out.println("Dame nombre:");
                vrnombre = br.readLine();
                System.out.println("Dame edad:");
                vredad = Integer.parseInt(br.readLine());
                System.out.println("Dame CURP:");
                vrcurp = br.readLine();
                System.out.println("**************************");
                // creamos el objeto en el arreglo
                arreglo[i] = new Personas(vrnombre, vredad, vrcurp);
                // mandamos a escribir el primero objeto del arreglo al archivo
                oos.writeObject(arreglo[i]);
            }
        } catch (IOException error) {
            System.err.println("Error " + error.getMessage());
        } finally {
            // cerramos el archivo de objetos
            oos.close();
        }
    }

    // método de lectura de objetos y pasar a un arreglo
    public static void getLectura() throws ClassNotFoundException, IOException {
        int i = 0, num = 1;
        ObjectInputStream ois = null;
        try {
            File f = new File("datos2.obj");
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Personas arreglo1[] = new Personas[10];
            while (true) {
                Personas p = (Personas) ois.readObject();
                // pasamos el objeto al arreglo en la posición 0
                arreglo1[i] = p;
                // mostramos desde el archivo
                System.out.println("******Registro**** " + (num++));
                System.out.println("Nombre :" + p.getNombre());
                System.out.println("Edad : " + p.getEdad());
                System.out.println("CURP: " + p.getCurp());
                System.out.println("**************************");
                // Mostramos desde el arreglo
                System.out.println("******Arreglo**** " + i);
                System.out.println("Nombre: " + arreglo1[i].nombre);
                System.out.println("Edad: " + arreglo1[i].edad);
                System.out.println("CURP: " + arreglo1[i].curp);
                // incrementamos posición en el arreglo
                i++;
            }
        } catch (IOException io) {
            System.out.println("\n*********** Fin************");
        } finally {
            // creamos archivo
            ois.close();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        setEscritura();
        getLectura();
    }
}
