package Clases;

public class ConvertString {
	
	//Atributos
	private String sCadena;
	private String[] aCadena;
	
	public String getsCadena() {
        return this.sCadena;
    }
	
	public String[] getaCadena() {
        return this.aCadena;
    }

    public void setsCadena(String sCadena) {
        String s = "";
        String[] Vs = convert(sCadena);
        for (int k = 0; k < Vs.length; k++) {
            s = s + Vs[k];
        }

        this.sCadena = s;
    }
    
    public void setaCadena(String aCadena) {
    	
    	String[] Vs = convert(aCadena);

        this.aCadena = Vs;
    }
    
    public String[] convert(String cadena) {
    	int j = 0;
        String s="";
        char []Vc = cadena.toCharArray();
        String Vs[] = new String[Vc.length];
        
        for (int i = 0; i < Vc.length; i++) {
            
            if(Vc[i]=='-' || Character.isDigit(Vc[i]))
            {
                s = s + Vc[i];
            }
            else
            {
                if(Vc[i] == 'x')
                {
                    Vs[j] = s;
                    j++;
                    s = "";
                }
            }
            if(Vc[i]=='^')
            {
                Vs[j] = Character.toString(Vc[i+1]);
                i++;
                j++;
            }
            
            if(Vc[i] == '+') {
            	Vs[j] = Character.toString(Vc[i+1]);
            }
            
        }
        
        return Vs;
    }
}
