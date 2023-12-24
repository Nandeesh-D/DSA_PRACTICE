import java.util.Arrays;

public class ReversingWords {
    public static void main(String[] args) {
            String s="  the       sky is blue     ";
        System.out.println(reverseWords(s));
        //System.out.println((int)(0.25*3)+1);
        //System.out.println(findSpecialInteger(new int[] {1,1,2,2,3,3,3,3}));
        System.out.println(minJumps(new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}  ));
    }

    public static String reverseWords(String s) {
         int l=s.length();
         String ans="";
         int i=0;
         while(i<l){
             while(i<l && s.charAt(i)==' ') i++;
             if(i>=l) break;
             int j=i;
             while(i<l && s.charAt(i)!=' ') i++;
             ans=" "+s.substring(j,i)+ans;
         }
         return  ans.substring(1);


    }

    public static int findSpecialInteger(int[] arr) {
        int l=(int)(0.25*arr.length);
        int c=0;
        int ce=-1;
        c=0;
        for(int i=1;i<arr.length;i++){
            if(c>l) return ce;
            if(ce==arr[i]){
                c++;
            }
            else{
                c=1;
                ce=arr[i];
            }
        }
        return ce;
    }

    public static int minJumps(int[] arr){
        // your code here
        int i=0;
        int steps=0;
        while(i<arr.length-1){
            if(arr[i]==0) return -1;
            else{
                i+=arr[i];
                steps++;
            }
        }
        return steps;
    }

}

