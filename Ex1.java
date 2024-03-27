package tst;

public class Ex1 {
    public static void main(String[] args) {
    	int[] vec = new int[5];
    	int x;
    	double m = 0;
    	for(x=0;x<5;x++) {
    		vec[x] = Prompt.lerInteiro();
    		if(x==0) {
    			m=vec[x];
    		}
    		else {
    			m=m+vec[x];
    		}
    	}
    	
    	m=m/5;
    	
    	Prompt.separador();
    	Prompt.linhaEmBranco();
    	for(x=0;x<5;x++) {
    		if(vec[x]>m) {
    			Prompt.imprimir("vec[" + (x) + "] = MAIOR");
    		}
    		else if(vec[x]<m) {
    			Prompt.imprimir("vec[" + (x) + "] = menor");
    		}
    		else {
    			Prompt.imprimir("vec[" + (x) + "] = Igual");
    		}
    	}
    	Prompt.linhaEmBranco();
    	Prompt.separador();
    	
    }
}
