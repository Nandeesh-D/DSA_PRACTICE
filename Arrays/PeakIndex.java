public class PeakIndex {

    public static void main(String[] args) {
        int[] arr={1,3,1,3,5,6,4};
        System.out.println(binary(arr));
    }

    public static int binary(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[0]>arr[1]) return arr[0];
            else if(arr[1]>arr[0] && arr[2]<arr[1]) return arr[1];
            else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]) return arr[mid];
            else if(arr[mid]<arr[mid+1]) s=mid+1;
            else e=mid-1;

        }
        return -1;
    }
}
