import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={4,6,2,5,7,9,1,3,4,0,-5};
        System.out.println(Arrays.toString(result(arr,0,arr.length-1)));

    }

    public static int quick(int[]arr,int low,int high){
        int i=low;
        int j=high;
        int p=arr[low];
        while(i<j){
            while (arr[i]<=p && i<=high-1){
                i++;
            }
            while(arr[j]>p && j>=low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int t=arr[low];
        arr[low]=arr[j];
        arr[j]=t;
        return j;
    }

    public static int[] result(int[] arr,int low,int high){
        if(low<high){
            int p=quick(arr,low,high);
            result(arr,low,p-1);
            result(arr,p+1,high);
        }
        return arr;
    }
}
