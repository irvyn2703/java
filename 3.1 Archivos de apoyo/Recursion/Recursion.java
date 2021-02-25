/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Personal
 */
 
public class Recursion {
public static int factorial( int n){
    if (n<=0)
        return 1;
    else 
        return n*factorial(n-1);   
}
public static int factorialIterativo( int n){
    int fact=1;
    for (int i=1;i<=n;i++){ 
        fact=fact*i;
    }
    return fact;    
}
public static void fun(int n) 
{ 
 if (n > 0) { 
	System.out.println(" "+ n); 
	fun(n - 1); 
        // Ultima instrucción en el método
	} 
} 
public static int func(int n) 
{ 
   if (n > 100)
        return n - 10;
//El parámetro de func es una  
// llamada recursiva de func 
   return func(func(n + 11)); 
} 
public static int fib(int n) 
{ 
    if (n ==1 || n ==2 )
        return 1; 
    else
       return fib(n-1) + fib(n-2);
// Existen dos llamadas recursivas 
// a fib dentro del método recursivo 
} 
public static int par(int n){
  if (n==0) return 1;
   else return (impar(n-1));
}
public static int impar(int n){
  if (n==0) return 0; 
    else return(par(n-1));
} 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=0;
        System.out.println("Ingres un numero: ");
        n=leer.nextInt();
        func(n);
        System.out.println(" "+ fib(n));
        if(par(n)!=0)
            System.out.println("El número es par");
        else
        System.out.println("El número es impar");
}
}

