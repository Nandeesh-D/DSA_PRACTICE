public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        System.out.println(majority(nums));
    }

    public static int majority(int[] nums){
        int c=0;
        int e = 0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                c=1;
                e=nums[i];
            }
            else if(nums[i]==e) c++;
            else c--;
        }

        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==e) res++;
        }
        if(res>nums.length/2) return e;
        return -1;
    }
}
