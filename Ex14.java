public class Ex14 {
    public static void main(String[] args){
        int vec[] = new int[5];
        int x,c;
        c = 0;
        for(x=0;x<5;x++){
            vec[x] = Prompt.lerInteiro();
            if(vec[x]>c){
                c=x-1;
            }
        }
        vec[4] = vec[c];

        Prompt.separador();
        Prompt.linhaEmBranco();
        for(x=0;x<5;x++){
            Prompt.imprimir(vec[x]);
        }
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}
