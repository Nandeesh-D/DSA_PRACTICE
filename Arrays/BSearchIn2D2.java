public class BSearchIn2D2 {
    public static void main(String[] args) {
        int[][] arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=1;
        System.out.println(searchMatrix(arr,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        int row=0,col=n;
        while(row<=m && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
         return false;
    }
}
