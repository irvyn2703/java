public class Numeros {
    // atributaos
    int[] numAleatorios;
    int tamMatriz;


    // metodos
    public Numeros(int tam){
        numAleatorios = new int[tam*tam];
        tamMatriz = tam;
    }

    public void setNumAleatorios(){
        System.out.println("********************************\n");
        System.out.print("Se genero la serie: ");
        numAleatorios[0]=(int)(Math.random()*100+1);
        System.out.print(numAleatorios[0]+ " ");
        for(int i=1;i<numAleatorios.length;i++){
            numAleatorios[i]=numAleatorios[i-1]+1;
            System.out.print(numAleatorios[i] + " ");
        }
        System.out.println("\n****************************************************************");
    }

    public int[] getNumAleatorios(){
        return numAleatorios;
    } 
}