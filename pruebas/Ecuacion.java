// x * y / z = ?
import java.io.*;
public class Ecuacion {
    
    
    
    public static void main(String[] args){
        int[][] ecuacion = new int[3][3];
        int x1=10000,x2,x3,y1,y2,y3,z1,z2,z3,resul1,resul2,resul3;
        try{
            // lectura
            InputStreamReader entrada = new InputStreamReader(System.in);
            BufferedReader flujoEntrada = new BufferedReader(entrada);
            String datoEntrada;
            // try{

                System.out.println("Ingresar variable 1:");
            datoEntrada= flujoEntrada.readLine();
            x1= Integer.parseInt(datoEntrada);
            //  excepcion de mayor
            if (x1>=10000){
                throw new Exception("numero muy grande");
            } else {
                System.out.println("dato guardado");
            }

            // excepcion del String
            System.out.println("Ingresar variable 2:");
            datoEntrada= flujoEntrada.readLine();
            y1= Integer.parseInt(datoEntrada);
            System.out.println("Ingresar variable 3:");
            datoEntrada= flujoEntrada.readLine();
            z1= Integer.parseInt(datoEntrada);

            System.out.println("Ingresar variable 1:");
            datoEntrada= flujoEntrada.readLine();
            x2= Integer.parseInt(datoEntrada);
            System.out.println("Ingresar variable 2:");
            datoEntrada= flujoEntrada.readLine();
            y2= Integer.parseInt(datoEntrada);
            System.out.println("Ingresar variable 3:");
            datoEntrada= flujoEntrada.readLine();
            z2= Integer.parseInt(datoEntrada);

            System.out.println("Ingresar variable 1:");
            datoEntrada= flujoEntrada.readLine();
            x3= Integer.parseInt(datoEntrada);
            System.out.println("Ingresar variable 2:");
            datoEntrada= flujoEntrada.readLine();
            y3= Integer.parseInt(datoEntrada);
            System.out.println("Ingresar variable 3:");
            datoEntrada= flujoEntrada.readLine();
            z3= Integer.parseInt(datoEntrada);

        //     }catch (NumberFormatException e1 ) //Excepción sólo para ese tipo de error
		// {
		// System.out.println("Formato no valido deben ser numeros "+ e1.getMessage());
		// 	e1.printStackTrace();// siguimiento del error
        // }
		
            


            System.out.println("Ingresar el resultado de la ecuacion 1: ");
            datoEntrada= flujoEntrada.readLine();
            resul1= Integer.parseInt(datoEntrada);

            System.out.println("Ingresar el resultado de la ecuacion 2: ");
            datoEntrada= flujoEntrada.readLine();
            resul2= Integer.parseInt(datoEntrada);

            System.out.println("Ingresar el resultado de la ecuacion 3: ");
            datoEntrada= flujoEntrada.readLine();
            resul3= Integer.parseInt(datoEntrada);
            Determinante solucion = new Determinante();
            int rd = solucion.calcula_Determinante(x1, y1, z1, x2, y2, z2, x3, y3, z3);
            int rdx = solucion.calcula_Determinante(resul1, y1, z1, resul2, y2, z2, resul3, y3, z3);
            int rdy = solucion.calcula_Determinante(x1, resul1, z1, x2, resul2, z2, x3, resul3, z3);
            int rdz = solucion.calcula_Determinante(x1, y1, resul1, x2, y2, resul2, x3, y3, resul3);
            System.out.println("Soluciones");
            if(rd==0){
                System.out.println("El sistema no tiene solucion");
            } else {
                System.out.println("El valor de x es igual a " + rdx/rd);
                System.out.println("El  valor de y es igual a " + rdy/rd);
                System.out.println("El  valor de z es igual a " + rdz/rd);
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }

    }
}


