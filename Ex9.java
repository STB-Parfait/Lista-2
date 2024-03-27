public class Ex9 {
    public static void main(String[] args){

        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];

        int x;


        Prompt.imprimir("Vetor 1");
        for(x=0;x<5;x++){
            a[x] = Prompt.lerInteiro();
        }
        Prompt.imprimir("Vetor 2");
        for(x=0;x<5;x++){
            b[x] = Prompt.lerInteiro();
        }

        //---

        for(x=0;x<5;x++){
            if(x==0||x==2||x==4){
                c[x] = a[x];
            }
            else{
                c[x] = b[x];
            }
        }

        //---

        Prompt.separador();
        Prompt.linhaEmBranco();
        for(x=0;x<5;x++){
            Prompt.imprimir(c[x]);
        }
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}
