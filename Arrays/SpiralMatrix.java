import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={{ 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                {13,14,15,16}
                };
        ArrayList<Integer> a=Spiral(matrix);
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    public static ArrayList<Integer> Spiral(int[][] matrix){
        ArrayList<Integer> a=new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        while(top<=bottom && left<=right  ){
            for(int i=left;i<=right;i++){
                a.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                a.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    a.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    a.add(matrix[i][left]);
                }
                left++;
            }
        }
        return a;
    }
}
