public class perro extends animal {
    public String habla(){
        return "GUAUUU";
    }
    public String peso(int peso){
        if (peso>10){
            return "el perro esta gordito";
        }else{
            return "el perro esta delgado";
        }
    }
}
