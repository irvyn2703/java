public abstract class figuraCuadrilatero{
    protected int x,y,ancho,alto,diagonalm,diagonalM;

    public void cambiaX(int x){
        this.x = x;
    }
    public void cambiaY(int y){
        this.y = y;
    }
    public void cambiaAncho(int ancho){
        this.ancho = ancho;
    }
    public void cambiaAlto(int alto){
        this.alto = alto;
    }
    public void cambiaDiagm(int diagonalm){
        this.diagonalm = diagonalm;
    }
    public void cambiaDiagM(int diagonalM){
        this.diagonalM = diagonalM;
    }

    public abstract double obtenPerimetro();
    public abstract double obtenArea();
}