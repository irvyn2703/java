import javax.swing.JComboBox;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Temperatura  implements ActionListener{

	private JLabel label1,label2,label3;
	private JComboBox<String> lista1;
	private JTextField campo1,campo2;
	private JButton boton;

    // private JMenuBar menu;
    // private JMenu edicion;
    // private JMenuItem copiar,pegar;
	
	public Temperatura() {
        JFrame form = new JFrame();
		JPanel panel = new JPanel();
		panel.setBounds(20,50,600,125);
		form.setLayout(null);
		panel.setLayout(null);
		form.setSize(700,150);

        // crea la barra
        // menu = new JMenuBar();
        // menu.setBounds(0,0,400,30);
        // form.add(menu);

        // crea las opciones principales
        // edicion = new JMenu("Edicion");
        // menu.add(edicion);

        //  crea las opciones secundarias
        // copiar = new JMenuItem("copiar");
        // edicion.add(copiar);
        // pegar = new JMenuItem("pegar");
        // edicion.add(pegar);

		
		label1 = new JLabel("°Celsius:");
		label1.setBounds(10, 10, 60, 20);
		panel.add(label1);
		campo1 = new JTextField();
		campo1.setBounds(80, 10, 60, 20);
		panel.add(campo1);
		campo1.setHorizontalAlignment(JTextField.RIGHT);
		
		label2 = new JLabel("Convertir en: ");
		label2.setBounds(150, 10, 75, 20);
		panel.add(label2);
		String grados[] = {"","Fahrenheit","Kelvin","yo"};
		lista1 = new JComboBox<String>(grados);
		lista1.setBounds(235, 10, 90, 20);
		//lista1.addActionListener(this);
		panel.add(lista1);
		
		label3 = new JLabel("Resultado:");
		label3.setBounds(335, 10, 80, 20);
		panel.add(label3);
		campo2 = new JTextField();
		campo2.setBounds(425,10,75,20);
		panel.add(campo2);
		campo2.setEditable(false);
		
		boton = new JButton("Calcular");
		boton.setBounds(510, 10, 90, 20);
		panel.add(boton);
		boton.addActionListener(this);
		
		form.add(panel);
		form.setVisible(true);
		
	}
	
	public static double calcularFahrenheit(double celsius) {
		double conversion = (celsius/5)+32;
		return conversion;
	}
	
	public static double calcularKelvin(double celsius) {
		double conversion = celsius + 273.15;
		return conversion;
	}

	public static double calcularYo(double yo){
		double conversion = yo * 1.5 + 10;
		return conversion;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String option = lista1.getSelectedItem().toString();
		double resultado;
		if(option.equals("Fahrenheit")) {
			resultado = calcularFahrenheit(Double.parseDouble(campo1.getText().toString()));
			campo2.setText(String.valueOf(resultado));
		}
		
		if(option.equals("Kelvin")) {
			resultado = calcularKelvin(Double.parseDouble(campo1.getText().toString()));
			campo2.setText(String.valueOf(resultado));
		}

        if(option.equals("yo")){
            resultado = calcularYo(Double.parseDouble(campo1.getText()));
			campo2.setText(String.valueOf(resultado));       
        }
	}
	
	public static void main(String[] args) {
		Temperatura t = new Temperatura();
		
	}
}
