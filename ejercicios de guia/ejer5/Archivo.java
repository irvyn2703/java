import java.io.*;
import java.io.FileReader;

public class Archivo {
    String[] nombres = new String[100];
    int nom = 0;

    public Archivo() {
        try{
            BufferedReader bf = new BufferedReader(new FileReader("nombres.txt"));
            String temp="";
            String bfRead;
            nombres[0]="";
            while((bfRead = bf.readLine()) != null){
                temp = bfRead;
            }
            for(int i=0; i<temp.length(); i++){
                nombres[nom] += temp.charAt(i);
                if(temp.charAt(i) == ' '){
                    nom++;
                    nombres[nom] = "";
                }

            }
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public void verNombres(){
        for(int i=0;i<=nom;i++){
            System.out.println("nombre " + (i+1) + ": " + nombres[i]);
        }
    }


    public void quicksort(String A[], int izq, int der) {

        String pivote=A[izq]; 
        int i=izq;         
        int j=der;         
        String aux;
       
        while(i < j){                                                          
           while(A[i].compareTo(pivote) <= 0 && i < j) i++; 
           while(A[i].compareTo(pivote) > 0) j--;           
           if (i < j) {                                          
               aux= A[i];                     
               A[i]=A[j];
               A[j]=aux;
           }
         }
         
         A[izq]=A[j];                                      
         A[j]=pivote;      
         
         if(izq < j-1)
            quicksort(A,izq,j-1);          
         if(j+1 < der)
            quicksort(A,j+1,der);         
         
      }
}
