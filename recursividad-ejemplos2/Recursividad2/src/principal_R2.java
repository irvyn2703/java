import java.util.Scanner;
public class principal_R2 {
 public static void main(String[] args){
  int palitos;
  char varinicial='1',varcentral='2',varfinal='3';
  Scanner entrada = new Scanner(System.in);
  FuncionHanoi funcion = new FuncionHanoi();
  System.out.println("Guia de como resolver la torre de hanoi");
  System.out.print("Numero de anillos de la torre: ");
  palitos=entrada.nextInt();
  funcion.hanoi(varinicial,varcentral,varfinal,palitos);
 }   
}