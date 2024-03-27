public class Ex15 {
    public static void main(String[] args){
        int vec[] = new int[5];
        int b[] = new int[5];
        int x;

        for(x=0;x<5;x++){
            vec[x] = Prompt.lerInteiro();
            if(x==0){
                b[x] = vec[x];
            }
            else{
                if(vec[x]>b[x-1]){
                    b[x] = vec[x];
                }
                else{
                    b[x] = 0;
                }
            }
    }
    Prompt.separador();
    Prompt.linhaEmBranco();
    for(x=0;x<5;x++){
        if(b[x]!=0){
            Prompt.imprimir(b[x]);
        }
    }
    Prompt.linhaEmBranco();
    Prompt.separador();
}
}
