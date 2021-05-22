import java.io.Serializable;

public class Contador implements Serializable{
    int Estudiantes = 0,Clientes = 0,Vendedor=0;

    public void actualizar(int e, int c, int v){
        Estudiantes = e;
        Clientes = c;
        Vendedor = v;
    }
}
