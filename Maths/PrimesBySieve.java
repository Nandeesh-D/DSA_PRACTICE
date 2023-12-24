public class PrimesBySieve {

    public static void main(String[] args) {
        int n=19;
        boolean[] a=new boolean[n+1];
        sieve(a,n);
    }

    public static void sieve(boolean[] a,int n){
        for(int i=2;i*i<=n;i++){
            if(!a[i]){
                for(int j=i*2;j<=n;j+=i){
                    a[j]=true;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(!a[i]) System.out.print(i+" ");
        }
    }
}
