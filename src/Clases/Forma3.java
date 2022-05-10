package Clases;

public class Forma3 {
	//Atributos
    Nodo Punta,Final;
    
    //Metodos

    public Forma3(Nodo Punta) {
        Punta = null;
    }
    
    public void InsertarFinal(int c,int e){
        
        Nodo x = new Nodo(c, e);
        
        if (Punta==null)
        {
            Punta=x;
        }
        else
        {
            Final.setLiga(x);
        }
    }
}
