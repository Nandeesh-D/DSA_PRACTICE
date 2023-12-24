import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
            int n=15;
//        System.out.println(fizzBuzz(n));
//        System.out.println(largestGoodInteger("2300019"));
//        System.out.println(numberOfMatches(14));
//        System.out.println(totalMoney(10));
//        System.out.println(largestOddNumber("22"));
        System.out.println(minMoves(19,2));

    }
    public static List<String> fizzBuzz(int n) {
        List<String> ans =new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                ans.add("FizzBuzz");
            }
            else if(i%3==0){
                ans.add("Fizz");
            }
            else if(i%5==0){
                ans.add("Buzz");
            }
            else{
                ans.add(i+"");
            }
        }
        return ans;
    }

    public static String largestGoodInteger(String num) {
        String s[]={"000","111","222","333","444","555","666","777","888","999"};
        int max=-1;
        for(int i=0;i<num.length()-2;i++){
            int ind=num.charAt(i)-'0';
            if(num.substring(i,i+3).equals(s[ind])){
                if(ind>max){
                    max=ind;
                }
            }

        }
        return s[max];
    }

    public static int numberOfMatches(int n) {
       int matches=0;
       int adv=0;
       while(adv!=1){
           matches+=n/2;
           if(n%2==0){
               adv=n/2;
           }
           else{
               adv=(n/2)+(n%2);
           }
           n=adv;
       }
       return matches;
    }

    public static int totalMoney(int n) {
            int total=0;
            int m=0;
            for(int i=1;i<=n;i++){
                if(i%7==0){
                    total+=(m+7);
                    m+=1;
                }
                else{
                    total+=(m+(i%7));
                }


            }
            return total;
    }
    public static String largestOddNumber(String num) {
            int n=num.length();
            int i=n-1;
            while(i>=0){
                if((int)num.charAt(i)%2==1){
                    return num.substring(0,i);
                }
                i--;
            }
            return "";
    }

    public static int minMoves(int target, int maxDoubles) {
         int moves=0;
         while(target>1){
             int n=target/2;
             if(maxDoubles>0 && n*2==target){
                 target/=2;
                 maxDoubles--;
                 moves++;
             }
             else{
                 target--;
                 moves++;
             }
         }
         return moves;
    }
}
