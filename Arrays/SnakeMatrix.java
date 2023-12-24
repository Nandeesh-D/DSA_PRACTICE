import java.util.ArrayList;

public class SnakeMatrix {
    public static void main(String[] args) {
        int[][] matrix={{45, 48, 54},
                     {21, 89, 87},
                     {70, 78, 15}};
        ArrayList<Integer> a=snake(matrix);
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }

    }

    public static ArrayList<Integer> snake(int[][] matrix){
        int n=matrix.length;
        ArrayList<Integer> a=new ArrayList<Integer>(n+n);
        for(int i=0;i<n;i++){
            if(i%2==0) {
                for (int j = 0; j < n; j++) {
                    a.add(matrix[i][j]);
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                        a.add(matrix[i][j]);
                    }
                }
            }
        return a;
        }
}
