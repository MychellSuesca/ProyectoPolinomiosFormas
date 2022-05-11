package Main;

import javax.swing.JOptionPane;

import Clases.Forma1;
import Clases.Forma2;

public class Main {

	public static void main(String[] args) {
		String[] result = null; 
		String subMenu = null; 
		String res = null;
		String termino = null;
        result = Menu();
            switch(result[0]){
                case "1":
                	subMenu = JOptionPane.showInputDialog("Por favor ingrese la opción que desee realizar\n"+
                              "1.) Insertar Término \n"+
                			  "2.) Eliminar Término");
                	InsertarEliminarTerminos iet = new InsertarEliminarTerminos();
                	switch(subMenu){
                		case "1":
                			termino = JOptionPane.showInputDialog("Ingrese el término a "+ (subMenu == "1" ? "insertar" : "eliminar"));
                        	iet.setTermino(termino);
                        	iet.setPolinomio(result[1]);
                			res = iet.insertarTermino();
                		break;
                		case "2":
                			termino = JOptionPane.showInputDialog("Ingrese el término a "+ (subMenu == "1" ? "insertar" : "eliminar"));
                        	iet.setTermino(termino);
                        	iet.setPolinomio(result[1]);
                			res = iet.eliminarTermino();
                		break;
                		default:
                			JOptionPane.showMessageDialog(null, "Opción no válida", "Proyecto Polinomios", 0);
                        break;
                	}
                break;
                case "2":
                	subMenu = JOptionPane.showInputDialog("Por favor ingrese la opción que desee realizar\n"+
                            "1.) Mostrar en forma 1\n"+
              			  	"2.) Mostrar en forma 2\n"+
              			  	"3.) Mostrar en forma 3\n");
                	switch(subMenu){
            			case "1":
            				//Forma1 f1 = new Forma1();
            				//res = f1.setVf1(result[1]);;
            				break;
            			case "2":
            				//Forma2 f2 = new Forma2();
            				//res = f2.setVf2(result[1]);;
            				break;
            			case "3":
            				//Forma3 f3 = new Forma3();
            				//res = f3.setVf3(result[1]);;
            				break;
            			default:
            				JOptionPane.showMessageDialog(null, "Opción no válida", "Proyecto Polinomios", 0);
            				break;
                	}
                case "3":
                	termino = JOptionPane.showInputDialog("Ingrese el valor de X \n");
                	EvaluarSegunX x = new EvaluarSegunX();
                break; 
                case "4":
                	subMenu = JOptionPane.showInputDialog("Por favor ingrese la forma en la que desea sumar los dos polinomios\n"+
                            "1.) Forma 1\n"+
              			  	"2.) Forma 2\n"+
              			  	"3.) Forma 3\n");
                	switch(subMenu){
            			case "1":
            				break;
            			case "2":
            				break;
            			case "3":
            				break;
            			default:
            				JOptionPane.showMessageDialog(null, "Opción no válida", "Proyecto Polinomios", 0);
            				break;
                	}
                case "5":
                	subMenu = JOptionPane.showInputDialog("Por favor ingrese la forma en la que desea multiplicar los dos polinomios\n"+
                            "1.) Forma 1\n"+
              			  	"2.) Forma 2\n"+
              			  	"3.) Forma 3\n");
                	switch(subMenu){
            			case "1":
            				break;
            			case "2":
            				break;
            			case "3":
            				break;
            			default:
            				JOptionPane.showMessageDialog(null, "Opción no válida", "Proyecto Polinomios", 0);
            				break;
                	}
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
