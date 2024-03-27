package tst;

public class Ex5 {
	public static void main(String[] args) {
		int[] vec = new int[5];
		int x;
		for(x=0;x<5;x++) {
			vec[x] = Prompt.lerInteiro();
		}
		Prompt.linhaEmBranco();
		Prompt.separador();
    	Prompt.linhaEmBranco();
    	Prompt.imprimir("qual número deseja consultar?");
		int n = Prompt.lerInteiro();
		int c = 0;
		for(x=0;x<5;x++) {
			if(vec[x]==n) {
				c++;
			}
		}
		Prompt.separador();
    	Prompt.linhaEmBranco();
		Prompt.imprimir(n + " apareceu " + c + " vezes no vetor");
		Prompt.linhaEmBranco();
        Prompt.separador();
	}
}
