public class Ceil {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        System.out.println(ceil(nums,7));
    }

    public static int ceil(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target) return m;
            else if(nums[m]<target) s=m+1;
            else e=m-1;
        }
        return s;
    }
}
