import java.io.*;
public class Menu {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Estudiante[] estudiante = new Estudiante[100];
        Cliente[] cliente = new Cliente[100];
        Vendedor[] vendedor = new Vendedor[100];
        Contador contador = new Contador();
        int op=0,op2=0;

        int edad = 0;
        String nombre = "";
        String curp = "";
        int matricula = 0;
        boolean permiso = true;

        int estudiantes=0,clientes=0,vendedores=0;

        boolean todoBien = true;

        // lectura
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);
        String datoEntrada;

        // archivo
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File E = new File("Estudiante.obj");
        FileOutputStream fosE = new FileOutputStream(E,true);
        ObjectOutputStream oosE = new ObjectOutputStream(fosE);
        FileInputStream fisE = new FileInputStream(E);
        ObjectInputStream oisE = new ObjectInputStream(fisE);

        File C = new File("Cliente.obj");
        FileOutputStream fosC = new FileOutputStream(C,true);
        ObjectOutputStream oosC = new ObjectOutputStream(fosC);
        FileInputStream fisC = new FileInputStream(C);
        ObjectInputStream oisC = new ObjectInputStream(fisC);


        File V = new File("Vendedor.obj");
        FileOutputStream fosV = new FileOutputStream(V,true);
        ObjectOutputStream oosV = new ObjectOutputStream(fosV);
        FileInputStream fisV = new FileInputStream(V);
        ObjectInputStream oisV = new ObjectInputStream(fisV);


        File cont = new File("Contador.obj");
        FileOutputStream foscont = new FileOutputStream(cont,true);
        ObjectOutputStream ooscont = new ObjectOutputStream(foscont);
        FileInputStream fiscont = new FileInputStream(cont);
        ObjectInputStream oiscont = new ObjectInputStream(fiscont);

        
        do {
            try {
                System.out.println("Menu");
                System.out.println ("0.-Salir\n1.-Estudiante\n2.-Cliente\n3.-Vendedor");
                datoEntrada = flujoEntrada.readLine();
                op = Integer.parseInt(datoEntrada);
            }catch (Exception e){
                System.err.println("Error " + e.getMessage());
                op=-1;
            }

            switch (op) {
                case 0: System.out.println("adios");
                break;

                case 1:
                do{
                    try{
                        System.out.println ("0.-Salir\n1.-Alta\n2.-Consulta arreglo\n3.-Guarda en archivo\n4.-consulta informacion");
                        datoEntrada = flujoEntrada.readLine();
                        op2 = Integer.parseInt(datoEntrada);


                        switch (op2){
                            case 1:
                                do{
                                    try{
                                        System.out.print("Ingresa el nombre:");
                                        datoEntrada = flujoEntrada.readLine();
                                        nombre = datoEntrada;

                                        System.out.print("Ingresa el edad:");
                                        datoEntrada = flujoEntrada.readLine();
                                        edad = Integer.parseInt(datoEntrada);

                                        System.out.print("Ingresa el curp:");
                                        datoEntrada = flujoEntrada.readLine();
                                        curp = datoEntrada;

                                        System.out.print("Ingresa la matricula:");
                                        datoEntrada = flujoEntrada.readLine();
                                        matricula = Integer.parseInt(datoEntrada);


                                        todoBien = true;
                                    }catch (Exception e){
                                        todoBien = false;
                                    }
                                }while (todoBien == false);

                                // guarda archivos
                                estudiante[estudiantes] = new Estudiante(edad, matricula, nombre, curp);
                                estudiantes++;
                            break;

                            case 2:
                                for (int i = 0; i < estudiantes; i++){
                                    System.out.println ("Estudiante " + (i + 1));
                                    System.out.println("Nombre: " + estudiante[i].nombre);
                                    System.out.println("Edad: " + estudiante[i].edad);
                                    System.out.println("Curp: " + estudiante[i].curp);
                                    System.out.println ("Matricula: " + estudiante[i].matricula);
                                }
                            break;

                            case 3:
                                for(int i=0; i< estudiantes; i++){
                                    oosE.writeObject(estudiante[i]);
                                    contador.actualizar(estudiantes, clientes, vendedores);
                                    ooscont.writeObject(contador);
                                }
                            break;

                            // lectura por alguna razon no funciona
                            case 4:
                            try{
                                int i=0;
                                while (true) {
                                    Estudiante e = (Estudiante) oisE.readObject();
                                    estudiante[i] = e;
                                    i++;
                                    contador = (Contador) oiscont.readObject();
                                }
                            } catch (IOException io) {
                                System.out.println("\n*********** Fin************");
                            } finally {
                                oisE.close();
                            }

                        }
                    }catch (Exception e){
                        System.err.println("Error " + e.getMessage());
                        op2=-1;
                    }
                }while(op2!=0);
                break;

                case 2:
                do{
                    try{
                        System.out.println ("0.-Salir\n1.-Alta\n2.-Consulta arreglo\n3.-Guarda en archivo\n4.-consulta informacion");
                        datoEntrada = flujoEntrada.readLine();
                        op2 = Integer.parseInt(datoEntrada);


                        switch (op2){
                            case 1:
                                do{
                                    try{
                                        System.out.print("Ingresa el nombre:");
                                        datoEntrada = flujoEntrada.readLine();
                                        nombre = datoEntrada;

                                        System.out.print("Ingresa el edad:");
                                        datoEntrada = flujoEntrada.readLine();
                                        edad = Integer.parseInt(datoEntrada);

                                        System.out.print("Ingresa el curp:");
                                        datoEntrada = flujoEntrada.readLine();
                                        curp = datoEntrada;


                                        todoBien = true;
                                    }catch (Exception e){
                                        todoBien = false;
                                    }
                                }while (todoBien == false);

                                // guarda archivos
                                cliente[clientes] = new Cliente(edad, nombre, curp);
                                clientes++;
                            break;

                            case 2:
                                for (int i = 0; i < clientes; i++){
                                    System.out.println ("Cliente " + (i + 1));
                                    System.out.println("Nombre: " + cliente[i].nombre);
                                    System.out.println("Edad: " + cliente[i].edad);
                                    System.out.println("Curp: " + cliente[i].curp);
                                }
                            break;

                            case 3:
                                for(int i=0; i< clientes; i++){
                                    oosC.writeObject(cliente[i]);
                                    contador.actualizar(estudiantes, clientes, vendedores);
                                    ooscont.writeObject(contador);
                                }
                            break;

                            // lectura por alguna razon no funciona
                            case 4:
                            try{
                                int i=0;
                                while (true) {
                                    Cliente e = (Cliente) oisC.readObject();
                                    cliente[i] = e;
                                    i++;
                                    contador = (Contador) oiscont.readObject();
                                }
                            } catch (IOException io) {
                                System.out.println("\n*********** Fin************");
                            } finally {
                                oisC.close();
                            }

                        }
                    }catch (Exception e){
                        System.err.println("Error " + e.getMessage());
                        op2=-1;
                    }
                }while(op2!=0);
                break;

                case 3:
                do{
                    try{
                        System.out.println ("0.-Salir\n1.-Alta\n2.-Consulta arreglo\n3.-Guarda en archivo\n4.-consulta informacion");
                        datoEntrada = flujoEntrada.readLine();
                        op2 = Integer.parseInt(datoEntrada);


                        switch (op2){
                            case 1:
                                do{
                                    try{
                                        System.out.print("Ingresa el nombre:");
                                        datoEntrada = flujoEntrada.readLine();
                                        nombre = datoEntrada;

                                        System.out.print("Ingresa el edad:");
                                        datoEntrada = flujoEntrada.readLine();
                                        edad = Integer.parseInt(datoEntrada);

                                        System.out.print("Ingresa el curp:");
                                        datoEntrada = flujoEntrada.readLine();
                                        curp = datoEntrada;


                                        todoBien = true;
                                    }catch (Exception e){
                                        todoBien = false;
                                    }
                                }while (todoBien == false);

                                // guarda archivos
                                vendedor[vendedores] = new Vendedor(edad, nombre, curp);
                                vendedores++;
                            break;

                            case 2:
                                for (int i = 0; i < vendedores; i++){
                                    System.out.println ("Vendedor " + (i + 1));
                                    System.out.println("Nombre: " + vendedor[i].nombre);
                                    System.out.println("Edad: " + vendedor[i].edad);
                                    System.out.println("Curp: " + vendedor[i].curp);
                                }
                            break;

                            case 3:
                                for(int i=0; i< vendedores; i++){
                                    oosC.writeObject(vendedor[i]);
                                    contador.actualizar(estudiantes, clientes, vendedores);
                                    ooscont.writeObject(contador);
                                }
                            break;

                            // lectura por alguna razon no funciona
                            case 4:
                            try{
                                int i=0;
                                while (true) {
                                    Vendedor e = (Vendedor) oisV.readObject();
                                    vendedor[i] = e;
                                    i++;
                                    contador = (Contador) oiscont.readObject();
                                }
                            } catch (IOException io) {
                                System.out.println("\n*********** Fin************");
                            } finally {
                                oisV.close();
                            }

                        }
                    }catch (Exception e){
                        System.err.println("Error " + e.getMessage());
                        op2=-1;
                    }
                }while(op2!=0);
                break;

                default: System.out.println("opcion invalida");
            }
        }while(op!=0);
        oosE.close();
        oosC.close();
        oosV.close();
        ooscont.close();
    }
}
