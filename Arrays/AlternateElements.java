package Arrays;

import java.util.Arrays;

public class AlternateElements {
    public static void main(String[] args) {
        //time complexity - O(n)
        //space complexity - O(n)
        int[] nums={3,1,-1,-2};
        System.out.println(Arrays.toString(AlternateSign(nums)));
    }

    public static int[] AlternateSign(int[] nums){
        int[] ans=new int[nums.length];
        int p=0;
        int n=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                ans[p]=nums[i];
                p+=2;
            }
            else{
                ans[n]=nums[i];
                n+=2;
            }
        }
        return ans;
    }
}
