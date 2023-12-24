//Problem:153
public class MinInRotatedSortedArray {
    public static void main(String[] args) {
            int[] arr={2,0,1};
        System.out.println(min(arr));
    }
    public static int min(int[] nums){
        int s=0;
        int e= nums.length-1;
        int l=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[l]) s=mid+1;
            else e=mid-1;
        }
        return nums[s];
    }
}
