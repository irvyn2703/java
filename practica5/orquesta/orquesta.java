public class orquesta {
    String nombreOrquesta;
    public orquesta(String nombre) {
        nombreOrquesta = nombre;
    }
    public void CrearOrquesta(){
        piano piano = new piano("jorge");
        piano.tocarD();
        piano.afinar();
        piano.tocar();
        System.out.println("");

        flauta flauta= new flauta("mario");
        flauta.tocar();
        System.out.println("");

        violin violin= new violin("pablo");
        violin.tocarD();
        violin.afinar();
        violin.tocar();
        System.out.println("");
    }

    public void guardarOrquesta(){
        System.out.println("se a guardado la orquesta " + nombreOrquesta);
    }
}
