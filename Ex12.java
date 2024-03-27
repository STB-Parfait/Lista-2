public class Ex12 {
    public static void main(String[] args){
        double vec[] = new double[12];
        int x;
        double f=1;
        for(x=0;x<12;x++){
            vec[x] = Prompt.lerDecimal();
        }
        for(x=0;x<12;x++){
            if((vec[x]%2)==0&&vec[x]>0){
                f=f*vec[x];
            }
        }
        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir(f);
        Prompt.linhaEmBranco();
        Prompt.separador();

    }
}
