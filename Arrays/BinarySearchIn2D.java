public class BinarySearchIn2D {
    public static void main(String[] args) {
        int[][] arr={{1},{3}};
        System.out.println(searchMatrix(arr,2));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        //finding m and n values
        int n= matrix.length;
        int m=matrix[0].length;
        //applying binary search ny assuming 2d array as 1d array
        int s=0;
        int e= (m*n)-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int row=mid/m,col=mid%m;//position of each element
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
}
