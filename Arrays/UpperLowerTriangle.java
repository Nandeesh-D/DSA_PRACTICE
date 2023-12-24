import java.util.ArrayList;

public class UpperLowerTriangle {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> sum(int[][] matrix,int n){
        ArrayList<Integer> a=new ArrayList<>(2);
        int up=0;
        int down=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j) up+=matrix[i][j];
                if(j<=i) down+=matrix[i][j];
            }
        }
        a.add(up);
        a.add(down);
        return a;

    }
}
