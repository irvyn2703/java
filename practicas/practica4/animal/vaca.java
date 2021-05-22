public class vaca extends animal{
    public String habla(){
        return "MUUU";
    }
    public String peso(int peso){
        if (peso>10){
            return "la vaca esta gordita";
        }else{
            return "la vaca esta delgada";
        }
    }
}
