import java.io.Serializable;

public class Vendedor extends Persona implements Serializable{
    public Vendedor(int e,String n,String c){
        super.edad = e;
        super.nombre = n;
        super.curp = c;
    }
}