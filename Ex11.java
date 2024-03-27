public class Ex11 {
    public static void main(String[] args){
        double a[] = new double[5];
        double b[] = new double[5];
        double sum[] = new double[5];
        double f;
        int x;

        Prompt.imprimir("Vetor 1");
        for(x=0;x<5;x++){
            a[x] = Prompt.lerDecimal();
        }
        Prompt.imprimir("Vetor 2");
        for(x=0;x<5;x++){
            b[x] = Prompt.lerDecimal();
        }
        f = 0;
        for(x=0;x<5;x++){
            sum[x] = a[x]*b[x];
            f = f+sum[x];
        }

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir(f);
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}
