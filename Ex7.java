package tst;

public class Ex7 {
	public static void main(String[] args) {
		char a[] = new char[5];
		char b[] = new char[5];
		int x,c=0;
		
		Prompt.imprimir("Vetor 1:");
		for(x=0;x<5;x++) {
			a[x] = Prompt.lerCaractere();
		}
		Prompt.imprimir("Vetor 2:");
		for(x=0;x<5;x++) {
			b[x] = Prompt.lerCaractere();
		}
		
		for(x=0;x<5;x++) {
			if(a[x]==b[x]) {
				c++;
			}
			else {
				Prompt.imprimir("Os vetores são diferentes");
				break;
			}
			
		}
		if(c==5) {
			Prompt.imprimir("Os vetores são iguais");
		}
	}
}
