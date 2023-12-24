public class SquareRoot {

    public static void main(String[] args) {
       System.out.printf("%.2f",square(10,2));
    }

    public static double square(int n,int p){
        double a=0.0;
        int s=0;
        int e=n;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m==n) return m;
            else if(m*m>n){
                e=m-1;
                a=e;
            }
            else{
                s=m+1;
                a=s;
            }
        }
        double b=0.1;
        for(int i=0;i<p;i++){
            while(a*a<=n){
                a+=b;
            }
            a-=b;

            b/=10;
        }
        return a;
    }
}
