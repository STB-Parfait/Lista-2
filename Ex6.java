package tst;

public class Ex6 {
	public static void main(String[] args) {
		double not[] = new double[5];
		double pes[] = new double[5];
		double f = 0;
		int x;
		for(x=0;x<5;x++) {
			Prompt.imprimir("[Insira a nota (" + (x+1) + ") ]");
			not[x] = Prompt.lerDecimal();
			Prompt.imprimir("[Insira o peso (" + (x+1) + ") ]");
			pes[x] = Prompt.lerDecimal();
		}
		f = ((not[0]*pes[0])+(not[1]*pes[1])+(not[2]*pes[2])+(not[3]*pes[3])+(not[4]*pes[4]))/(pes[0]+pes[1]+pes[2]+pes[3]+pes[4]);
		
		Prompt.separador();
		Prompt.linhaEmBranco();
		Prompt.imprimir("Nota Final: " + f);
		Prompt.linhaEmBranco();
		Prompt.separador();
		
		
	}
}
