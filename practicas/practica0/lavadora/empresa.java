public class empresa {
    //esta clase controla todo
    public static void main(String[] args){
        lavadora objlavadora = new lavadora();
        objlavadora.almacenarInfo("easy","grande","roja","zafiro",3000.90,5);
        objlavadora.apagar();
        objlavadora.encender();
        objlavadora.consultarInfo();
    }
}
