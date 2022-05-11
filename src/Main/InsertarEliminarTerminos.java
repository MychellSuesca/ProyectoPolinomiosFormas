package Main;

import javax.swing.JOptionPane;

import Clases.ConvertString;

public class InsertarEliminarTerminos {
	
	//Atributos
	private String polinomio, termino;
	private int grado;
	
	public String getPolinomio() {
        return this.polinomio;
    }

    public void setPolinomio(String polinomio) {
        this.polinomio = polinomio;
    }
    
    public String getTermino() {
        return this.termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }
    
    public String insertarTermino() {
    	ConvertString vp = new ConvertString();
        vp.setaCadena(this.polinomio);
        String[] polinomio  = vp.getaCadena();
        int mayor = 0;
        int du = 0;
        String s = "";
        for (int i = 0; i < polinomio.length; i++) {
			if(Integer.parseInt(polinomio[i+1]) > mayor) {
				mayor = Integer.parseInt(polinomio[i+1]);
				s=s+polinomio[i]+polinomio[i+1];
				i++;
				i++;
			}else if(Integer.parseInt(polinomio[i+1]) == mayor) {
				String accion = JOptionPane.showInputDialog("El vector polinomio con valor" +polinomio[i]+" en la posicion " + i+ " Es igual a" + mayor+ "Por favor ingrese la opción que desee realizar\n"+
						"1.) Reemplazar"+
						"2.) Eliminar"+
						"3.) Sumar"+
						"4.) No hacer nada");
			}
		}
        return s;
        
    }
    
    public String eliminarTermino() {
    	ConvertString vp = new ConvertString();
        vp.setsCadena(this.polinomio);
        return vp.getsCadena();
        
    }
    
}
