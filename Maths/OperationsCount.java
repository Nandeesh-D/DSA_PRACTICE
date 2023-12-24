public class OperationsCount {
    public static void main(String[] args) {
        System.out.println(steps(10,10,0));
    }

    public static int steps(int a,int b,int c){
        if(a==0 || b==0) return c;
        else if(a>=b) {
            c++;
            a=a-b;
        }
        else {
            c++;
            b=b-a;
        }
        return steps(a,b,c);
    }
}
