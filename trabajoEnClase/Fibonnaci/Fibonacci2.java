import java.awt.*;
import java.awt.Frame;
import java.awt.event.*;

public class Fibonacci2 extends Frame {

	// cajas de texto
	TextField dato1 = new TextField();
	TextField resultado = new TextField();
	Button boton = new Button("Resultado");
	Label etiqueta = new Label();
	Label ingresar = new Label("ingresa el nummero:");
	Label fibonacci = new Label("fibonacci");

	// constructor
	public Fibonacci2() {
		// tama�os ylocalizaciones
		this.setSize(400, 400);
		this.setLocation(20, 20);
		// etiqueta
		ingresar.setLocation(20, 25);
		ingresar.setSize(200, 75);
		this.add(ingresar);

		fibonacci.setLocation(250, 25);
		fibonacci.setSize(500, 75);
		this.add(fibonacci);


		this.add(dato1);
		dato1.setSize(60, 20);
		dato1.setLocation(30, 100);
		this.add(resultado);
		resultado.setSize(60, 20);
		resultado.setLocation(250, 100);
		resultado.setEditable(false);
		this.add(boton);
		setTitle("Serie de Fibonacci");
		boton.setSize(100, 30);
		boton.setLocation(150, 170);
		add(etiqueta);
		this.setVisible(true);

		// Agregar evento de ventana para cerrar
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				hide();
				dispose();
				System.exit(0);
			}
		});
	}

	static int fibo(int n) {
		if (n < 0)
			return 1;
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		return (fibo(n - 1) + fibo(n - 2));
	}

	public boolean action(Event e, Object o) {
		if (e.target == boton) {
			int a, temp;

			a = Integer.parseInt(dato1.getText());
			temp = fibo(a);

			resultado.setText(temp + "");
		}
		return true;
	}

	public static void main(String[] args) {
		Fibonacci2 miFrame = new Fibonacci2();
	}
}