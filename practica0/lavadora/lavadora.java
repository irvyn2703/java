public class lavadora {
    // Atributos
    String marca;
    String color;
    String tama;
    String modelo;
    double precio;
    int ciclos;

    //Construcutor de la clase
        // se inicializan variables o atributos en el constructor
    public lavadora(){
    }
    //posteriormente viene lo métodos

    public void almacenarInfo(String marca1, String color1, String tama1, String modelo1, double precio1, int ciclos1){
        marca = marca1;
        tama = tama1;
        modelo = modelo1;
        ciclos = ciclos1;
        precio = precio1;
        color = color1;
    }

    public void consultarInfo(){
        System.out.println("Marca: "+ marca);
        System.out.println("Color: "+ color);
        System.out.println("Tamaño: "+ tama);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Precio: "+ precio);
        System.out.println("Ciclos: "+ ciclos);
    }

    public void encender(){
        System.out.println("la lavadora se encendio");
    }

    public void apagar(){
        System.out.println("la lavadora se apago");
    }
}
