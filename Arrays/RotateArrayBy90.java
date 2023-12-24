import java.util.Arrays;

public class RotateArrayBy90 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int[] i:matrix){
            System.out.println(Arrays.toString(i));
        }
    }

    private static void swap(int[][]arr,int a,int b) {
        int t=arr[a][b];
        arr[a][b]=arr[b][a];
        arr[b][a]=t;
    }
    private static void reverse(int[] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void rotate(int[][] matrix){
        int n=matrix.length;
        //transposing the matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j);
            }
        }

        //reversing the matrix
        for(int[] i:matrix){
            reverse(i);
        }
    }


}
