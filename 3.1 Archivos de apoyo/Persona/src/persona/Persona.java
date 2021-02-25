package persona; //Programación II online
public class Persona {
private String nombre;
private int edad;
private Celular cell;
public Persona(){ nombre="";edad=0;
        cell=new Celular();
}
public Persona(String nom, int ed, Celular ce){ 
        nombre=nom; 
        edad=ed;
        cell=ce;
        }
public void printPersona(){
   System.out.println("La Persona: "+
           nombre+" de Edad: "+edad+
           " Años"+"\n"+" TIENE Modelo de Celular: "+
           cell.getModelo()+
           " de Precio: $"+cell.getPrecio());
}
    public static void main(String[] args) {
     Persona persona =new Persona("Eustolia Pérez",
      35,new Celular("Motorola Z3",5000));   
      persona.printPersona();
    }
}

