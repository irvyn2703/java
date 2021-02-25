
package testpoligono;
public class Rectangulo implements areaCalculable{
     private int base;
    private int altura;
    public Rectangulo(int base, int altura ){
        this.base=base;
        this.altura=altura;
    }
    public int calcArea(){return base*altura;}
}
