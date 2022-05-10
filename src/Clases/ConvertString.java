package Clases;

public class ConvertString {
	
	//Atributos
	private String sCadena;
	
	public String getsCadena() {
        return this.sCadena;
    }

    public void setsCadena(String sCadena) {
        int j = 0;
        String s="";
        char []Vc = sCadena.toCharArray();
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
        
        for (int k = 0; k < Vs.length; k++) {
            System.out.print("["+Vs[k]+"]");
        }
        
        this.sCadena = s;
    }
}
