import java.io.*;
public class Menu {
    // lectura
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;


    // atributos
    int op,op2;
    boolean serie = false;
    Numeros numeros;
    CuadroMagico cuadro;


    public void menu(){
        do{
            try{
                System.out.println("\tMENU\n1.-Generar tamaño y seria para el cuadro\n2.-Ver cuadro magico\n3.-Salir");
                datoEntrada = flujoEntrada.readLine();
                op = Integer.parseInt(datoEntrada);
                switch(op){
                    case 1:
                        do{
                            System.out.println("ingresa el tamaño del cuadro (recuerda que el tamaño debe ser impar y del 3 al 11");
                            datoEntrada = flujoEntrada.readLine();
                            op2 = Integer.parseInt(datoEntrada);
                        }while(op2!=3 && op2!=5 && op2!=7 && op2!=9 && op2!=11);
                        numeros = new Numeros(op2);
                        numeros.setNumAleatorios();
                        serie = true;
                    break;


                    case 2:
                        if (serie==true){
                            cuadro = new CuadroMagico(numeros.tamMatriz);
                            cuadro.setCuadro(numeros.getNumAleatorios());
                            cuadro.verCuadro();
                        }else System.out.println("crea una serie primero");
                    break;


                    case 3:
                        System.out.println("gracias por usar este programa");
                    break;

                    default: System.out.println("opcion invalida");
                }
            }catch(Exception e){
                System.out.println("Error " + e.getMessage());
            }
        }while(op!=3);
    }
}
