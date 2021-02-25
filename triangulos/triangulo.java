public class triangulo {
    double lado1,lado2,lado3;
    String respuesta;

    public triangulo(int lad1, int lad2, int lad3) {
        lado1 = lad1;
        lado2 = lad2;
        lado3 = lad3;
    }

    public String comparar(){
        if(lado1==lado2 && lado2==lado3){
            respuesta="triangulo equilatero";
        }else if (lado1!=lado2 && lado2!=lado3 && lado1!=lado3){
            respuesta="triangulo escaleno";
        }else {
            respuesta="triangulo isosceles";
        }
        return respuesta;
    }
    public void mostrar(){
        System.out.println("el triangulo ingresado es un " + comparar());
    }
}