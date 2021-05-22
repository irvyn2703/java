public class EjemploHerencia {
    public static void main(String ar[]) {
        Persona per1 = new Persona("Adrian", 23, 'h');
        System.out.println("Edad: " + per1.edad + " Nom: " + per1.nombre);
        System.out.println("Otro : " + per1.otro);
        System.out.println("Retorna gen : " + per1.retornaGen());
        // System.out.println("Retorna gen : " + per1.gen); gen es private

        Estudiante per2 = new Estudiante("Monica", 20, 'm');
        System.out.println("Edad de persona 2:" + per2.retornaEdad());
        System.out.println("Genero de persona 2:" + per2.retornaGen());
        System.out.println("Edad: " + per2.edad + " Nom: " + per2.nombre);
        System.out.println("Otro : " + per2.otro + " Matricula: " + per2.matricula);
        if (per2 instanceof Persona)
            System.out.println("Es de clase Persona");
    }
}
