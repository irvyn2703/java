
public class Determinante {
    public int calcula_Determinante(int x1,int x2, int x3,int y1,int y2,int y3,int z1,int z2,int z3) throws Exception{ 
        int resultado; 
        
        resultado = (x1*y2*z3+y1*z2*x3+x2*y3*z1)-(z1*y2*x3+y1*x2*z3+z2*y3*x1);
        return resultado; 
    }
}
