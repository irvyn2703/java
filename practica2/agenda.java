public class agenda {
    private persona lista[];
    private int numContactos;
    static int numAgenda;


    public agenda(){
        lista = new persona[10];
        numContactos = 0;
        numAgenda++;
    }


    public void agregarContacto(persona objP){
        if(numContactos<10){
            lista[numContactos]=objP;
            numContactos++;
        }else
            System.out.println("limite de la angenda");
    }


    public void MostrarDatos(){
        for(int i=0;i<numContactos;i++){
            int n=i+1;
            System.out.println("informacion de la persona " + n);
            System.out.println("Nombre: " + lista[i].nombre);
            System.out.println("Genero: " + lista[i].genero);
            System.out.println("Telefono: " + lista[i].telefono);
            System.out.println("Direccion: " + lista[i].direccion);
            System.out.println("Edad: " + lista[i].edad);
            System.out.println("");
        }
    }


    public void buscar(String nombreBuscar){
        System.out.println("de la busqueda '" + nombreBuscar + "' se encontro: ");
        System.out.println("");
        for(int i=0;i<numContactos;i++){
            if(lista[i].nombre == nombreBuscar){
                System.out.println("nombre encontrado: ");
                System.out.println("Nombre: " + lista[i].nombre);
                System.out.println("Genero: " + lista[i].genero);
                System.out.println("Telefono: " + lista[i].telefono);
                System.out.println("Direccion: " + lista[i].direccion);
                System.out.println("Edad: " + lista[i].edad);
                System.out.println("");
            }
        }
    }
}
