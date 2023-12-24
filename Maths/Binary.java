public class Binary {
    public static void main(String[] args) {
        int nums[]={-1,0,3,5,9,12};
        System.out.println(binary(nums,9));
    }

    public static int binary(int[] nums,int target){
        int s=0;
        int e=nums.length;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target) return m;
            else if(nums[m]>target) e=m-1;
            else s=m+1;
        }
        return -1;
    }
}
