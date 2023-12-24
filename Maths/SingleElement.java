public class SingleElement {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,2,1,3,6,4};
        int r=0;
        for(int i=0;i<arr.length;i++){
             r=arr[i]^r;
        }
        System.out.println(r);

    }
}
