import java.io.*;
//Solo se pueden convertir objetos a Object, pero no tipos primitivos
//No se puede convertir int a Object
class EjemploArregloObjetos {
    public static void main(String[] args) {
        try{
            // lectura
            InputStreamReader entrada = new InputStreamReader(System.in);
            BufferedReader flujoEntrada = new BufferedReader(entrada);
            String datoEntrada;
    
            // con1
            System.out.println("con1");
            ArregloObjetos con1 = new ArregloObjetos();
            System.out.println("Longitud:" + con1.Longitud());
            con1.Imprime();
    
            // con 2
            System.out.println("con2");
            System.out.println("Ingresa la longitud");
            datoEntrada = flujoEntrada.readLine();  
            int tam=Integer.parseInt(datoEntrada);
            Integer[] a = new Integer[tam];
            ArregloObjetos con2 = new ArregloObjetos(a);
            System.out.println("Longitud:" + con2.Longitud());
            con2.Imprime();
    
            // con 3
            System.out.println("con3");
            System.out.println ("ingresa los 2 datos flotantes");
            datoEntrada = flujoEntrada.readLine();  
            float dato1=Float.parseFloat(datoEntrada);
            datoEntrada = flujoEntrada.readLine();  
            float dato2=Float.parseFloat(datoEntrada);
            Float[] b = { new Float(dato1), new Float(dato2) };
            ArregloObjetos con3 = new ArregloObjetos(b);
            System.out.println("Longitud:" + con3.Longitud());
            con3.Imprime();
    
            // con 4
            System.out.println("con4");
            System.out.println ("ingresa las 4 cadenas de texto");
            datoEntrada = flujoEntrada.readLine(); 
            String cadena1=datoEntrada;
            datoEntrada = flujoEntrada.readLine(); 
            String cadena2=datoEntrada;
            datoEntrada = flujoEntrada.readLine(); 
            String cadena3=datoEntrada;
            datoEntrada = flujoEntrada.readLine(); 
            String cadena4=datoEntrada;
            String[] c = { cadena1, cadena2, cadena3, cadena4 };
            ArregloObjetos con4 = new ArregloObjetos(c);
            System.out.println("Longitud:" + con4.Longitud());
            con4.Imprime();
    
            // con 5
            System.out.println("con5");
            System.out.println ("ingresa un dato entero, un dato double y una cadena de texto");
            datoEntrada = flujoEntrada.readLine(); 
            int int1 = Integer.parseInt(datoEntrada);
            datoEntrada = flujoEntrada.readLine(); 
            double double1 = Double.parseDouble(datoEntrada);
            datoEntrada = flujoEntrada.readLine(); 
            cadena1=datoEntrada;
            ArregloObjetos con5 = new ArregloObjetos(new Object[] { new Integer(int1), new Double(double1), new String(cadena1) });
            System.out.println("Longitud:" + con5.Longitud());
            con5.Imprime();
    
            // con 6
            System.out.println("con6");
            System.out.println ("ingresa un dato entero, un dato double y una cadena de texto");
            datoEntrada = flujoEntrada.readLine(); 
            int1 = Integer.parseInt(datoEntrada);
            datoEntrada = flujoEntrada.readLine(); 
            double1 = Double.parseDouble(datoEntrada);
            datoEntrada = flujoEntrada.readLine(); 
            cadena1=datoEntrada;
            Object[] ob = { new Integer(int1), new Double(double1), new String(cadena1) };
            ArregloObjetos con6 = new ArregloObjetos(ob);
            System.out.println("Longitud:" + con6.Longitud());
            con6.Imprime();
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
}