//package facto;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.*;

public class factorial extends Frame {
  // crear los componentes

  TextField dato1 = new TextField();
  TextField resultado = new TextField();
  Button boton = new Button("resultado");
  Label etiqueta = new Label();
  Label ingresar = new Label("ingresa el nummero:");
  Label factorial = new Label("factorial");

  public factorial() {

    this.setSize(400, 400);
    this.setLocation(20, 20);
    // caja texto
    // posicionar mis elementos

    // etiqueta
    ingresar.setLocation(20, 25);
    ingresar.setSize(200, 75);
    this.add(ingresar);

    factorial.setLocation(250, 25);
    factorial.setSize(500, 75);
    this.add(factorial);

    dato1.setSize(60, 20); // dimension
    dato1.setLocation(30, 100);// posicionar lugar
    this.add(dato1);// a�ade al contenedor
    // caja de resultado
    resultado.setSize(60, 20);
    resultado.setLocation(250, 100);
    resultado.setEditable(false);
    this.add(resultado);

    boton.setSize(100, 30);
    boton.setLocation(150, 170);
    this.add(boton);
    add(etiqueta);

    // titulo de la ventana
    setTitle("Factorial de un numero");
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

  static public int Fact(int x) {

    if (x == 0) {
      return 1;
    } else {
      return x * Fact(x - 1);
    }

  }

  public boolean action(Event e, Object o) {
    int a, c;
    if (e.target == boton) {

      a = Integer.parseInt(dato1.getText());
      c = Fact(a);

      resultado.setText(c + "");
    }
    return true;
  }

  public static void main(String[] args) {
    factorial miFrame = new factorial();

  }
}