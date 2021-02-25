package circulo;

public class Punto {
    private float x;
    private float y;

    public Punto() {
        x = y = 0;
    }

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void printPunto() {
        System.out.println("Origen:" + "(" + x + "," + y + ")");
    }
}
