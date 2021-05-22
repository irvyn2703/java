/**
 * @(#)Persona.java
 *
 *
 * @Miguel Carreon
 * @version 1.00 2021/4/13
 */

public class Persona {
    int edad;
    String nombre;
	String apellidos;

    public Persona() {
        nombre=null;
		apellidos=null;
    }

    public Persona(String nombre1, String apellidos1) throws Exception
 	{
 		if(nombre1 == null || apellidos1 == null  ||  "".equals(nombre1)  || "".equals(apellidos1))
 		throw new Exception("Argumentos no v�lidos");
 		//si el constructor no tiene los dos atributos lanza la excepci�n el objeto
 		//no se crea el objeto

 		else
 		System.out.println("Se construyo el objeto");
 		nombre=nombre1;
 		apellidos=apellidos1;
 	}

    public Persona(int edad1){
        edad = edad1;
    }

    public void ponerEdad(int ed) throws EdadFuera {
        if ((ed < 0) || (ed > 130))
            throw new EdadFuera("Demasiado joven o demasiado viejo");
        else
            edad = ed;
    }

    public void TipoPersona(int edad) {
        if (edad <= 12)
            System.out.println("Eres un ni�o, juega y diviertete mucho");
        if ((edad > 12) && (edad < 18))
            System.out.println("Eres adolescente, come frutas y verduras");
        if ((edad >= 18) && (edad < 30))
            System.out.println("Eres Joven, sigue con tus sue�os y proyectos ");
        if ((edad >= 30) && (edad < 60))
            System.out.println("Eres Joven Adulto productivo, sigue adelante, tu puedes");
        if ((edad >= 60) && (edad < 80))
            System.out.println("Eres Adulto Mayor, te has convertido en una gran persona");
        if ((edad >= 80) && (edad < 130))
            System.out.println("Eres Anciano, dejaste un gran legado");
    }


    // nombre y apellido
	

 	public void obtenerNombre(String nombre1, String apellidos1)
	{
 		nombre=nombre1;
		apellidos=apellidos1;
 	}
}