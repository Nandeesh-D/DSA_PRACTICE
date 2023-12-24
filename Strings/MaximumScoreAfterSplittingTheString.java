package Strings;

public class MaximumScoreAfterSplittingTheString {
    public static void main(String[] args) {
            String s="011101";
        System.out.println(maxScore(s));
    }

    public static int maxScore(String s) {
         int n =s.length();
         int maxScore=Integer.MIN_VALUE;

         for(int i=1;i<n;i++){
             int zeroes=0;
             int ones=0;
             //checking for 0's in left part of array
             for(int j=0;j<i;j++){
                 if(s.charAt(j)=='0'){
                     zeroes++;
                 }
             }
             //checking for 1's in the right part of string
             for(int k=i;k<n;k++){
                 if(s.charAt(k)=='1'){
                     ones++;
                 }
             }
             if((zeroes+ones)>maxScore){
                 maxScore=zeroes+ones;
             }
         }
         return maxScore;
    }
}
