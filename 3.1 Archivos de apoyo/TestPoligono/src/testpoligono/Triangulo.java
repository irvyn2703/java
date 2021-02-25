
package testpoligono;
public class Triangulo implements areaCalculable  {
    private int base;
    private int altura;
    public Triangulo(int base, int altura ){
        this.base=base;
        this.altura=altura;
    }
     public int calcArea(){return (base*altura)/2;}
}
