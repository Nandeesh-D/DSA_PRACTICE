public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(-56));
    }

    public static int reverse(int x){
        int c=0;
        long ans=0;
        if(x<0) {
            c=1;
            x*=-1;
        }
        //reversing the number
        while(x>0){
            int r=x%10;
            ans=ans*10+r;
            x/=10;
        }
        if(ans>=Integer.MAX_VALUE || ans<=Integer.MIN_VALUE){
            return 0;
        }
        if(c==1) return (int)(-1*ans);
        return (int)ans;
    }
}
