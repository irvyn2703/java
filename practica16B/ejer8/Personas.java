import java.io.Serializable;

public class Personas implements Serializable {
    String nombre;
    int edad;
    String curp;

    public Personas() {
    }

    public Personas(String nombre, int edad, String curp) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurp() {
        return curp;
    }
}
