import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIPresentacion extends JFrame implements ActionListener
{
	 	private JLabel etqContador;
	    private JTextField tfContador;
	    private JButton btnContador;
	    private JButton btnContador1;
	    private JButton btnContador2;
	    public GUIPresentacion()
	    {
	        this.setLayout(new FlowLayout());
	        
	        etqContador = new JLabel("Número: ");
	        tfContador = new JTextField("0",10);
	        btnContador = new JButton("Incrementar");
	        btnContador1 = new JButton("Decrementar");
	        btnContador2 = new JButton("Reiniciar");
	        
	        tfContador.setEditable(false);
	        
	        this.add(etqContador);
	        this.add(tfContador);
	        this.add(btnContador);
	        this.add(btnContador1);
	        this.add(btnContador2);
	        
	        btnContador.addActionListener(this);
	        btnContador1.addActionListener(this);
	        btnContador2.addActionListener(this);
	        
	        this.setTitle("Contador");
	        this.setSize(600, 300);
	        this.setVisible(true);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	    
	    public static void main(String[] args) 
	    {
	        GUIPresentacion gui = new  GUIPresentacion();
	    }  
	    
	    @Override
	    
	    public void actionPerformed(ActionEvent evt)
	    {
	    	if(evt.getSource() == btnContador)
	    	{
	    		String cad = tfContador.getText();
	    		int numero = Integer.parseInt(cad);
	    		numero +=2 ;
	    		tfContador.setText(numero+"");
	    	}
	    	
	    	if(evt.getSource() == btnContador1)
	    	{
	    		String cad = tfContador.getText();
	    		int numero = Integer.parseInt(cad);
	    		numero -= 2;
	    		tfContador.setText(numero+"");
	    	}
	    	
	    	if(evt.getSource() == btnContador2)
	    	{
	    		String cad = tfContador.getText();
	    		int numero = Integer.parseInt(cad);
	    		numero = 0;
	    		tfContador.setText(numero+"");
	    	}
	    }
}