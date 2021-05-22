public abstract class Comida
{
	protected double precio;
	protected double calorias;
	protected double peso;
    //
    public Comida()
    {
    }
    public void SetPeso(double p)
    {
	peso=p;
    }
    public abstract void comer();
 
    public void Mostrar_Informacion()
    {
	System.out.println();
	System.out.println("Precio: "+precio);
	System.out.println("Calorias: "+calorias);
	System.out.println("Peso: "+peso);
    }
}  
