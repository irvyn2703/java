import java.io.*;
public class Distrito{
    // lectura
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);
    String datoEntrada;



    // atributos
    // primera parte de la matriz controla el distrito y la segunda el candidato
    int distrito = 5;
    int candidato = 4;
    int[][] candidatos = new int[distrito][candidato];
    double[] porsentaje = new double[candidato];


    // metodos
    public void ingresarCandidatos(){
        try{
            for(int i=0;i<candidatos.length;i++){
                for(int j=0;j<candidatos[0].length;j++){
                    System.out.print("Ingresa el numero de votos del candidato " + (j+1) + " en el distrito " + (i+1) + ": ");
                    datoEntrada = flujoEntrada.readLine();
                    candidatos[i][j] = Integer.parseInt(datoEntrada);
                }
                System.out.println("\n");
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }


    public void imprimirTabla(){
        System.out.print("\t     ");
        for(int i=0;i<candidatos[0].length;i++){
            System.out.print("Candidato " + (i+1) + "\t");
        }
        System.out.println("");
        for (int i=0; i<candidatos.length;i++){
            System.out.print("distrito " + (i+1) + ":\t     ");
            for(int j=0;j<candidatos[0].length;j++){
                System.out.print(candidatos[i][j] + "\t        ");
            }
            System.out.println("");
        }
    }



    public void votos(){
        double votantes=0;
        // votos totales por candidato
        int[] votosTotales = new int[candidato];

        for (int i=0; i<candidatos[0].length;i++){
            votosTotales[i] = 0;
            for(int j=0;j<candidatos.length;j++){
                votosTotales[i] = votosTotales[i] + candidatos[j][i];
                votantes = votantes + candidatos[j][i];
            }
        }

        for(int i=0;i<candidatos[0].length;i++){
            System.out.print("\t     Candidato " + (i+1));
        }
        System.out.println("");
        System.out.print("Votos: \t       ");
            for(int i=0;i<candidatos[0].length;i++){
                porsentaje[i]=(votosTotales[i]/votantes)*100;
                System.out.print(votosTotales[i] + " - " + String.format("%.2f", porsentaje[i]) + "%\t       ");
            }
            System.out.println("");
            for(int i=0;i<candidatos[0].length;i++)
                if(porsentaje[i]>50){
                    System.out.println("El candidato " + (i+1) + " acaba de ganar con un " + porsentaje[i] + " de la votacion");
                }
            System.out.println("\n");
    }


    public void muestraMejores(){
        System.out.println("hola");
        double[] ordenar = new double[porsentaje.length];
        double temp;

        for (int i = 0; i < porsentaje.length; i++) {
            ordenar[i] = porsentaje[i];
        }

        for (int i = 0; i < ordenar.length -1; i++) {
			for (int j = ordenar.length - 1; j > i; j--) {
				if (ordenar[j] > ordenar[j - 1]) {
					temp = ordenar[j];
					ordenar[j] = ordenar[j - 1];
					ordenar[j - 1] = temp;
				}
			}
		}

        for (int i = 0; i < 2; i++) {
            for(int j=0;j<ordenar.length;j++){
                if (ordenar[i]==porsentaje[j]){
                    System.out.println("el candidato " + (j+1) + " esta en la posision " + (i+1));
                }
            }
        }
    }  
}