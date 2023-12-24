//problem:154
public class MinInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] arr={10,10,10,1,10};
        System.out.println(min(arr));
    }
    public static int min(int[] nums){
        int s=0;
        int e= nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[s]<nums[mid]){      //eliminating the right half and ans=nums[0]
                ans=Math.min(ans,nums[s]);
                s=mid+1;
            }
            else if(nums[mid]<nums[e]){  //eliminating the left half and ans=nums[mid]
                ans=Math.min(ans,nums[mid]);
                e=mid;
            }
            else{     //if nums[s]==nums[m] || nums[mid]==nums[e]
                ans=Math.min(ans,nums[mid]);
                s+=1;
            }
        }
        return ans;
    }
}
