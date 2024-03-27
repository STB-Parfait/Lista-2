package tst;

public class Ex3 {
    public static void main(String[] args) {
    	int[] vec = new int[5];
    	int[] val = new int[5];
    	int x;
    	for(x=0;x<5;x++) {
    		vec[x] = Prompt.lerInteiro();
    		if(vec[x]>0) {
    			val[x]=vec[x]*2;
    		}
    		else if(vec[x]<0) {
    			val[x]=vec[x]*2;
    		}
    		else {
    			val[x]=vec[x]*2;
    		}
    	}
    	Prompt.separador();
    	Prompt.linhaEmBranco();
    	for(x=0;x<5;x++) {
    		Prompt.imprimir(val[x]);
    	}
    	Prompt.linhaEmBranco();
        Prompt.separador();
    	}

    }
