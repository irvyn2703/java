import java.util.Scanner;
public class Menu {
    public void menu() {
        int i=0;
		double resultado=0;
        int op;
        boolean alumnos=false;
		Scanner Entrada=new Scanner(System.in);
        Calificaciones  a1=new Calificaciones();

        // menu
        do{
            System.out.println("\n\tMENU\n1.-Ingresar alumnos\n2.-suma de las calificaciones\n3.-promedio de las calificacion\n4.-calificacion mas alta\n5.-calificacion mas baja\n6.-numero de reprobados\n7.-numero de aprobados\n8.-mostrar alumnos\n9.-salir");
            op = Entrada.nextInt();
            switch(op) {
                case 1:
                    System.out.println("Ingresar numero de alumnos:");
                    i=Entrada.nextInt();
                    a1=new Calificaciones (i);
                    a1.ponerValorEn(i);
                    alumnos=true;
                break;
                case 2:
                    if(alumnos==true){
                        System.out.println("La suma de las calificaciones es: " + a1.suma());
                    }else{
                        System.out.println("debe ingresar las calificaciones de los alumnos primero");
                    }
                break;
                case 3:
                    if (alumnos==true){
                        resultado=a1.calculaPromedio(i);
                        System.out.println("El promedio de las calificaciones de todos los alumnos es: "+ resultado);
                    }else{
                        System.out.println("debe ingresar las calificaciones de los alumnos primero");
                    }
                break;
                case 4:
                    if(alumnos==true){
                        System.out.println("La calificación mayor es: "+a1.Mayor());
                    }else{
                        System.out.println("debe ingresar las calificaciones de los alumnos primero");
                    }
                break;
                case 5:
                    if(alumnos==true){
                        System.out.println("La calificación menor es: "+a1.Menor());
                    }else{
                        System.out.println("debe ingresar las calificaciones de los alumnos primero");
                    }
                break;
                case 6:
                    if(alumnos==true){
                        System.out.println("El numeros de reprobados es: "+a1.NumReprobados());
                    }else{
                        System.out.println("debe ingresar las calificaciones de los alumnos primero");
                    }
                break;
                case 7:
                    if(alumnos==true){
                        System.out.println("El numeros de aprobados es: "+a1.NumAprobados());

                    }else{
                        System.out.println("debe ingresar las calificaciones de los alumnos primero");
                    }
                break;
                case 8:
                    if(alumnos==true){
                        System.out.println("El numeros de alumnos con 6 es: "+a1.NumCal6());
                        System.out.println("El numeros de alumnos con 7 es: "+a1.NumCal7());
                        System.out.println("El numeros de alumnos con 8 es: "+a1.NumCal8());
                        System.out.println("El numeros de alumnos con 9 es: "+a1.NumCal9());
                        System.out.println("El numeros de alumnos con 10 es. "+a1.NumCal10());
                    }else{
                        System.out.println("debe ingresar las calificaciones de los alumnos primero");
                    }
                break;
                case 9:
                    System.out.println("gracias por usar este programa :)");
                break;
                default:
                    System.out.println("opcion invalida");
            }
        } while (op != 9);
        Entrada.close();
    }
}
