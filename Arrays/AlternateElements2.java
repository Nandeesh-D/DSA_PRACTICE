package Arrays;

import java.util.Arrays;
//this need vectors;
public class AlternateElements2 {
    public static void main(String[] args) {
        //this array may have pos=neg | pos>neg | pos<neg
        int[] arr={-1,2,3,4,-3,1};
        System.out.println(Arrays.toString(AlternateSign(arr)));
    }

    public static int[] AlternateSign(int[] arr){
        int[] pos=new int[arr.length]; //to store +ve values
        int[] neg=new int[arr.length]; //to store +ve values
        int[] ans=new int[arr.length]; //answer array
        int j=0;
        int k=0;   //+ve and -ve arrays indexing helpers
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0) {
                pos[j]=arr[i];
                j++;
            }
            else{
                neg[k]=arr[i];
                k++;
            }
        }
        System.out.println(pos.length+" "+neg.length);
        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));

        if(pos.length>neg.length){      //finding which is shortest array
            for(int i=0;i<neg.length;i++){
                ans[2*i]=pos[i];
                ans[2*i+1]=neg[i];
            }
            int ind=neg.length*2;
            for(int i=neg.length;i<pos.length;i++){
                ans[ind]=pos[i];
                ind++;
            }

        }
        else {
            for(int i=0;i<pos.length;i++){
                ans[2*i]=pos[i];
                ans[2*i+1]=neg[i];
            }
            int ind=pos.length*2;
            for(int i=pos.length;i<neg.length;i++){
                ans[ind]=neg[i];
                ind++;
            }
        }
        return ans;
    }
}
