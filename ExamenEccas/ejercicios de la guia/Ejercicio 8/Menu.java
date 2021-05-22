//  Fecha: 07 / Mayo / 2021
//  Objetivo: Calcular un exponente.
//  Elaboro Equipo 4:
//      1) Flores Navarro Emmanuel
//      2) Ramírez Morales Erick Brian

//Inicio de la clase
import javax.swing.JOptionPane;
public class Menu {
    //Variable de instancia
    private Exponente exponente = new Exponente();
    
    //Método constructor
    public Menu() {}
    
    //Metódo definido por el programador
    public void iniciarMenu() {
        //Atributos
        String panel;
        int opc;
        
        //Inicio Menu
        do{
            panel = JOptionPane.showInputDialog(null,"Ingrese el numero de la opcion a ejecutar:"
                +"\n  1) Inicio"
                +"\n  2) Salir","MENU",JOptionPane.QUESTION_MESSAGE);
            
            //Iniciar excepcion
            try {
                //Ingresar un valor
                opc = Integer.parseInt(panel);
            } catch(Exception e) {
                //Capturar y mostrar error
                JOptionPane.showMessageDialog(null,"ERROR..."+e.getMessage(),"ERROR",JOptionPane.WARNING_MESSAGE);
                opc = 0;
            }
            switch(opc) {
                case 2 -> {
                    //Mostrar mensaje y cerrar panel
                    JOptionPane.showMessageDialog(null,"Gracias por usar este programa, hasta luego!!!");
                    System.exit(0);
                }
                case 1 -> {
                    //Acceder a un método
                    exponente.construirVentana();
                    opc = 2;
                }
                default -> {
                    //Mostrar mensaje
                    JOptionPane.showMessageDialog(null,"Opcion no valida","ERROR",JOptionPane.WARNING_MESSAGE);
                }
            }
        }while(opc != 2);
        //Fin Menu
    }
}
//Fin de la clase