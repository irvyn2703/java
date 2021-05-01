/**
 * @(#)Vocales1.java
 *
 *
 * @author
 * @version 1.00 2011/11/24
 */

// Programa que sirve para contar cu�ntas vocales tiene una palabra o frase.

import java.io.*;

class Vocales1
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String palabra;
        System.out.print("Deme la cadena ");
		palabra=in.readLine();
		Contar (palabra);
	}

	public static void Contar(String p)
	{
		int n=0,cont=0;
		n=p.length();
		for(int i=0;i<n;i++)
		{
			if((p.charAt(i)=='a')||(p.charAt(i)=='e')||(p.charAt(i)=='i')||(p.charAt(i)=='o')||(p.charAt(i)=='u'))
			cont++;
		}
		System.out.println ("La palabra tiene  "+cont+"   vocales");
	}
}