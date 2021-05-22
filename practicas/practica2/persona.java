public class persona{
    // variables de instancias
    protected String nombre;
    protected String genero;
    protected String telefono;
    protected String direccion;
    protected int edad;

    // variables de clases
    static int numPer;


    public persona(String nom, String gen, String tel, String dire, int ed){
        nombre = nom;
        genero = gen;
        telefono = tel;
        direccion = dire;
        edad = ed;
        numPer++;
    }

}