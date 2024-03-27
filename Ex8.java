package tst;

public class Ex8 {
	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[10];
		int x=0;
		
		for(x=0;x<5;x++) {
			a[x]=Prompt.lerInteiro();
		}
		for(x=0;x<5;x++) {
			b[x]=Prompt.lerInteiro();
		}
		
		//-----
		
		for(x=0;x<10;x++) {
			if(x<5) {
				c[x]=a[x];
			}
			else {
				c[x]=b[x-5];
			}
		}
		
		//-----
		Prompt.separador();
		Prompt.linhaEmBranco();
		for(x=0;x<10;x++) {
			Prompt.imprimir(c[x]);
		}
		Prompt.linhaEmBranco();
		Prompt.separador();
		
	}
}
