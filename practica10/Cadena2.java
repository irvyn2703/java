/**
 * @(#)Cadena2.java
 *
 *
 * @author
 * @version 1.00 2011/11/24
 */


import java.io.*;
public class Cadena2 {



   public static void main (String args[]) throws IOException
 		{

 		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 		String cad = new String(""); // cadena 1
 		String s = new String(""); // cadena para leer solo un caracter
 		char c;// caracter a buscar

 		String nueva = new String("");
 		System.out.print("deme la cadena ");
 		cad=in.readLine();
 		System.out.print("Deme el caracter ");
 		s = in.readLine ();
 		c=s.trim().charAt(0);
 		System.out.println("caracracter leido " +c );
 		nueva = reemplazar(cad,c);
 		System.out.println("la cadena nueva es "+nueva);
 		}
 		public static String reemplazar(String st, char  letra)
		{
		char a;
		String otra = new String(""); // nueva cadena a formar
		for (int i=0;i<st.length();i++){ // recorremos la cadena caracter a caracter
			a = st.charAt(i); // tomamos un caracter
			if (a == letra) { // si el caracter es el buscado
				otra = otra + '*'; // colocamos un asterisco en al cadena nueva
			}
			else {
				otra = otra +a;// de lo contrario colocamos el mismo caracter que tenia
			}
		}
		return otra;// devolvemos la nueva cadena
 	}



 }