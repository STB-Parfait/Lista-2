package tst;

public class Ex4 {
	public static void main(String[] args) {
    	int[] vec = new int[5];
    	int[] val = new int[5];
    	int x,n;
    	n=Prompt.lerInteiro();
    	for(x=0;x<5;x++) {
    		vec[x] = Prompt.lerInteiro();
    		if(vec[x]>n) {
    			val[x]=1;
    		}
    		else if(vec[x]==n) {
    			val[x]=2;
    		}
    		else {
    			val[x]=0;
    		}
    	}
    	Prompt.separador();
    	Prompt.linhaEmBranco();
    	for(x=0;x<5;x++) {
    		switch(val[x]) {
    		case 0:
    		Prompt.imprimir("Índice[" + x + "] é inferior");
    		break;
    		
    		case 2:
    		Prompt.imprimir("Índice[" + x + "] é igual");
    		break;
    		
    		default:
    		break;
    		}
    	}
    	Prompt.linhaEmBranco();
        Prompt.separador();
    }
}
