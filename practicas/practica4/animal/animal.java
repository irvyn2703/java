public class animal{
    // variables de instancias
    private int peso=0;

    public void cambiaPeso(int peso){
        this.peso = peso;
    }
    public int obtenPeso(){
        return peso;
    }
    public String habla(){
        return "los animales no hablan";
    }
    public String come(){
        return "esta comiendo";
    }
    public String peso(int peso){
        return "esta gordito";
    }
}