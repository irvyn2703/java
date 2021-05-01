import java.io.*;

public class Menu {
    // atributos
    int op=0;
    ProductoVentas productos = new ProductoVentas();

    // lectura
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;

    // metodos
    public void menu() {
        try{
            do {
                System.out.println("*********************************************************************");
                System.out.println("MENU\n0.-salir\n1.-ingresar producto y precio\n2.-ingresar ventas de productos\n3.-ver reporte de ventas\n4.-ver sucursales con mayor y menor ventas\n5.-ver el producto mas y menor vendido\n6.-guardar archivo");
                datoEntrada = flujoEntrada.readLine();  
                op = Integer.parseInt(datoEntrada);
                switch(op){
                    case 0:
                    System.out.println("gracias por usar este programa :)");
                    break;
                    case 1:
                    productos.ingresarProducto();
                    break;
                    case 2:
                    productos.ingresarVentas();
                    break;
                    case 3:
                    productos.verReporte();
                    break;
                    case 4:
                    productos.sucursalVentas();
                    break;
                    case 5:
                    productos.productoVendido();
                    break;
                    case 6:
                    productos.guardar();
                    break;
                    default: System.out.println("opcion invalida");
                }
            } while (op != 0);
        }catch (IOException error)
        {
           System.err.println("Error " + error.getMessage());
        }
    }
}
