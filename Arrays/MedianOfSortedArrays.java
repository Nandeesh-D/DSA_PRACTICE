import java.util.Arrays;

public class MedianOfSortedArrays {
    public static void main(String[] args) {
        int[] a={1,3,4,4,5};
        int[] b={1,2,3,4,4};
        System.out.println(medain(a,b));
        System.out.println(median2(a,b));
    }


    public static double medain(int[] nums1,int[] nums2){
        int m=nums1.length,n=nums2.length;
        int[] ans=new int[m+n];
        //merging the 2 arrays
        int min=Math.min(m,n);
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                ans[k]=nums1[i];
                i++;
                k++;
            }
            else{
                ans[k]=nums2[j];
                j++;
                k++;
            }
        }

        while(i<m){
            ans[k]=nums1[i];
            i++;
            k++;
        }

        while(j<n){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(ans));
        double median=0;
        int ind=(ans.length)/2;
        if((ans.length)%2==0){
            median=(double)(ans[ind-1]+ans[ind])/2;
        }
        else{
            median=ans[ind];
        }

        return median;
    }


    //second approach
    public static double median2(int[] nums1,int[]nums2){
        int m=nums1.length,n=nums2.length;
        int[] ans=new int[m+n];
        int i=0,j=0;
        for(int k=0;k<m+n;k++){
            if(k<m){
                ans[k]=nums1[i];
                i++;
            }
            else{
                ans[k]=nums2[j];
                j++;
            }
        }
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        int ind=(ans.length)/2;
        if((ans.length)%2==0){
            return (double)(ans[ind-1]+ans[ind])/2;
        }
        return ans[ind];

    }
}
