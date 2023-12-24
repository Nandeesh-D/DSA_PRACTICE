import java.util.Arrays;

public class LongestSubsequence {
    public static void main(String[] args) {
        int[] nums={102,5,100,2,101,4,3,1};
        Arrays.sort(nums);
        System.out.println(sequence(nums));
    }

    public static int sequence(int[] nums){
        int maxlen=1;
        int lastsmall=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastsmall){
                cnt+=1;
                lastsmall=nums[i];
            } else if (nums[i] != lastsmall) {
                cnt=1;
                lastsmall=nums[i];
            }
            maxlen=Math.max(cnt,maxlen);
        }
        return maxlen;
    }
}

