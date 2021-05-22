import java.io.*;
public class Archivos {
    public static void main(String[] args){
        File in = new File("entrada.txt");
        File out = new File("salida.txt");
        FileReader fr;
        FileWriter fw;

        BufferedReader br;
        PrintWriter pr;

        try{
            fr=new FileReader(in);
            fw=new FileWriter(out);
            br=new BufferedReader(fr);
            pr=new PrintWriter(fw);

            String linea=br.readLine();

            while(linea!=null){
                int num=Integer.parseInt(linea);
                int fac=factorial(num);
                pr.println(fac);
                linea=br.readLine();
            }

            fr.close();
            fw.close();
        }catch (IOException e){
            System.err.println("Error");
        }
    }

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
}
