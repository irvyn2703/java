import java.io.*;
public class IngresarDatos {
    // lectura
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader Entrada = new BufferedReader(entrada);
    private String Nombre, Especie, datoEntrada;
    private double peso;
    private int huesos,lactacia,bigotes;

    IngresarDatos(){
    }  

    public void Datos(){
        try{
            System.out.print("Nombre del felino: ");
            datoEntrada = Entrada.readLine();
            Nombre=datoEntrada;
            System.out.print("Especie del felino: ");
            datoEntrada = Entrada.readLine();
            Especie=datoEntrada;
            System.out.print("Peso: ");
            datoEntrada = Entrada.readLine();
            peso = Double.parseDouble(datoEntrada);
            System.out.print("Huesos: ");
            datoEntrada = Entrada.readLine();
            huesos=Integer.parseInt(datoEntrada);
            System.out.print("Tiempo de lactacia: ");
            datoEntrada = Entrada.readLine();
            lactacia = Integer.parseInt(datoEntrada);
            System.out.print("Numero de bigotes: ");
            datoEntrada = Entrada.readLine();
            bigotes = Integer.parseInt(datoEntrada);
        }catch(IOException error)
        {
        System.err.println("Error " + error.getMessage());
        }
        
        // guardar datos
        Felino cat1=new Felino (Nombre,Especie,peso,huesos,lactacia,bigotes);

        // metodos
		cat1.Mostrar();
		cat1.Alimentacion();
		cat1.TiempoVida();
    }
}
