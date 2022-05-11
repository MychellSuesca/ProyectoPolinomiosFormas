package Clases;

public class Forma2 {

    //Atributos
    private int du,n,vf2[];

    public Forma2(int du, int n, int[] vf2) {
        du = (vf2[0]*2)+2;
        this.n = n;
        vf2 = new int[n];
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

    public int[] getVf2() {
        return vf2;
    }

    public void setVf2(int[] vf2) {
        this.vf2 = vf2;
    }
    
    
}
