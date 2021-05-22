
import java.io.*;

public class Ecuacion {

    public static void main(String[] args) {
        int[][] ecuacion = new int[3][3];
        int x1 = 10000, x2 = 10000, x3 = 10000, y1 = 10000, y2 = 10000, y3 = 10000, z1 = 10000, z2 = 10000, z3 = 10000, resul1 = 10000, resul2 = 10000, resul3 = 10000;
        boolean esNumero = true;
        try {
            // lectura
            InputStreamReader entrada = new InputStreamReader(System.in);
            BufferedReader flujoEntrada = new BufferedReader(entrada);
            String datoEntrada;
            System.out.println("Ingresar variable 1:");
            datoEntrada = flujoEntrada.readLine();

            try {
                x1 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (x1 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }

            // excepcion del String
            System.out.println("Ingresar variable 2:");
            datoEntrada = flujoEntrada.readLine();

            try {
                y1 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (y1 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }

            System.out.println("Ingresar variable 3:");
            datoEntrada = flujoEntrada.readLine();

            try {
                z1 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (z1 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }

            System.out.println("Ingresar variable 1:");
            datoEntrada = flujoEntrada.readLine();

            try {
                x2 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (x2 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }

            System.out.println("Ingresar variable 2:");
            datoEntrada = flujoEntrada.readLine();

            try {
                y2 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (y2 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }

            System.out.println("Ingresar variable 3:");
            datoEntrada = flujoEntrada.readLine();

            try {
                z2 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (z2 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }

            System.out.println("Ingresar variable 1:");
            datoEntrada = flujoEntrada.readLine();

            try {
                x3 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (x3 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }

            System.out.println("Ingresar variable 2:");
            datoEntrada = flujoEntrada.readLine();

            try {
                y3 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (y3 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }

            System.out.println("Ingresar variable 3:");
            datoEntrada = flujoEntrada.readLine();

            try {
                z3 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (z3 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }

            System.out.println("Ingresar el resultado de la ecuacion 1: ");
            datoEntrada = flujoEntrada.readLine();

            try {
                resul1 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (resul1 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }

            System.out.println("Ingresar el resultado de la ecuacion 2: ");
            datoEntrada = flujoEntrada.readLine();
            
            try {
                resul2 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (resul2 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }

            System.out.println("Ingresar el resultado de la ecuacion 3: ");
            datoEntrada = flujoEntrada.readLine();
            
            try {
                resul3 = Integer.parseInt(datoEntrada);
            } catch (Exception e) {
                esNumero = false;
            }
            if (esNumero == false) {
                throw new Exception("Ingreso letras, simbolos o decimales");
            }
            // excepcion de mayor
            if (resul3 >= 100000) {
                throw new Exception("Valores extremales para un coeficiente del Sistema");
            } else {
                System.out.println("dato guardado");
            }
            Determinante solucion = new Determinante();
            int rd = solucion.calcula_Determinante(x1, y1, z1, x2, y2, z2, x3, y3, z3);
            int rdx = solucion.calcula_Determinante(resul1, y1, z1, resul2, y2, z2, resul3, y3, z3);
            int rdy = solucion.calcula_Determinante(x1, resul1, z1, x2, resul2, z2, x3, resul3, z3);
            int rdz = solucion.calcula_Determinante(x1, y1, resul1, x2, y2, resul2, x3, y3, resul3);
            System.out.println("Soluciones");
            if (rd == 0) {
                System.out.println("El sistema no tiene solucion");
            } else {
                System.out.println("El valor de x es igual a " + rdx / rd);
                System.out.println("El  valor de y es igual a " + rdy / rd);
                System.out.println("El  valor de z es igual a " + rdz / rd);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
