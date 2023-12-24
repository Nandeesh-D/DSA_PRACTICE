public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,0,0,0,1,1,1};
        int k=3;
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>k) break;
                if(sum==k){
                    max=Math.max(max,j-i+1);
                    break;
                }
            }
        }
        System.out.println(max);
    }


}
