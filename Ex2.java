package tst;

public class Ex2 {
    public static void main(String[] args) {
    	int[] vec = new int[5];
    	int[] val = new int[5];
    	int x;
    	for(x=0;x<5;x++) {
    		vec[x] = Prompt.lerInteiro();
    		if(vec[x]>0) {
    			val[x]=1;
    		}
    		else if(vec[x]<0) {
    			val[x]=2;
    		}
    		else {
    			val[x]=3;
    		}
    	}
    	Prompt.separador();
    	Prompt.linhaEmBranco();
    	for(x=0;x<5;x++) {
    		switch(val[x]) {
    		case 1:
    		Prompt.imprimir("Positivo");
    		break;
    		
    		case 2:
    		Prompt.imprimir("Negativo");
    		break;
    		
    		case 3:
    		Prompt.imprimir("Zero");
    		}
    	}
    	Prompt.linhaEmBranco();
        Prompt.separador();
    }
}
