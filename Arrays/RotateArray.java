import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
      int[] nums={-1,-100,3,99};
      rotate(nums,2);
    }

    public static void rotate(int[] nums,int k){
        for(int i=0;i<k;i++){
            int l=nums.length-1;
            int temp=nums[0];
            nums[0]=nums[l];
            for(int j=0;j<l;j++) {
                int t = nums[j + 1];
                nums[j + 1] = temp;
                temp = t;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
