package Clases;

public class Nodo {
	//Atributos
    
    private int coe, exp;
    private Nodo liga;
    
    //Metodos

    public Nodo(int coe, int exp, Nodo liga) {
        this.coe = coe;
        this.exp = exp;
        liga = null;
    }
    public Nodo() {
        coe=0;
        exp=0;
        liga = null;
    }

    Nodo(int c, int e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCoe() {
        return coe;
    }

    public void setCoe(int coe) {
        this.coe = coe;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
}
