package Arrays;
//problem: 1913
public class maxProductDifference {
    public static void main(String[] args) {
        int[] arr={5,6,2,7,4};
        //System.out.println(maxProductDifference(arr));
        int[] a={1, 4, 3, 2, 6, 7};
    }

    public static int maxProductDifference(int[] nums) {
        //find the largest,2nd largest element ,smallest and 2nd smallest elements from the nums;
        int large=0,secondlarge=0;
        int small=Integer.MAX_VALUE,secondSmall=Integer.MAX_VALUE;

        for(int i:nums){
            if(i>large){
                secondlarge=large;
                large=i;
            }
            else{
                secondlarge=Math.max(secondlarge,i);
            }

            if(i<small){
                secondSmall=small;
                small=i;
            }
            else{
                secondSmall=Math.min(secondSmall,i);
            }
        }
     return (large*secondlarge)-(small*secondSmall);
    }



}
