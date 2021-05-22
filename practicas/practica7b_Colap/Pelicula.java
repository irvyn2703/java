import java.util.Scanner;
import java.io.*;

public class Pelicula {
	public Pelicula() {
	}

	int pos = 0;
	int idPelicula;
	int numExistencias;
	String titulo;
	String clasificacion;
	String productora;
	String actorPrincipal;
	float precio;
	InputStreamReader entrada = new InputStreamReader(System.in);
	BufferedReader flujoEntrada = new BufferedReader(entrada);
	Scanner lec = new Scanner(System.in);

	public Pelicula(int id, int exis, String tit, String clas, String produc, String act, float prec) {
		idPelicula = id;
		numExistencias = exis;
		titulo = tit;
		clasificacion = clas;
		productora = produc;
		actorPrincipal = act;
		precio = prec;
	}

	public void ingresalectura(int tam, Pelicula pelicula[]) {
		int i, id = 0, exis = 0;
		float prec = 0.0f;
		String tit = null, clas = null, produc = null, act = null, aux;
		System.out.println("Ingrese la informacion de la peliculas: \n");
		for (i = 0; i < tam; i++) {
			try {
				System.out.println("Pelicula " + (i + 1) + " de " + tam);
				System.out.print("Titulo:");
				tit = flujoEntrada.readLine();
				System.out.print("Clasificacion:");
				clas = flujoEntrada.readLine();
				System.out.print("Productora:");
				produc = flujoEntrada.readLine();
				System.out.print("Actor principal:");
				act = flujoEntrada.readLine();
				System.out.print("Id:");
				aux = flujoEntrada.readLine();
				id = Integer.parseInt(aux);
				System.out.print("Existencias:");
				aux = flujoEntrada.readLine();
				exis = Integer.parseInt(aux);
				System.out.print("Precio:");
				aux = flujoEntrada.readLine();
				prec = Float.parseFloat(aux);
				System.out.println("");
			} catch (IOException error) {
				System.err.println("Error " + error.getMessage());
			}
			pelicula[pos] = new Pelicula(id, exis, tit, clas, produc, act, prec);
			pos++;
		} // fin de for
	}// fin de metodo

	public void mostrarinformacion(int tam, Pelicula peli[]) {
		int i;
		for (i = 0; i < pos; i++) {
			System.out.println("Pelicula " + (i + 1));
			System.out.println("Titulo: " + peli[i].titulo);
			System.out.println("Clasificacion: " + peli[i].clasificacion);
			System.out.println("Productora: " + peli[i].productora);
			System.out.println("Actor principal: " + peli[i].actorPrincipal);
			System.out.println("Id: " + peli[i].idPelicula);
			System.out.println("Existencias: " + peli[i].numExistencias);
			System.out.println("Precio: " + peli[i].precio);
			System.out.println("");
			System.out.print("");
		}
	}

	public void ordenarPorId(boolean ascendente, Pelicula peli[]) {
		int i, j;
		int tempInt;
		String tempString;
		float tempFloat;
		if (ascendente == true) {
			for (i = 0; i < pos - 1; i++) {
				for (j = i + 1; j < pos; j++) {
					if (peli[i].idPelicula > peli[j].idPelicula) {
						// titulo
						tempString = peli[i].titulo;
						peli[i].titulo = peli[j].titulo;
						peli[j].titulo = tempString;
						// clasificacion
						tempString = peli[i].clasificacion;
						peli[i].clasificacion = peli[j].clasificacion;
						peli[j].clasificacion = tempString;
						// productora
						tempString = peli[i].productora;
						peli[i].productora = peli[j].productora;
						peli[j].productora = tempString;
						// actor
						tempString = peli[i].actorPrincipal;
						peli[i].actorPrincipal = peli[j].actorPrincipal;
						peli[j].actorPrincipal = tempString;
						// id
						tempInt = peli[i].idPelicula;
						peli[i].idPelicula = peli[j].idPelicula;
						peli[j].idPelicula = tempInt;
						// existencia
						tempInt = peli[i].numExistencias;
						peli[i].numExistencias = peli[j].numExistencias;
						peli[j].numExistencias = tempInt;
						// precio
						tempFloat = peli[i].precio;
						peli[i].precio = peli[j].precio;
						peli[j].precio = tempFloat;
					}
				}
			}
		} else {
			for (i = 0; i < pos - 1; i++) {
				for (j = i + 1; j < pos; j++) {
					if (peli[i].idPelicula < peli[j].idPelicula) {
						// titulo
						tempString = peli[i].titulo;
						peli[i].titulo = peli[j].titulo;
						peli[j].titulo = tempString;
						// clasificacion
						tempString = peli[i].clasificacion;
						peli[i].clasificacion = peli[j].clasificacion;
						peli[j].clasificacion = tempString;
						// productora
						tempString = peli[i].productora;
						peli[i].productora = peli[j].productora;
						peli[j].productora = tempString;
						// actor
						tempString = peli[i].actorPrincipal;
						peli[i].actorPrincipal = peli[j].actorPrincipal;
						peli[j].actorPrincipal = tempString;
						// id
						tempInt = peli[i].idPelicula;
						peli[i].idPelicula = peli[j].idPelicula;
						peli[j].idPelicula = tempInt;
						// existencia
						tempInt = peli[i].numExistencias;
						peli[i].numExistencias = peli[j].numExistencias;
						peli[j].numExistencias = tempInt;
						// precio
						tempFloat = peli[i].precio;
						peli[i].precio = peli[j].precio;
						peli[j].precio = tempFloat;
					}
				}
			}
		}
	}

	public void ordenarPorPrecio(boolean ascendente, Pelicula peli[]) {
		int i, j;
		int tempInt;
		String tempString;
		float tempFloat;
		if (ascendente == true) {
			for (i = 0; i < pos - 1; i++) {
				for (j = i + 1; j < pos; j++) {
					if (peli[i].precio > peli[j].precio) {
						// titulo
						tempString = peli[i].titulo;
						peli[i].titulo = peli[j].titulo;
						peli[j].titulo = tempString;
						// clasificacion
						tempString = peli[i].clasificacion;
						peli[i].clasificacion = peli[j].clasificacion;
						peli[j].clasificacion = tempString;
						// productora
						tempString = peli[i].productora;
						peli[i].productora = peli[j].productora;
						peli[j].productora = tempString;
						// actor
						tempString = peli[i].actorPrincipal;
						peli[i].actorPrincipal = peli[j].actorPrincipal;
						peli[j].actorPrincipal = tempString;
						// id
						tempInt = peli[i].idPelicula;
						peli[i].idPelicula = peli[j].idPelicula;
						peli[j].idPelicula = tempInt;
						// existencia
						tempInt = peli[i].numExistencias;
						peli[i].numExistencias = peli[j].numExistencias;
						peli[j].numExistencias = tempInt;
						// precio
						tempFloat = peli[i].precio;
						peli[i].precio = peli[j].precio;
						peli[j].precio = tempFloat;
					}
				}
			}
		} else {
			for (i = 0; i < pos - 1; i++) {
				for (j = i + 1; j < pos; j++) {
					if (peli[i].precio < peli[j].precio) {
						// titulo
						tempString = peli[i].titulo;
						peli[i].titulo = peli[j].titulo;
						peli[j].titulo = tempString;
						// clasificacion
						tempString = peli[i].clasificacion;
						peli[i].clasificacion = peli[j].clasificacion;
						peli[j].clasificacion = tempString;
						// productora
						tempString = peli[i].productora;
						peli[i].productora = peli[j].productora;
						peli[j].productora = tempString;
						// actor
						tempString = peli[i].actorPrincipal;
						peli[i].actorPrincipal = peli[j].actorPrincipal;
						peli[j].actorPrincipal = tempString;
						// id
						tempInt = peli[i].idPelicula;
						peli[i].idPelicula = peli[j].idPelicula;
						peli[j].idPelicula = tempInt;
						// existencia
						tempInt = peli[i].numExistencias;
						peli[i].numExistencias = peli[j].numExistencias;
						peli[j].numExistencias = tempInt;
						// precio
						tempFloat = peli[i].precio;
						peli[i].precio = peli[j].precio;
						peli[j].precio = tempFloat;
					}
				}
			}
		}
	}

	public void buscar(boolean t, Pelicula peli[]) {
		int i = 0;
		String b, c;
		if (t == true) {
			System.out.println("escribe el titulo de la pelicula:");
		} else {
			System.out.println("escribe el actor principal de la pelicula:");
		}
		b = lec.nextLine();
		for (i = 0; i < pos; i++) {
			if (t == true) {
				c = peli[i].titulo;
			} else {
				c = peli[i].actorPrincipal;
			}

			if (b.compareTo(c) == 0) {
				System.out.println("Pelicula " + peli[i].titulo);
				System.out.println("Clasificacion: " + peli[i].clasificacion);
				System.out.println("Productora: " + peli[i].productora);
				System.out.println("Actor principal: " + peli[i].actorPrincipal);
				System.out.println("Id: " + peli[i].idPelicula);
				System.out.println("Existencias: " + peli[i].numExistencias);
				System.out.println("Precio: " + peli[i].precio);
				System.out.println("");
				System.out.print("");
			}
		}
	}

	public void guardar(Pelicula peli[]) {
		FileWriter fichero = null;
		PrintWriter inicio = null;
		try {
			fichero = new FileWriter("libros.txt");
			inicio = new PrintWriter(fichero);

			for (int i = 0; i < pos; i++){
				inicio.println("Pelicula " + (i + 1));
				inicio.println("Titulo: " + peli[i].titulo);
				inicio.println("Clasificacion: " + peli[i].clasificacion);
				inicio.println("Productora: " + peli[i].productora);
				inicio.println("Actor principal: " + peli[i].actorPrincipal);
				inicio.println("Id: " + peli[i].idPelicula);
				inicio.println("Existencias: " + peli[i].numExistencias);
				inicio.println("Precio: " + peli[i].precio);
				inicio.println("");
				inicio.print("");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
