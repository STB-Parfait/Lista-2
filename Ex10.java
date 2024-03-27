public class Ex10 {
    public static void main(String[] args){
        int a[] = new int[5];
        int b[] = new int[5];
        int x,y;

        y=4;

        Prompt.imprimir("Vetor A");
        for(x=0;x<5;x++){       
            a[x] = Prompt.lerInteiro();
            b[y] = a[x];
            y--;
        }
        Prompt.separador();
        Prompt.linhaEmBranco();
        for(x=0;x<5;x++){
            Prompt.imprimir(b[x]);
        }
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}
