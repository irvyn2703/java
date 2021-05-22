public class CuadroMagico {
    int[][] cuadro;

    public CuadroMagico(int tam){
        cuadro = new int[tam][tam];
        for(int i=0;i<cuadro.length;i++){
            for(int j=0;j<cuadro[i].length;j++){
                cuadro[i][j] = -1;
            }
        }
    }

    public void setCuadro(int[] nums){
        int x=0,y;
        int previoX,previoy;
        int filas = cuadro.length;
        int columnas = cuadro[0].length;
        y = ((columnas)/2);
        cuadro[x][y]=nums[0];
        for(int i=1; i<filas*columnas;i++){
            previoX=x;
            previoy=y;
            if(x - 1<0){
                x=filas-1;
            }else x--;

            if(y+1>columnas-1){
                y=0;
            }else y++;

            if(cuadro[x][y]!=-1){
                x=previoX+1;
                y=previoy;
            }
            cuadro[x][y]=nums[i];
        }
    }


    public void verCuadro(){
        int suma,sumaDiagonal=0,sumaDiagonalInvertida=0;
        int[] sumaColumna = new int[cuadro[0].length];
        // funciona para la diagonal invertida
        int k=cuadro[0].length-1;
        System.out.println("*********************************************\n");
        for(int i=0;i<cuadro.length;i++){
            // inicializamos los contadores en 0
            sumaColumna[i]=0;
            suma=0;
            for(int j=0;j<cuadro[0].length;j++){
                // suma es suma de filas
                suma += cuadro[i][j];
                // se suma las columnas
                sumaColumna[i] += cuadro[j][i];
                // se suma la diagonal
                if(i==j){
                    sumaDiagonal += cuadro[i][j];
                }
                System.out.print(cuadro[i][j] + " ");
            }
            // imprime las sumas de las filas
            System.out.println("  la suma de esta fila es = " + suma);
        }
        System.out.println("");
        // imprime las sumas de las columnas
        for(int i=0;i<cuadro[0].length;i++){
            System.out.println("la columna " + (i+1) + " su suma es: " + sumaColumna[i]);
        }

        // realiza la suma de la diagonal invertida
        for(int i=0;i<cuadro[0].length;i++){
                sumaDiagonalInvertida += cuadro[i][k];
                k--;
        }
        System.out.println("la suma de la diagonal es: " + sumaDiagonal);
        System.out.println("la suma de la diagonal Invertida es: " + sumaDiagonalInvertida);

        System.out.println("es un cuadrado magico");
        System.out.println("\n*********************************************");
    }
}