import java.io.*;
public class Menu {
    // lectura
    InputStreamReader entrada = new InputStreamReader(System.in);
	BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;

    // atributos
    int op=20;
    boolean m1=false,m2=false;
    Matriz matriz1 = new Matriz();
    Matriz matriz2 = new Matriz();


    // metodos
    public void menu(){
        do{
            try{
                System.out.println("\tMenu\n0.Salir\n1.Leer los elementos de una Matriz\n2. Generar aleatoriamente los números en la matriz\n3. Visualizar elementos de la matriz\n4. Sumar matrices\n5. Multiplicar matrices\n6. Restar Matrices\n7. Verificar si la matriz es cuadrada\n8. Verificar si la matriz es triangular superior.\n9. Verificar si la matriz es identidad\n10. Obtenga el producto de la matriz por un escalar.");
                datoEntrada = flujoEntrada.readLine();
                op = Integer.parseInt(datoEntrada);
                switch(op){
                    case 0:
                    System.out.println("Gracias por usar este programa :)");
                    break;
                    case 1:
                    System.out.println("");
                    do{
                        System.out.println("cual matriz deseas ingresar\n1.-matriz1\n2.-matriz2");
                        datoEntrada=flujoEntrada.readLine();
                        op= Integer.parseInt(datoEntrada);
                        if (op==1){
                            matriz1.lectura();
                            m1=true;
                        }else if(op==2){
                            matriz2.lectura();
                            m2=true;
                        }

                    }while (op!=1 && op!=2);
                    System.out.println("");
                    break;


                    case 2:
                    System.out.println("");
                    do{
                        System.out.println("cual matriz deseas ingresar\n1.-matriz1\n2.-matriz2");
                        datoEntrada=flujoEntrada.readLine();
                        op= Integer.parseInt(datoEntrada);
                        if (op==1){
                            matriz1.lecturaAleatoria();;
                            m1=true;
                        }else if(op==2){
                            matriz2.lecturaAleatoria();;
                            m2=true;
                        }

                    }while (op!=1 && op!=2);
                    System.out.println("");
                    break;


                    case 3:
                    System.out.println("");
                    if(m1 == true && m2 == true){
                        do{
                            System.out.println("cual matriz deseas ver\n1.-matriz1\n2.-matriz2");
                            datoEntrada=flujoEntrada.readLine();
                            op= Integer.parseInt(datoEntrada);
                            if (op==1){
                                matriz1.verMatriz();
                                m1=true;
                            }else if(op==2){
                                matriz2.verMatriz();
                                m2=true;
                            }
                        }while (op!=1 && op!=2);
                    }else
                    System.out.println("ingrasa valores a las 2 matrizes");
                    System.out.println("");
                    break;

                    // sumar matrices
                    case 4:
                    int[][] suma;
                    System.out.println("");
                    if(m1 == true && m2 == true){
                        if(matriz1.columna==matriz2.columna && matriz1.fila==matriz2.fila){
                            suma = new int[matriz1.fila][matriz1.columna];
                            for (int i = 0; i < matriz1.matriz.length; i++){
                                for (int j = 0; i < matriz1.matriz[0].length; j++){
                                    suma[i][j]=matriz1.matriz[i][j] + matriz2.matriz[i][j];
                                }
                            }

                            // imprime
                            for(int i=0;i<matriz1.fila;i++){
                                for(int j=0;i<matriz1.columna;j++){
                                    System.out.println(suma[i][j] + "   ");
                                }
                                System.out.println("");
                            }
                        }else
                        System.out.println("el numero de filas o columnas no coincide entre las 2 matrices");
                    }else
                    System.out.println("ingrasa valores a las 2 matrizes");
                    System.out.println("");
                    break;

                    // multiplicar matrices
                    case 5:
                    int[][] mul;
                    int valor;
                    System.out.println("");
                    if(m1 == true && m2 == true){
                        if(matriz1.columna==matriz2.fila){
                            mul = new int[matriz1.fila][matriz2.columna];
                            for(int i=0;i<matriz1.fila;i++){
                                for(int j=0;i<matriz1.columna;j++){
                                    valor=0;
                                    for(int k=0;k<matriz2.columna;k++){
                                        valor = valor + matriz1.obtenerMatriz()[i][k] * matriz1.obtenerMatriz()[k][j];
                                    }
                                    mul[i][j]=valor;
                                }
                            }

                            // imprime
                            for(int i=0;i<matriz1.fila;i++){
                                for(int j=0;i<matriz1.columna;j++){
                                    System.out.println(mul[i][j] + "   ");
                                }
                                System.out.println("");
                            }
                        }else
                        System.out.println("el numero de columnas de la primera matriz no coincide con las filas de la segunda");
                    }else
                    System.out.println("ingrasa valores a las 2 matrizes");
                    System.out.println("");
                    break;

                    // restar matrices
                    case 6:
                    int[][] resta;
                    System.out.println("");
                    if(m1 == true && m2 == true){
                        if(matriz1.columna==matriz2.columna && matriz1.fila==matriz2.fila){
                            resta = new int[matriz1.fila][matriz1.columna];
                            for(int i=0;i<matriz1.fila;i++){
                                for(int j=0;i<matriz1.columna;j++){
                                    resta[i][j]=matriz1.obtenerMatriz()[i][j] - matriz2.obtenerMatriz()[i][j];
                                }
                            }

                            // imprime
                            for(int i=0;i<matriz1.fila;i++){
                                for(int j=0;i<matriz1.columna;j++){
                                    System.out.println(resta[i][j] + "   ");
                                }
                                System.out.println("");
                            }
                        }else
                        System.out.println("el numero de filas o columnas no coincide entre las 2 matrices");
                    }else
                    System.out.println("ingrasa valores a las 2 matrizes");
                    System.out.println("");
                    break;

                    // matriz cuadrada
                    case 7:
                    System.out.println("");
                    if(m1 == true && m2 == true){
                        do{
                            System.out.println("cual matriz deseas ver si es cuadrada\n1.-matriz1\n2.-matriz2");
                            datoEntrada=flujoEntrada.readLine();
                            op= Integer.parseInt(datoEntrada);
                            if (op==1){
                                if(matriz1.matrizCuadrada==true){
                                    System.out.println("la matriz si es cuadrada");
                                }else
                                System.out.println("la matriz no es cuadrada");
                            }else if(op==2){
                                if(matriz2.matrizCuadrada==true){
                                    System.out.println("la matriz si es cuadrada");
                                }else
                                System.out.println("la matriz no es cuadrada");
                            }
                        }while (op!=1 && op!=2);
                    }else
                    System.out.println("ingrasa valores a las 2 matrizes");
                    System.out.println("");
                    break;

                    // triangulo superior
                    case 8:
                    boolean trianguloSuperior=true;
                    System.out.println("");
                    if(m1 == true && m2 == true){
                        do{
                            System.out.println("cual matriz deseas ver si tiene triangulo superior\n1.-matriz1\n2.-matriz2");
                            datoEntrada=flujoEntrada.readLine();
                            op= Integer.parseInt(datoEntrada);
                            if (op==1){
                               for(int i =0;i<matriz1.fila;i++){
                                   for(int j=0;j<matriz1.columna;j++){
                                       if(i>j){
                                           if (matriz1.matriz[i][j]!=0){
                                            trianguloSuperior=false;
                                           }
                                       }
                                   }
                               }
                               if(trianguloSuperior==true){
                                   System.out.println("la matriz si tiene triangulo superior");
                               }else
                               System.out.println("la matriz no tiene triangulo superior");
                            }else if(op==2){
                                for(int i =0;i<matriz2.fila;i++){
                                    for(int j=0;j<matriz2.columna;j++){
                                        if(i>j){
                                            if (matriz2.matriz[i][j]!=0){
                                             trianguloSuperior=false;
                                            }
                                        }
                                    }
                                }
                                if(trianguloSuperior==true){
                                    System.out.println("la matriz si tiene triangulo superior");
                                }else
                                System.out.println("la matriz no tiene triangulo superior");
                            }
                        }while (op!=1 && op!=2);
                    }else
                    System.out.println("ingrasa valores a las 2 matrizes");
                    System.out.println("");
                    break;

                    // identidad
                    case 9:
                    boolean identidad = true;
                    System.out.println("");
                    if(m1 == true && m2 == true){
                        do{
                            System.out.println("cual matriz deseas ver si es identidad\n1.-matriz1\n2.-matriz2");
                            datoEntrada=flujoEntrada.readLine();
                            op= Integer.parseInt(datoEntrada);
                            if (op==1){
                                if(matriz1.matrizCuadrada==true){
                                    for (int i=0;i<matriz1.fila;i++){
                                        for (int j=0;j<matriz1.fila;j++){
                                            if(i==j){
                                                if(matriz1.matriz[i][j]!=1){
                                                    identidad=false;
                                                }
                                            }else{
                                            if(matriz1.matriz[i][j]!=0){
                                                identidad=false;
                                            }
                                            }
                                        }
                                    }
                                }else
                                identidad=false;
                            }else if(op==2){
                                if(matriz2.matrizCuadrada==true){
                                    for (int i=0;i<matriz2.fila;i++){
                                        for (int j=0;j<matriz2.fila;j++){
                                            if(i==j){
                                                if(matriz2.matriz[i][j]!=1){
                                                    identidad=false;
                                                }
                                            }else{
                                            if(matriz2.matriz[i][j]!=0){
                                                identidad=false;
                                            }
                                            }
                                        }
                                    }
                                }else
                                identidad=false;
                            }
                        }while (op!=1 && op!=2);
                        if(identidad==true){
                            System.out.println("es identidad");
                        }else
                        System.out.println("es identidad");
                    }
                    System.out.println("");
                    break;

                    // matriz por escalar
                    case 10:
                    int escalar;
                    int[][] escal;
                    System.out.println("");
                    if(m1 == true && m2 == true){
                        do{
                            System.out.println("cual matriz deseas multiplicarle el escalar\n1.-matriz1\n2.-matriz2");
                            datoEntrada=flujoEntrada.readLine();
                            op= Integer.parseInt(datoEntrada);
                            if (op==1){
                                escal = new int[matriz1.fila][matriz2.columna];
                                System.out.println("ingresa el escalar");
                                datoEntrada = flujoEntrada.readLine();
                                escalar = Integer.parseInt(datoEntrada);
                                for (int i=0;i<matriz1.fila;i++){
                                    for (int j=0;j<matriz1.columna;j++){
                                        escal[i][j]=matriz1.matriz[i][j]*escalar;
                                    }
                                }

                                // imprime
                                for(int i=0;i<matriz1.fila;i++){
                                    for(int j=0;i<matriz1.columna;j++){
                                        System.out.println(escal[i][j] + "   ");
                                    }
                                    System.out.println("");
                                }
                            }else if(op==2){
                                escal = new int[matriz1.fila][matriz2.columna];
                                System.out.println("ingresa el escalar");
                                datoEntrada = flujoEntrada.readLine();
                                escalar = Integer.parseInt(datoEntrada);
                                for (int i=0;i<matriz2.fila;i++){
                                    for (int j=0;j<matriz2.fila;j++){
                                        escal[i][j]=matriz2.matriz[i][j]*escalar;
                                    }
                                }

                                // imprime
                                for(int i=0;i<matriz2.fila;i++){
                                    for(int j=0;i<matriz2.columna;j++){
                                        System.out.println(escal[i][j] + "   ");
                                    }
                                    System.out.println("");
                                }
                            }
                        }while (op!=1 && op!=2);
                    System.out.println("");
                }
                    break;


                    default: 
                    System.out.println("Opcion invalida");
                    op = 20;
                }
            }catch(IOException error)
            {
            System.err.println("Error " + error.getMessage());
            }
        }while(op!=0);
    }
}