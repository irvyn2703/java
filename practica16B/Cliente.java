import java.io.Serializable;

public class Cliente extends Persona implements Serializable{
    public Cliente(int e,String n,String c){
        super.edad = e;
        super.nombre = n;
        super.curp = c;
    }
}