package Main;

import Clases.ConvertString;

public class InsertarEliminarTerminos {
	
	//Atributos
	private String polinomio, termino;
	
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
        vp.setsCadena(this.polinomio);
        this.polinomio = vp.getsCadena();
        System.out.println(this.polinomio);
    	return null;
    }
    
}
