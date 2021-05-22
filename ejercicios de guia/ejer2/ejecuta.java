public class ejecuta {

    public static void main(String[] args){
        CrearNumeros numeros = new CrearNumeros();
        numeros.ingresarNumeros();
        System.out.println("los numeros generados son: \n" + numeros.verNumeros());
        System.out.println("el promedio es: " + numeros.promedio());
        numeros.guardar();
    }
}
