import java.io.Serializable;

public class Estudiante extends Persona implements Serializable{
    int matricula;
    public Estudiante(int e,int m,String n,String c){
        super.edad = e;
        matricula = m;
        super.nombre = n;
        super.curp = c;
    }

}
