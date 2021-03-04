/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brenda
 */

import java.util.Scanner;
public class Calificaciones {
	private double []arreglo;
	private int nAlumnos;
	
	public Calificaciones (){
		nAlumnos=10;
		arreglo=new double[nAlumnos];
	}
	
	public Calificaciones (int ne){
		if(ne<1){
			System.out.println("N° de elementos no valido: "+ne);
		}
		nAlumnos=ne;
		arreglo=new double[nAlumnos];
	}
	public void ponerValorEn(int i){		
		int Calificacion;
		Scanner entrada=new Scanner (System.in);
		if(i>=0||i<nAlumnos){
			for(i=0;i<arreglo.length; i++){
					System.out.println("Ingrese calificación "+(i+1)+":" );                                       
					Calificacion=entrada.nextInt();                                       
                                        if (Calificacion>10 && Calificacion<0)
                                        {
                                            System.out.println("Debe ingresar una calificación de 0 al 10");
                                        }
                                        arreglo[i]=Calificacion;
			}
		}
		else
			System.out.println("Indice fuera de limites");
	}
	public double valorEn(int i){
		if(i>=0 && i<nAlumnos){
			return arreglo[i];
		}else{
			System.out.println("Indice fuera de limites");
			return Double.NaN;
		}
	}
	public int longitud(){
		return nAlumnos;
	}
	public void visualizarVector(Calificaciones c){
		int ne=c.longitud();
		for(int i=0;i<ne;i++){
			System.out.println(c.valorEn(i)+"");
		}
	}
	public double calculaPromedio(int num){
		int i;
		double promedio=0, suma=0;
		for(i=0;i<arreglo.length;i++){
			suma=(suma+arreglo[i]);
			promedio=suma/num;
		}
		return promedio;
	}
        public double suma(){
                double suma=0;
                int j;
                for(j=0;j<arreglo.length;j++){
                        suma=suma+arreglo[j];
                }
                return suma;
        }
        public double Mayor(){
               double Mayor=0.0;
               int i;              
              for(i=0;i<arreglo.length;i++){
			if (arreglo[i]>Mayor){
                            Mayor= arreglo[i];   
                        }
              }
                 return Mayor;                                                                
        }
        public double Menor (){
            double Menor=999.99;
                    int i;
                      for(i=0;i<arreglo.length;i++){
			 if(arreglo[i]<Menor){
                            Menor=arreglo[i];
                        }
              }
                 return Menor;
        }
        public int NumReprobados(){
                    int Numrep=0;
                    int i;
                      for(i=0;i<arreglo.length;i++){
			 if(arreglo[i]<6){
                            Numrep++;
                        }
              }
                      return Numrep;
              }
        public int NumAprobados(){
                    int NumApro=0;
                    int i;
                      for(i=0;i<arreglo.length;i++){
			 if(arreglo[i]>=6){
                            NumApro++;
                        }
              }
                      return NumApro;
              }
        public int NumCal6(){
    	int Num = 0,i;
         for(i=0;i<arreglo.length;i++){
			 if(arreglo[i]==6){
                            Num++;
                        }
              }
                      return Num;
              }
      public int NumCal7(){
    	int Num = 0,i;
         for(i=0;i<arreglo.length;i++){
			 if(arreglo[i]==7){
                            Num++;
                        }
              }
                      return Num;
            }
     
       public int NumCal8(){
    	int Num = 0,i;
         for(i=0;i<arreglo.length;i++){
			 if(arreglo[i]==8){
                            Num++;
                        }
              }
                      return Num;
                }
     
        public int NumCal9(){
    	int Num = 0,i;
         for(i=0;i<arreglo.length;i++){
			 if(arreglo[i]==9){
                            Num++;
                        }
              }
                      return Num;
            }
         public int NumCal10(){
    	int Num = 0,i;
         for(i=0;i<arreglo.length;i++){
			 if(arreglo[i]==10){
                            Num++;
                        }
              }
                      return Num;
            }
    public static void main(String[]args){
		int i=0;
		double resultado=0;
		Scanner Entrada=new Scanner(System.in);
			System.out.println("Ingresar numero de alumnos:");
			i=Entrada.nextInt();
		Calificaciones  a1=new Calificaciones (i);
		a1.ponerValorEn(i);
		a1.visualizarVector(a1);
		resultado=a1.calculaPromedio(i);
		System.out.println("El promedio de las calificaciones de todos los alumnos es: "+resultado);
                System.out.println("La calificación mayor es: "+a1.Mayor());
                System.out.println("La calificación menor es: "+a1.Menor());
                System.out.println("El numeros de reprobados es: "+a1.NumReprobados());
                System.out.println("El numeros de aprobados es: "+a1.NumAprobados());
                System.out.println("El numeros de alumnos con 6 es: "+a1.NumCal6());
                System.out.println("El numeros de alumnos con 7 es: "+a1.NumCal7());
                System.out.println("El numeros de alumnos con 8 es: "+a1.NumCal8());
                System.out.println("El numeros de alumnos con 9 es: "+a1.NumCal9());
                System.out.println("El numeros de alumnos con 10 es. "+a1.NumCal10());
	}
}