package Main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String[] result = null; 
		String subMenu = null; 
		String res = null;
        result = Menu();
            switch(result[0]){
                case "1":
                	subMenu = JOptionPane.showInputDialog("Por favor ingrese la opción que desee realizar\n"+
                              "1.) Insertar Término \n"+
                			  "2.) Eliminar Término");
                	InsertarEliminarTerminos iet = new InsertarEliminarTerminos();
                	String termino = JOptionPane.showInputDialog("Ingrese el término:\n");
                	iet.setTermino(termino);
                	iet.setPolinomio(result[1]);
                	System.out.println(subMenu);
                	switch(subMenu){
                		case "1":
                			res = iet.insertarTermino();
                		break;
                		case "2":
                			iet.eliminarTermino();
                		break;
                	}
                break;
                case "2":
                case "3":
                break; 
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                break;
                default:
                break; 
            }
                  
            System.out.println(res);   
	}
	
	public static String[] Menu(){
        		
        String opc = null;
        String polinomio = null, polinomio2 = "";
        
        opc = JOptionPane.showInputDialog("Bienvenido(a)\n"+
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
                "(Ingrese la opción)");
        
        switch(opc){
        	case "1":
        	case "2":
        	case "3":
        	polinomio = JOptionPane.showInputDialog("Ingrese el polinomio:\n");
        	break;
        	case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            	polinomio = JOptionPane.showInputDialog("Ingrese el polinomio uno:\n");
            	polinomio2 = JOptionPane.showInputDialog("Ingrese el polinomio dos:\n");
            break;
            default:
            	JOptionPane.showMessageDialog(null, "Opción no válida", "Proyecto Polinomios", 0);
        
            	Menu();
            break; 
        }
        String[] result = {opc, polinomio, polinomio2};
        
        return result;
	}
}
