public class pluma{
    String color;
    int cantidad;

    // constructor
    public pluma(){
    }

    // metodos
    public pluma(String col,int can){
        color = col;
        cantidad = can;
    }

    public String verColor(){
        return color;
    }

    public int verCantidad(){
        return cantidad;
    }
}