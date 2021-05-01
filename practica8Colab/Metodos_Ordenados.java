import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Metodos_Ordenamiento {

    
    public static void main(String[] args)throws IOException {
       String n, datoEntrada;
        int op=0, op1=0, op2=0, op3=0, op4=0, op5=0, op6=0, op7=0, op8=0, op9=0, op10=0;
        int op11=0, op12=0, op13=0, op14=0, op15=0;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader Entrada = new BufferedReader(entrada);
        System.out.println("-/-/-/-/Metodos de Ordenamiento y Busqueda/-/-/-/-");
        System.out.println("Ingrese el numero de elementos que tendra el arreglo: ");
        datoEntrada=Entrada.readLine();
        int num=Integer.parseInt(datoEntrada);
        int arreglo1[]=new int[num];
    	Ordenacion_Busqueda objeto=new Ordenacion_Busqueda();
        do{
                 System.out.println("------ Menu -------");
                     System.out.println("¿Que metodo de ordenamiento deseas usar?");
                         System.out.println("Opcion 1: Burbuja");
                       System.out.println("Opcion 2: Burbuja Mejorado");
                         System.out.println("Opcion 3: Seleccion");
                         System.out.println("Opcion 4: Shell");
                          System.out.println("Opcion 5: QuickSort");
                            System.out.println("Opcion 6: Salir del programa");
                        
                       datoEntrada=Entrada.readLine();
                          op=Integer.parseInt(datoEntrada);
        switch(op){
            case 1: 
            do{
                 System.out.println("¿De que forma desea ordenarlo?");
                      System.out.println("Opcion 1: De forma Ascendente |De menor a mayor|");
                    System.out.println("Opcion 2: De forma Descendente |De mayor a menor|");
                   System.out.println("Opcion 3: Regresar al menu");
                     datoEntrada=Entrada.readLine();
                    op1=Integer.parseInt(datoEntrada);
                      switch(op1){
                       case 1: objeto.aleatorios(arreglo1, num);
                     objeto.burbuja(arreglo1);
                        objeto.muestra(arreglo1, "Ordenado por Burbuja de forma Ascendente");
                     objeto.guardar(arreglo1, num);
                        do{
                       System.out.println("¿De que forma quiere buscar un elemento");
                      System.out.println("1. Busqueda Binaria");
                        System.out.println("2.Busqueda Secuencial");
                      System.out.println("3. Regresar al menú principal");
                        datoEntrada=Entrada.readLine();
                        op2=Integer.parseInt(datoEntrada);
             switch(op2){
                      case 1:
                            System.out.println("Ingrese el numero del elemento a buscar dentro el arreglo: ");
                            String num1=Entrada.readLine();
                            int num2=Integer.parseInt(num1);
                           int indice=objeto.busquedaBin(arreglo1,num2);
                            if (indice!=-1){
                            System.out.println("El numero "+num2+" se encuentra en posicion " + (indice+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num2+" no se encuentra en el arreglo");
                            }
                        break;
                      case 2: 
                          System.out.println("Ingrese el numero del elemento a buscar dentro del arreglo :");
                           String num3=Entrada.readLine();
                         int num4=Integer.parseInt(num3);
                           int indice1=objeto.busquedaLineal(arreglo1,num4);
                           if(indice1!=-1){
                            System.out.println("El numero "+num4+" se encuentra en posicion " + (indice1+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num4+" no se encuentra en el arreglo");
                            } 
                          break;
                    case 3: 
                            System.out.println("------- Regresando al menú principal -------");
                            break;
                         default: System.out.println("La opción no existe");
                           break;               
                         }
                       }while(op2!=3);
                break;
          case 2: objeto.aleatorios(arreglo1, num);
                     objeto.burbuja2(arreglo1);
                   objeto.muestra(arreglo1, "Ordenado por Burbuja de forma Descendente");
                   objeto.guardar(arreglo1, num);
                    do{
                    System.out.println("¿De que forma quiere buscar un elemento");
                    System.out.println("1. Busqueda Binaria");
                    System.out.println("2.Busqueda Secuencial");
                   System.out.println("3. Regresar al menú principal");
                   datoEntrada=Entrada.readLine();
                     op3=Integer.parseInt(datoEntrada);
                        switch(op3){
                              case 1:
                        System.out.println("Ingrese el numero del elemento a buscar dentro el arreglo: ");
                        String num5=Entrada.readLine();
                        int num6=Integer.parseInt(num5);
                        int indice=objeto.busquedaBin(arreglo1,num6);
                        if (indice!=-1){
                            System.out.println("El numero "+num6+" se encuentra en posicion " + (indice+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num6+" no se encuentra en el arreglo");
                            }
                                 break;
                           case 2: 
                            System.out.println("Ingrese el numero del elemento a buscar dentro del arreglo :");
                          String num7=Entrada.readLine();
                           int num8=Integer.parseInt(num7);
                          int indice1=objeto.busquedaLineal(arreglo1,num8);
                          if(indice1!=-1){
                             System.out.println("El numero "+num8+" se encuentra en posicion " + (indice1+1)+ " en el arreglo");
                             }else{
                             System.out.println("El numero "+num8+" no se encuentra en el arreglo");
                             } 
                            break;
                case 3: System.out.println("Regresando al menu principal");
                break;
                default: System.out.println("La opción no existe");
                break;
                }
                }while(op3!=3);
                break;
                case 3: System.out.println("Regresando al menu principal");
                break;
                default: System.out.println("La opcion no existe");
                break;
            }
            }while(op1!=3);
            case 2: 
            do{
            System.out.println("¿De que forma desea ordenarlo?");
            System.out.println("1.De forma Ascendente (De menor a mayor)");
            System.out.println("2.De forma Descendente (De mayor a menor)");
            System.out.println("3. Regresar al menú principal");
            datoEntrada=Entrada.readLine();
            op4=Integer.parseInt(datoEntrada);
            switch(op4){
                case 1: objeto.aleatorios(arreglo1, num);
                objeto.burbujaMejorado(arreglo1);
                objeto.muestra(arreglo1, "Ordenado por Burbuja Mejorado de forma Ascendente");
                objeto.guardar(arreglo1, num);
                do{
                System.out.println("¿De que forma quiere buscar un elemento");
                System.out.println("1. Busqueda Binaria");
                System.out.println("2.Busqueda Secuencial");
                System.out.println("3. Regresar al menú principal");
                datoEntrada=Entrada.readLine();
                op5=Integer.parseInt(datoEntrada);
                switch(op5){
                    case 1:
                        System.out.println("Ingrese el numero del elemento a buscar dentro el arreglo: ");
                        String num9=Entrada.readLine();
                        int num10=Integer.parseInt(num9);
                        int indice=objeto.busquedaBin(arreglo1,num10);
                        if (indice!=-1){
                            System.out.println("El numero "+num10+" se encuentra en posicion " + (indice+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num10+" no se encuentra en el arreglo");
                            }
                        break;
                    case 2: 
                        System.out.println("Ingrese el numero del elemento a buscar dentro del arreglo :");
                        String num11=Entrada.readLine();
                        int num12=Integer.parseInt(num11);
                        int indice1=objeto.busquedaLineal(arreglo1,num12);
                        if(indice1!=-1){
                            System.out.println("El numero "+num12+" se encuentra en posicion " + (indice1+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num12+" no se encuentra en el arreglo");
                            } 
                    break;
                    case 3: System.out.println("------- Regresando al menú principal -------");
                    break;
                    default: System.out.println("La opción no existe");
                    break;               
                }
                }while(op5!=3);
                break;
                case 2: objeto.aleatorios(arreglo1, num);
                objeto.burbujaMejorado2(arreglo1);
                objeto.muestra(arreglo1, "Ordenado por Burbuja Mejorado de forma Descendente");
                objeto.guardar(arreglo1, num);
                do{
                System.out.println("¿De que forma quiere buscar un elemento");
                System.out.println("1. Busqueda Binaria");
                System.out.println("2.Busqueda Secuencial");
                System.out.println("3. Regresar al menú principal");
                datoEntrada=Entrada.readLine();
                op6=Integer.parseInt(datoEntrada);
                switch(op6){
                    case 1:
                        System.out.println("Ingrese el numero del elemento a buscar dentro el arreglo: ");
                        String num13=Entrada.readLine();
                        int num14=Integer.parseInt(num13);
                        int indice=objeto.busquedaBin(arreglo1,num14);
                        if (indice!=-1){
                            System.out.println("El numero "+num14+" se encuentra en posicion " + (indice+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num14+" no se encuentra en el arreglo");
                            }
                        break;
                    case 2: 
                        System.out.println("Ingrese el numero del elemento a buscar dentro del arreglo :");
                        String num15=Entrada.readLine();
                        int num16=Integer.parseInt(num15);
                        int indice1=objeto.busquedaLineal(arreglo1,num16);
                        if(indice1!=-1){
                            System.out.println("El numero "+num16+" se encuentra en posicion " + (indice1+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num16+" no se encuentra en el arreglo");
                            } 
                        break;
                case 3: System.out.println("Regresando al menu principal");
                break;
                default: System.out.println("La opción no existe");
                break;
                }
                }while(op6!=3);
                break;
                case 3: System.out.println("Regresando al menu principal");
                break;
                default: System.out.println("La opcion no existe");
                break;
            }
            }while(op4!=3);
            case 3:
            do{
            System.out.println("¿De que forma desea ordenarlo?");
            System.out.println("1.De forma Ascendente (De menor a mayor)");
            System.out.println("2.De forma Descendente (De mayor a menor)");
            System.out.println("3. Regresar al menú principal");
            datoEntrada=Entrada.readLine();
            op7=Integer.parseInt(datoEntrada);
            switch(op7){
                case 1: objeto.aleatorios(arreglo1, num);
                objeto.seleccion(arreglo1);
                objeto.muestra(arreglo1, "Ordenado por Seleccion de forma Ascendente");
                objeto.guardar(arreglo1, num);
                do{
                System.out.println("¿De que forma quiere buscar un elemento");
                System.out.println("1. Busqueda Binaria");
                System.out.println("2.Busqueda Secuencial");
                System.out.println("3. Regresar al menú principal");
                datoEntrada=Entrada.readLine();
                op8=Integer.parseInt(datoEntrada);
                switch(op8){
                    case 1:
                        System.out.println("Ingrese el numero del elemento a buscar dentro el arreglo: ");
                        String num17=Entrada.readLine();
                        int num18=Integer.parseInt(num17);
                        int indice=objeto.busquedaBin(arreglo1,num18);
                        if (indice!=-1){
                            System.out.println("El numero "+num18+" se encuentra en posicion " + (indice+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num18+" no se encuentra en el arreglo");
                            }
                        break;
                    case 2: 
                        System.out.println("Ingrese el numero del elemento a buscar dentro del arreglo :");
                        String num19=Entrada.readLine();
                        int num20=Integer.parseInt(num19);
                        int indice1=objeto.busquedaLineal(arreglo1,num20);
                        if(indice1!=-1){
                            System.out.println("El numero "+num20+" se encuentra en posicion " + (indice1+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num20+" no se encuentra en el arreglo");
                            } 
                    break;
                    case 3: System.out.println("------- Regresando al menú principal -------");
                    break;
                    default: System.out.println("La opción no existe");
                    break;               
                }
                }while(op8!=3);
                break;
                case 2: objeto.aleatorios(arreglo1, num);
                objeto.seleccion2(arreglo1);
                objeto.muestra(arreglo1, "Ordenado por Seleccion de forma Descendente");
                objeto.guardar(arreglo1, num);
                do{
                System.out.println("¿De que forma quiere buscar un elemento");
                System.out.println("1. Busqueda Binaria");
                System.out.println("2.Busqueda Secuencial");
                System.out.println("3. Regresar al menú principal");
                datoEntrada=Entrada.readLine();
                op9=Integer.parseInt(datoEntrada);
                switch(op9){
                    case 1:
                        System.out.println("Ingrese el numero del elemento a buscar dentro el arreglo: ");
                        String num21=Entrada.readLine();
                        int num22=Integer.parseInt(num21);
                        int indice=objeto.busquedaBin(arreglo1,num22);
                        if (indice!=-1){
                            System.out.println("El numero "+num22+" se encuentra en posicion " + (indice+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num22+" no se encuentra en el arreglo");
                            }
                        break;
                    case 2: 
                        System.out.println("Ingrese el numero del elemento a buscar dentro del arreglo :");
                        String num23=Entrada.readLine();
                        int num24=Integer.parseInt(num23);
                        int indice1=objeto.busquedaLineal(arreglo1,num24);
                        if(indice1!=-1){
                            System.out.println("El numero "+num24+" se encuentra en posicion " + (indice1+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num24+" no se encuentra en el arreglo");
                            } 
                        break;
                case 3: System.out.println("Regresando al menu principal");
                break;
                default: System.out.println("La opción no existe");
                break;
                }
                }while(op9!=3);
                break;
                case 3: System.out.println("Regresando al menu principal");
                break;
                default: System.out.println("La opcion no existe");
                break;
            }
            }while(op7!=3);  
            case 4: 
            do{
            System.out.println("¿De que forma desea ordenarlo?");
            System.out.println("1.De forma Ascendente (De menor a mayor)");
            System.out.println("2.De forma Descendente (De mayor a menor)");
            System.out.println("3. Regresar al menú principal");
            datoEntrada=Entrada.readLine();
            op10=Integer.parseInt(datoEntrada);
            switch(op10){
                case 1: objeto.aleatorios(arreglo1, num);
                objeto.shell(arreglo1);
                objeto.muestra(arreglo1, "Ordenado por Shell de forma Ascendente");
                objeto.guardar(arreglo1, num);
                do{
                System.out.println("¿De que forma quiere buscar un elemento");
                System.out.println("1. Busqueda Binaria");
                System.out.println("2.Busqueda Secuencial");
                System.out.println("3. Regresar al menú principal");
                datoEntrada=Entrada.readLine();
                op11=Integer.parseInt(datoEntrada);
                switch(op11){
                    case 1:
                        System.out.println("Ingrese el numero del elemento a buscar dentro el arreglo: ");
                        String num25=Entrada.readLine();
                        int num26=Integer.parseInt(num25);
                        int indice=objeto.busquedaBin(arreglo1,num26);
                        if (indice!=-1){
                            System.out.println("El numero "+num26+" se encuentra en posicion " + (indice+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num26+" no se encuentra en el arreglo");
                            }
                        break;
                    case 2: 
                        System.out.println("Ingrese el numero del elemento a buscar dentro del arreglo :");
                        String num27=Entrada.readLine();
                        int num28=Integer.parseInt(num27);
                        int indice1=objeto.busquedaLineal(arreglo1,num28);
                        if(indice1!=-1){
                            System.out.println("El numero "+num28+" se encuentra en posicion " + (indice1+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num28+" no se encuentra en el arreglo");
                            } 
                    break;
                    case 3: System.out.println("------- Regresando al menú principal -------");
                    break;
                    default: System.out.println("La opción no existe");
                    break;               
                }
                }while(op11!=3);
                break;
                case 2: objeto.aleatorios(arreglo1, num);
                objeto.shell2(arreglo1);
                objeto.muestra(arreglo1, "Ordenado por Shell de forma Descendente");
                objeto.guardar(arreglo1, num);
                do{
                System.out.println("¿De que forma quiere buscar un elemento");
                System.out.println("1. Busqueda Binaria");
                System.out.println("2.Busqueda Secuencial");
                System.out.println("3. Regresar al menú principal");
                datoEntrada=Entrada.readLine();
                op12=Integer.parseInt(datoEntrada);
                switch(op12){
                    case 1:
                        System.out.println("Ingrese el numero del elemento a buscar dentro el arreglo: ");
                        String num29=Entrada.readLine();
                        int num30=Integer.parseInt(num29);
                        int indice=objeto.busquedaBin(arreglo1,num30);
                        if (indice!=-1){
                            System.out.println("El numero "+num30+" se encuentra en posicion " + (indice+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num30+" no se encuentra en el arreglo");
                            }
                        break;
                    case 2: 
                        System.out.println("Ingrese el numero del elemento a buscar dentro del arreglo :");
                        String num31=Entrada.readLine();
                        int num32=Integer.parseInt(num31);
                        int indice1=objeto.busquedaLineal(arreglo1,num32);
                        if(indice1!=-1){
                            System.out.println("El numero "+num32+" se encuentra en posicion " + (indice1+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num32+" no se encuentra en el arreglo");
                            } 
                        break;
                case 3: System.out.println("Regresando al menu principal");
                break;
                default: System.out.println("La opción no existe");
                break;
                }
                }while(op12!=3);
                break;
                case 3: System.out.println("Regresando al menu principal");
                break;
                default: System.out.println("La opcion no existe");
                break;
            }
            }while(op10!=3);
            case 5:
            do{
            System.out.println("¿De que forma desea ordenarlo?");
            System.out.println("1.De forma Ascendente (De menor a mayor)");
            System.out.println("2.De forma Descendente (De mayor a menor)");
            System.out.println("3. Regresar al menú principal");
            datoEntrada=Entrada.readLine();
            op13=Integer.parseInt(datoEntrada);
            switch(op13){
                case 1: objeto.aleatorios(arreglo1, num);
                objeto.quickSort(arreglo1,0,0);
                objeto.muestra(arreglo1, "Ordenado por QuickSort de forma Ascendente");
                objeto.guardar(arreglo1, num);
                do{
                System.out.println("¿De que forma quiere buscar un elemento");
                System.out.println("1. Busqueda Binaria");
                System.out.println("2.Busqueda Secuencial");
                System.out.println("3. Regresar al menú principal");
                datoEntrada=Entrada.readLine();
                op14=Integer.parseInt(datoEntrada);
                switch(op14){
                    case 1:
                        System.out.println("Ingrese el numero del elemento a buscar dentro el arreglo: ");
                        String num33=Entrada.readLine();
                        int num34=Integer.parseInt(num33);
                        int indice=objeto.busquedaBin(arreglo1,num34);
                        if (indice!=-1){
                            System.out.println("El numero "+num34+" se encuentra en posicion " + (indice+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num34+" no se encuentra en el arreglo");
                            }
                        break;
                    case 2: 
                        System.out.println("Ingrese el numero del elemento a buscar dentro del arreglo :");
                        String num35=Entrada.readLine();
                        int num36=Integer.parseInt(num35);
                        int indice1=objeto.busquedaLineal(arreglo1,num36);
                        if(indice1!=-1){
                            System.out.println("El numero "+num36+" se encuentra en posicion " + (indice1+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num36+" no se encuentra en el arreglo");
                            } 
                    break;
                    case 3: System.out.println("------- Regresando al menú principal -------");
                    break;
                    default: System.out.println("La opción no existe");
                    break;               
                }
                }while(op14!=3);
                break;
                case 2: objeto.aleatorios(arreglo1, num);
                objeto.quickSort2(arreglo1,0,0);
                objeto.muestra(arreglo1, "Ordenado por QuickSort de forma Descendente");
                objeto.guardar(arreglo1, num);
                do{
                System.out.println("¿De que forma quiere buscar un elemento");
                System.out.println("1. Busqueda Binaria");
                System.out.println("2.Busqueda Secuencial");
                System.out.println("3. Regresar al menú principal");
                datoEntrada=Entrada.readLine();
                op15=Integer.parseInt(datoEntrada);
                switch(op15){
                    case 1:
                        System.out.println("Ingrese el numero del elemento a buscar dentro el arreglo: ");
                        String num37=Entrada.readLine();
                        int num38=Integer.parseInt(num37);
                        int indice=objeto.busquedaBin(arreglo1,num38);
                        if (indice!=-1){
                            System.out.println("El numero "+num38+" se encuentra en posicion " + (indice+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num38+" no se encuentra en el arreglo");
                            }
                        break;
                    case 2: 
                        System.out.println("Ingrese el numero del elemento a buscar dentro del arreglo :");
                        String num39=Entrada.readLine();
                        int num40=Integer.parseInt(num39);
                        int indice1=objeto.busquedaLineal(arreglo1,num40);
                        if(indice1!=-1){
                            System.out.println("El numero "+num40+" se encuentra en posicion " + (indice1+1)+ " en el arreglo");
                            }else{
                            System.out.println("El numero "+num40+" no se encuentra en el arreglo");
                            } 
                        break;
                case 3: System.out.println("Regresando al menu principal");
                break;
                default: System.out.println("La opción no existe");
                break;
                }
                }while(op15!=3);
                break;
                case 3: System.out.println("Regresando al menu principal");
                break;
                default: System.out.println("La opcion no existe");
                break;
            }
            }while(op13!=3);
            case 6: System.out.println("<<<<< Gracias por usar nuestro sistema >>>>>>");
            break;
            default: System.out.println("La opción no existe");
        }
        }while(op!=6);
    }
}