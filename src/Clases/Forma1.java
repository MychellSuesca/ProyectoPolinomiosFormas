package Clases;

public class Forma1 {
	
	//Atributos
    private int du,n,vf1[];
    
    //Metodos

    public Forma1(int n) {
        du = du-1;
        this.n = n;
        vf1 = new int [n];
    }

    public int getDu() {
        return du;
    }

    public void setDu(int du) {
        this.du = du;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getVf1() {
        return vf1;
    }

    public void setVf1(int[] vf1) {
        this.vf1 = vf1;
    }
}
