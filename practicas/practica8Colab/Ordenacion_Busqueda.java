import java.io.*;

public class Ordenacion_Busqueda {
    

    public Ordenacion_Busqueda(){}

    public int busquedaBin( int[] arreglo, int clave ){
        boolean encontre = false;
        int central,bajo=0, alto;
        int valorcentral;
        alto=arreglo.length-1;
        while( bajo <= alto && !encontre ){
                central = ( bajo + alto ) / 2;
                valorcentral=arreglo[central];
                if( clave == valorcentral ){
                    return central;
                }else 
                    if( clave<valorcentral){
                        alto = central - 1;
                    }else{
                        bajo = central + 1;
                    }
        }
        return -1;
    }
    
    public static void burbuja(int[] arreglo){
	int i,j;
	int temp;
	boolean sorted = false;
	for(i=0; i<arreglo.length-1 && !sorted; i++){
            sorted=true;
            for(j=arreglo.length-1; j>i; j--){
		if(arreglo[j]<arreglo[j-1]){
                    temp=arreglo[j];
                    arreglo[j]=arreglo[j-1];
                    arreglo[j-1]=temp;
                    sorted=false;
		}
            }
	}
    }
    
     public static void burbuja2(int[] arreglo){
	int i,j;
	int temp;
	boolean sorted = false;
	for(i=0; i<arreglo.length-1 && !sorted; i++){
            sorted=true;
            for(j=arreglo.length-1; j>i; j--){
		if(arreglo[j]>arreglo[j-1]){
                    temp=arreglo[j];
                    arreglo[j]=arreglo[j-1];
                    arreglo[j-1]=temp;
                    sorted=false;
		}
            }
	}
    }
     
    public static void burbujaMejorado (int[]arreglo){
        int i,j;
        boolean sorteo=false;
        for (i=1; i<arreglo.length-1; i++){
            int temp;
            sorteo=true;
            for (j=arreglo.length-1;j>i; j--){
                if (arreglo[j]< arreglo[j-1]){
                    temp= arreglo[j];
                    arreglo[j]=arreglo[j-1];
                    arreglo[j-1]=temp;
                    sorteo=false;
                }
            }
        }
    }
     
    public static void burbujaMejorado2 (int[]arreglo){
        int i,j;
        boolean sorteo=false;
        for (i=1; i<arreglo.length-1; i++){
            int temp;
            sorteo=true;
            for (j=arreglo.length-1;j>i; j--){
                if (arreglo[j]> arreglo[j-1]){
                    temp= arreglo[j];
                    arreglo[j]=arreglo[j-1];
                    arreglo[j-1]=temp;
                    sorteo=false;
                }
            }
        }
    }
    
    public void seleccion (int [] arreglo){
        int maxj,maxx;
        for (int i=0; i<arreglo.length-1;i++){
            maxj=i;
            maxx=arreglo[i];
            for (int j=i+1; j<arreglo.length;j++){ 
                if (arreglo[j]<maxx){
                    maxj=j;
                    maxx=arreglo[j];
                }
            }
            arreglo[maxj]=arreglo[i];
            arreglo[i]=maxx;
        }
        for (int i=0; i<arreglo.length;i++){
            System.out.println("arreglo"+ arreglo[i]);
        }
    }
    
    public void seleccion2 (int [] arreglo){
        int maxj,maxx;
        for (int i=0; i<arreglo.length-1;i++){
            maxj=i;
            maxx=arreglo[i];
            for (int j=i+1; j<arreglo.length;j++){ 
                if (arreglo[j]>maxx){
                    maxj=j;
                    maxx=arreglo[j];
                }
            }
            arreglo[maxj]=arreglo[i];
            arreglo[i]=maxx;
        }
        for (int i=0; i<arreglo.length;i++){
            System.out.println("arreglo"+ arreglo[i]);
        }
    }
    
    public static void shell(int arreglo[]){
        int salto, aux, i;
        boolean cambios;
        for(salto=arreglo.length/2; salto!=0; salto/=2){
            cambios=true;
            while(cambios){ // Mientras se intercambie algún elemento
                cambios=false;
                for(i=salto; i< arreglo.length; i++) // se da una pasada
                    if(arreglo[i-salto]>arreglo[i]){ // y si están desordenados
                        aux=arreglo[i]; // se reordenan
                        arreglo[i]=arreglo[i-salto];
                        arreglo[i-salto]=aux;
                        cambios=true; // y se marca como cambio.
                    }
            }
        }
    }
    
    public static void shell2(int arreglo[]){
        int salto, aux, i;
        boolean cambios;
        for(salto=arreglo.length/2; salto!=0; salto/=2){
            cambios=true;
            while(cambios){ // Mientras se intercambie algún elemento
                cambios=false;
                for(i=salto; i< arreglo.length; i++) // se da una pasada
                    if(arreglo[i-salto]<arreglo[i]){ // y si están desordenados
                        aux=arreglo[i]; // se reordenan
                        arreglo[i]=arreglo[i-salto];
                        arreglo[i-salto]=aux;
                        cambios=true; // y se marca como cambio.
                    }
            }
        }
    }
        
    public void quickSort(int[] vector, int izquierda, int derecha){
        int pivote=vector[izquierda];
        int i=izquierda;
        int j=derecha;
        int aux;
        while(i<j){
            while(vector[i]<= pivote && i<j){
                i++;
            }while(vector[j]>pivote){
                j--;
            }if(i<j){
                aux=vector[i];
                vector[i]=vector[j];
                vector[j]=aux;
            }
        }
        vector[izquierda]=vector[j];
        vector[j]=pivote;
        if(izquierda<j-1){
            quickSort(vector, izquierda, j-1);
        }
        if(j+1<derecha){
            quickSort(vector, j+1, derecha);
        }
    }
    
    public void quickSort2(int[] vector, int izquierda, int derecha){
        int pivote=vector[izquierda];
        int i=izquierda;
        int j=derecha;
        int aux;
        while(i<j){
            while(vector[i]<= pivote && i<j){
                i++;
            }while(vector[j]>pivote){
                j--;
            }if(i>j){
                aux=vector[i];
                vector[i]=vector[j];
                vector[j]=aux;
            }
        }
        vector[izquierda]=vector[j];
        vector[j]=pivote;
        if(izquierda<j-1){
            quickSort2(vector, izquierda, j-1);
        }
        if(j+1<derecha){
            quickSort2(vector, j+1, derecha);
        }
    }
    
    public static int busquedaLineal (int arreglo[], int NumBuscado ){
        int i;
        for (i = 0; i <= arreglo.length - 1; i++)
            if (arreglo [i] == NumBuscado) {
                System.out.println ("Si encontró:" + NumBuscado);
                return NumBuscado;
            }
         System.out.println ("No encontró: " + NumBuscado);
        return NumBuscado;
    }

    public static void muestra(int[] arreglo, String cad){
	System.out.print(cad);
	for(int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i]+" ");
            System.out.print("\n\n");
    }

    public static void aleatorios (int[] arreglo, int num){
	int valor,total=0;
        for(int i=0;i<num;i++){
            arreglo[i]= 1 +(int)(Math.random()*100);
            System.out.println("numero "+ arreglo[i]);
        }
    }
    
    public void guardar (int[] arreglo, int num){
	FileWriter fichero = null;
        PrintWriter inicio = null;
        try{
            fichero = new FileWriter("prueba.txt");
            inicio = new PrintWriter(fichero);
            for (int i = 0; i < num; i++)
                inicio.println("arreglo = " + arreglo[i]);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (null != fichero)
                    fichero.close();
            }catch (Exception e2) {
                e2.printStackTrace();
           }
        }
    }
}
