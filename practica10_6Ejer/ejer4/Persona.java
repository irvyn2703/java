class Persona {
    protected int edad;
    public String nombre;
    private char gen;
    int otro = 9;

    Persona() {
        edad = 0;
        nombre = "";
        gen = ' ';
    }

    Persona(String n, int e, char g) {
        nombre = n;
        edad = e;
        gen = g;
    }

    public char retornaGen() {
        return gen;
    }

    protected int retornaEdad() {
        return edad;
    }
}
