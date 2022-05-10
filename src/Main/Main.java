package Main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int opc = 0; 
		String polinomio, polinomio2 = "";
        do{
            opc = Menu();
            switch(opc){
                case 1:
                case 2:
                case 3:
                	polinomio = JOptionPane.showInputDialog("Ingrese el polinomio:\n");
                break; 
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                	polinomio = JOptionPane.showInputDialog("Ingrese el polinomio uno:\n");
                	polinomio2 = JOptionPane.showInputDialog("Ingrese el polinomio dos:\n");
                break;
                default:
                	JOptionPane.showMessageDialog(null, "Opción no válida", "Proyecto Polinomios", 0);
            
                	Menu();
                break; 
            }
       
        }while(opc != 4);

	}
	
	public static int Menu(){
        		
        int opc = 0;
        
        opc = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido(a)\n"+
        		"Por favor ingrese la opción que desee realizar\n"+
        		"*** MENÚ PRINCIPAL *** \n"+
                "1.) Insertar - Eliminar Término \n"+
                "2.) Mostrar Forma \n"+
                "3.) Evaluar el polinomio según un valor de X ingresado \n"+
                "4.) Sumar dos polinomios en la misma forma \n"+
                "5.) Multiplicar dos polinomios en la misma forma \n"+
                "6.) Sumar dos polinomios F1 + F2 = F3 \n"+
                "7.) Multiplicar dos polinomios F3 * F1 = F2 \n"+
                "8.) Dividir dos polinomios F2 / F3 = F1 \n"+
                "9.) Salir \n"+
                "(Ingrese la opción)"));
        
        return opc;
    }  

}
