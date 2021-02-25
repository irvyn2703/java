package persona;
public class Celular {
private String modelo;
private float precio;
public Celular(){ modelo=""; precio=0.0f;}
public Celular(String mod, float prec){ modelo=mod;
        precio=prec;
}
public String getModelo(){return modelo;}
public float getPrecio(){return precio;}
}
