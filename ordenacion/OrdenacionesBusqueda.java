import java.io.*;

public class OrdenacionesBusqueda {

	public OrdenacionesBusqueda() {

	}

	public int busquedaBin(int[] arreglo, int clave) {
		boolean encontre = false;
		int central, bajo = 0, alto;
		int valorcentral;
		alto = arreglo.length - 1;

		while (bajo <= alto && !encontre) {
			central = (bajo + alto) / 2;
			valorcentral = arreglo[central];
			if (clave == valorcentral) {
				return central;
			} else if (clave > valorcentral) {
				alto = central - 1;
			} else {
				bajo = central + 1;
			}
		}
		return -1;
	}

	// BURBUJA O BUBBLESORT MEJORADO
	public static void burbuja(int[] arreglo) {
		int i, j;
		int temp;
		boolean sorted = false;

		for (i = 0; i < arreglo.length - 1 && !sorted; i++) {
			sorted = true;
			for (j = arreglo.length - 1; j > i; j--) {
				if (arreglo[j] > arreglo[j - 1]) {
					temp = arreglo[j];
					arreglo[j] = arreglo[j - 1];
					arreglo[j - 1] = temp;
					sorted = false;
				}
			}
		}
	}

	public static void muestra(int[] arreglo, String cad) {
		System.out.print(cad);
		for (int i = 0; i < arreglo.length; i++)
			System.out.print(arreglo[i] + " ");
		System.out.print("\n\n");
	}

	public static void aleatorios(int[] arreglo, int num) {

		int valor, total = 0;
		for (int i = 0; i < num; i++) {
			arreglo[i] = 1 + (int) (Math.random() * 100);
			System.out.println("numero " + arreglo[i]);

		}
	}

	public void guardar(int[] arreglo, int num) {
		// Guradar de modo texto

		FileWriter fichero = null;
		PrintWriter inicio = null;
		try {
			fichero = new FileWriter("prueba.txt");
			inicio = new PrintWriter(fichero);

			for (int i = 0; i < num; i++)
				inicio.println("arreglo = " + arreglo[i]);

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

