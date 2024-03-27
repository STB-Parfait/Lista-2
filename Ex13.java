public class Ex13 {
    public static void main(String[] args){
        int n = Prompt.lerInteiro();
        int x;
        int fib[] = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        for(x=2;x<n;x++){
            fib[x] = fib[x-1] + fib[x-2];
        }
        for(x=0;x<n;x++){
            Prompt.imprimir(fib[x]);
        }
    }
}
