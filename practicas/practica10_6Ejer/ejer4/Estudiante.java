class Estudiante extends Persona {
    int matricula;

    Estudiante() {
        super();
        matricula = 1;
    }

    Estudiante(String n, int e, char g) {
        super(n, e, g);
        matricula = 2;
        System.out.println("Imprime edad desde Estudiante : " + edad);
    }

    public int retornaEdad() {
        System.out.println("Retornara edad en Estudiante .. ");
        return edad;
    }
}
