public class cerdo extends animal {
    public String habla(){
        return "OING";
    }
    public String come(){
        return "el cerdito no quiere comer";
    }
    public String peso(int peso){
        if (peso>10){
            return "el cerdito esta gordito";
        }else{
            return "el cerdito esta delgado";
        }
    }
}
